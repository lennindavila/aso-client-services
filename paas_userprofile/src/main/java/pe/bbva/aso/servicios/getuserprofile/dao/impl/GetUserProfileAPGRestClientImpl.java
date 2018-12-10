package pe.bbva.aso.servicios.getuserprofile.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.getuserprofile.dao.IGetUserProfileAPGRestClient;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;

@Repository
@Scope("prototype")
public class GetUserProfileAPGRestClientImpl implements IGetUserProfileAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	@Override
	public ResponseGetUserProfile getUserProfile(RequestGetUserProfile filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("getUserProfile :inicio");
		String pathServicio = env.getProperty("paas.servicio.rest.modifycardpin.url");
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("card-id", filtro.getCardId());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseGetUserProfile> typeRef = new ParameterizedTypeReference<ResponseGetUserProfile>() {
		};
		
		ResponseEntity<ResponseGetUserProfile> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.PUT,
							httpEntity, typeRef,parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(e,"Error al intentar Conectar con Servicios ASO");
		}
		logger.debug("getUserProfile :fin");
		return respuesta.getBody();
	}	
}
