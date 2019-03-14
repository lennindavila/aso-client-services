package pe.bbva.aso.servicios.createcredentialsenrollments.dao.impl;

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
import pe.bbva.aso.servicios.createcredentialsenrollments.dao.ICreateCredentialsEnrollmentsAPGRestClient;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;

@Repository
@Scope("prototype")
public class CreateCredentialsEnrollmentsAPGRestClientImpl implements ICreateCredentialsEnrollmentsAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro, String tsec,String contactID) throws ServiceExceptionBBVA {
		logger.debug("CreateCredentialsEnrollmentsAPGRestClientImpl createCredentialEnrollment: inicio");
		logger.debug("CreateCredentialsEnrollmentsAPGRestClientImpl createCredentialEnrollment: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.createcredentialsenrollments.url");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		headers.set("contactID", contactID);		
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseCredentialsEnrollments> typeRef = new ParameterizedTypeReference<ResponseCredentialsEnrollments>() {
		};

		ResponseEntity<ResponseCredentialsEnrollments> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef);										
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.CREATECREDENTIALSENROLLMENTS,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("CreateCredentialsEnrollmentsAPGRestClientImpl createCredentialEnrollment: parameters response: " + json.toJson(respuesta));
		logger.debug("CreateCredentialsEnrollmentsAPGRestClientImpl createCredentialEnrollment: fin");
		return respuesta.getBody();	
	}	
}
