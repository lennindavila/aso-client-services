package pe.bbva.aso.servicios.modifycardactivation.dao.impl;

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
import pe.bbva.aso.servicios.modifycardactivation.dao.IModifyCardActivationAPGRestClient;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

@Repository
@Scope("prototype")
public class ModifyCardActivationAPGRestClientImpl implements IModifyCardActivationAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseModifyCardActivation modifyCardActivation(String cardId,String activationId,String isActive, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardActivationAPGRestClientImpl modifyCardActivation :inicio");
		logger.debug("ModifyCardActivationAPGRestClientImpl modifyCardActivation: parameters request: cardId=" + cardId + ", activationId=" + activationId + ", isActive=" + isActive);
		
		String pathServicio = env.getProperty("paas.servicio.rest.modifycardactivation.url");
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("card-id", cardId);
		parametrosUrl.put("activation-id", activationId);
		parametrosUrl.put("isActive", isActive);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseModifyCardActivation> typeRef = new ParameterizedTypeReference<ResponseModifyCardActivation>(){};
		
		ResponseEntity<ResponseModifyCardActivation> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado.exchange(pathServicio, HttpMethod.PATCH,httpEntity, typeRef, parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.MODIFYCARDACTIVATION,e,e.getCodigo(),e.getMessage());
		}
		logger.debug("ModifyCardActivationAPGRestClientImpl modifyCardActivation: parameters response: " + json.toJson(respuesta));
		logger.debug("ModifyCardActivationAPGRestClientImpl modifyCardActivation :fin");
		return respuesta.getBody();
	}	
}
