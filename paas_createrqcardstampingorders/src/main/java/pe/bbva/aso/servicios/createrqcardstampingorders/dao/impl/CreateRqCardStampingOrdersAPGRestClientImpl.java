package pe.bbva.aso.servicios.createrqcardstampingorders.dao.impl;

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
import pe.bbva.aso.servicios.createrqcardstampingorders.dao.ICreateRqCardStampingOrdersAPGRestClient;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;

@Repository
@Scope("prototype")
public class CreateRqCardStampingOrdersAPGRestClientImpl implements ICreateRqCardStampingOrdersAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateRqCardStampingOrdersAPGRestClientImpl createRqCardStampingOrders: inicio");
		logger.debug("CreateRqCardStampingOrdersAPGRestClientImpl createRqCardStampingOrders: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createrqcardstampingorders.url");		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseCreateRqCardStampingOrders> typeRef = new ParameterizedTypeReference<ResponseCreateRqCardStampingOrders>() {
		};		
		
		ResponseEntity<ResponseCreateRqCardStampingOrders> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef);			
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATERQCARDSTAMPINGORDERS,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateRqCardStampingOrdersAPGRestClientImpl createRqCardStampingOrders: parameters response: " + json.toJson(respuesta));
		logger.debug("CreateRqCardStampingOrdersAPGRestClientImpl createRqCardStampingOrders: fin");
		return respuesta.getBody();
	}	
}
