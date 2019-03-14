package pe.bbva.aso.servicios.createcardstampingorders.dao.impl;

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
import pe.bbva.aso.servicios.createcardstampingorders.dao.ICreateCardStampingOrdersAPGRestClient;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;

@Repository
@Scope("prototype")
public class CreateCardStampingOrdersAPGRestClientImpl implements ICreateCardStampingOrdersAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardStampingOrdersAPGRestClientImpl createCardStampingOrders: inicio");
		logger.debug("CreateCardStampingOrdersAPGRestClientImpl createCardStampingOrders: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createcardstampingorders.url");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseCreateCardStampingOrders> typeRef = new ParameterizedTypeReference<ResponseCreateCardStampingOrders>() {
		};
		
		ResponseEntity<ResponseCreateCardStampingOrders> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef);					
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATECARDSTAMPINGORDERS,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateCardStampingOrdersAPGRestClientImpl createCardStampingOrders: parameters response: " + json.toJson(respuesta));
		logger.debug("CreateCardStampingOrdersAPGRestClientImpl createCardStampingOrders: fin");
		return respuesta.getBody();	
		
	}	
}
