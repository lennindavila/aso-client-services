package pe.bbva.aso.servicios.createcustomer.dao.impl;

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
import pe.bbva.aso.servicios.createcustomer.dao.ICreateCustomerAPGRestClient;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;

@Repository
@Scope("prototype")
public class CreateCustomerAPGRestClientImpl implements ICreateCustomerAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCustomerAPGRestClientImpl createCustomer: inicio");
		logger.debug("CreateCustomerAPGRestClientImpl createCustomer: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createcustomer.url");		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		
		HttpEntity<RequestCreateCustomer> httpEntity = new HttpEntity<RequestCreateCustomer>(filtro,headers);
		ParameterizedTypeReference<ResponseCreateCustomer> typeRef = new ParameterizedTypeReference<ResponseCreateCustomer>() {
		};
		
		ResponseEntity<ResponseCreateCustomer> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,httpEntity, typeRef);			
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATECUSTOMER,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateCustomerAPGRestClientImpl createCustomer: parameters response: " + json.toJson(respuesta));
		logger.debug("CreateCustomerAPGRestClientImpl createCustomer: fin");
		return respuesta.getBody();
	}
}
