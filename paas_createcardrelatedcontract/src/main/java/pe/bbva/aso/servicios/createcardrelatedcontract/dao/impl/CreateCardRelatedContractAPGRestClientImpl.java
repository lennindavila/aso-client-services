package pe.bbva.aso.servicios.createcardrelatedcontract.dao.impl;

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
import pe.bbva.aso.servicios.createcardrelatedcontract.dao.ICreateCardRelatedContractAPGRestClient;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;

@Repository
@Scope("prototype")
public class CreateCardRelatedContractAPGRestClientImpl implements ICreateCardRelatedContractAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardRelatedContractAPGRestClientImpl createCardRelatedContract: inicio");
		logger.debug("CreateCardRelatedContractAPGRestClientImpl createCardRelatedContract: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createcardrelatedcontract.url");	
	
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("card-id", filtro.getCardId());	
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseCreateCardRelatedContract> typeRef = new ParameterizedTypeReference<ResponseCreateCardRelatedContract>() {
		};
				
		ResponseEntity<ResponseCreateCardRelatedContract> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef,parametrosUrl);				
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATECARDRELATEDCONTRACT,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateCardRelatedContractAPGRestClientImpl createCardRelatedContract: parameters response: " + json.toJson(respuesta));
		logger.debug("createCardRelatedContract :fin");
		return respuesta.getBody();		
	}	
}
