package pe.bbva.aso.servicios.modifyindicator.dao.impl;

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
import pe.bbva.aso.servicios.modifyindicator.dao.IModifyIndicatorAPGRestClient;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

@Repository
@Scope("prototype")
public class ModifyIndicatorAPGRestClientImpl implements IModifyIndicatorAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseModifyIndicator modifyIndicator(String customerId,String indicatorId,String isActive, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyIndicatorAPGRestClientImpl modifyIndicator :inicio");
		logger.debug("ModifyIndicatorAPGRestClientImpl modifyIndicator: parameters request: customerId=" + customerId + ", indicatorId=" + indicatorId + ", isActive=" + isActive);
		
		String pathServicio = env.getProperty("paas.servicio.rest.modifyindicator.url");
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("isActive", isActive);
		parametrosUrl.put("customer-id", customerId);
		parametrosUrl.put("indicator-id", indicatorId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(parametrosUrl,headers);
		ParameterizedTypeReference<ResponseModifyIndicator> typeRef = new ParameterizedTypeReference<ResponseModifyIndicator>() {
		};
	
		ResponseEntity<ResponseModifyIndicator> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.PATCH,
							httpEntity, typeRef,parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.MODIFYINDICATOR,e,e.getCodigo(),e.getMessage());
		}
		logger.debug("ModifyIndicatorAPGRestClientImpl modifyIndicator: parameters response: " + json.toJson(respuesta));
		logger.debug("ModifyIndicatorAPGRestClientImpl modifyIndicator :fin");
		return respuesta.getBody();		
	}	
}
