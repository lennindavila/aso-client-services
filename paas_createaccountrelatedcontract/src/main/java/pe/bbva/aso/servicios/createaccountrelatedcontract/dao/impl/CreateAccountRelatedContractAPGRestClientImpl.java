package pe.bbva.aso.servicios.createaccountrelatedcontract.dao.impl;

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
import pe.bbva.aso.servicios.createaccountrelatedcontract.dao.ICreateAccountRelatedContractAPGRestClient;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;

@Repository
@Scope("prototype")
public class CreateAccountRelatedContractAPGRestClientImpl implements ICreateAccountRelatedContractAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateAccountRelatedContractAPGRestClientImpl createAccountRelatedContract: inicio");
		logger.debug("CreateAccountRelatedContractAPGRestClientImpl createAccountRelatedContract: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createaccountrelatedcontract.url");		
			
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("account-id", filtro.getAccountId());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseCreateAccountRelatedContract> typeRef = new ParameterizedTypeReference<ResponseCreateAccountRelatedContract>() {
		};
		
		ResponseEntity<ResponseCreateAccountRelatedContract> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado.exchange(pathServicio, 
															  HttpMethod.POST,
															  httpEntity, 
															  typeRef, 
															  parametrosUrl);		
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATEACCOUNTRELATEDCONTRACT,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateAccountRelatedContractAPGRestClientImpl createAccountRelatedContract: parameters response: " + json.toJson(respuesta));
		logger.debug("CreateAccountRelatedContractAPGRestClientImpl createAccountRelatedContract: fin");
		return respuesta.getBody();
		
	}	
}
