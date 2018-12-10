package pe.bbva.aso.servicios.listcustomerindicators.dao.impl;

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
import pe.bbva.aso.servicios.listcustomerindicators.dao.IListCustomerIndicatorsAPGRestClient;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;


@Repository
@Scope("prototype")
public class ListCustomerIndicatorsAPGRestClientImpl implements IListCustomerIndicatorsAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
	
	@Autowired
	protected Environment env;	
	
	@Override
	public ResponseCustomerIndicators listCustomerIndicators(String customerId, String tsec) throws ServiceExceptionBBVA {
		logger.debug("listCustomerIndicators :inicio");
		String pathServicio = env.getProperty("paas.servicio.rest.listcustomerindicators.url");
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer-id", customerId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseCustomerIndicators> typeRef = new ParameterizedTypeReference<ResponseCustomerIndicators>() {
		};
	
		ResponseEntity<ResponseCustomerIndicators> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.GET,
							httpEntity, typeRef, parametrosUrl);
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(e,"Error al intentar Conectar con Servicios ASO");
		}
		logger.debug("listCustomerIndicators :fin");
		return respuesta.getBody();
	}	
}
