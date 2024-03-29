package pe.bbva.aso.servicios.modifycard.dao.impl;

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

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.enumerators.ServiceNameEnum;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.modifycard.dao.IModifyCardAPGRestClient;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;

@Repository
@Scope("prototype")
public class ModifyCardAPGRestClientImpl implements IModifyCardAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();
	
	@Override
	public ResponseModifyCard modifyCard(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardAPGRestClientImpl modifyCard :inicio");
		logger.debug("ModifyCardAPGRestClientImpl modifyCard: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.modifycard.url");		

		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("card-id", filtro.getCardId());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseModifyCard> typeRef = new ParameterizedTypeReference<ResponseModifyCard>() {
		};
		
		ResponseEntity<ResponseModifyCard> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.PATCH,
							httpEntity, typeRef,parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.MODIFYCARD,e,e.getCodigo(),e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}
		logger.debug("ModifyCardAPGRestClientImpl modifyCard: parameters response: " + json.toJson(respuesta));
		logger.debug("ModifyCardAPGRestClientImpl modifyCard :fin");
		return respuesta.getBody();
	}	
}
