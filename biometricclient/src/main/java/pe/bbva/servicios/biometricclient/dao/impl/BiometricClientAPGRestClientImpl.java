package pe.bbva.servicios.biometricclient.dao.impl;

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
import pe.bbva.servicios.biometricclient.dao.IBiometricClientAPGRestClient;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;

@Repository
@Scope("prototype")
public class BiometricClientAPGRestClientImpl implements IBiometricClientAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticadoNoProxy")
	private CustomRestTemplate restTemplateAutenticado;
	
	@Autowired
	protected Environment env;	

	@Override
	public AuthenticateResponse obtenerBiometrico(AuthenticateRequest request) throws ServiceExceptionBBVA {
		logger.debug("BiometricClientAPGRestClientImpl obtenerBiometrico :inicio ");
		
		String pathServicio = env.getProperty("servicio.rest.biometrico.url");		
		logger.info("pathServicio " + pathServicio);
			
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);		
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(request,headers);
		ParameterizedTypeReference<AuthenticateResponse> typeRef = new ParameterizedTypeReference<AuthenticateResponse>() {
		};
		ResponseEntity<AuthenticateResponse> respuesta = null;
		
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef);			
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(e,"Error al intentar Conectar con Servicio");
		}
		logger.debug("BiometricClientAPGRestClientImpl obtenerBiometrico :fin ");
		return respuesta.getBody();
	}
	
	
}
