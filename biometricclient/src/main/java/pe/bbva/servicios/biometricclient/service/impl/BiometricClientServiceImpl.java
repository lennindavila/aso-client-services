package pe.bbva.servicios.biometricclient.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.servicios.biometricclient.dao.IBiometricClientAPGRestClient;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;
import pe.bbva.servicios.biometricclient.service.IBiometricClientService;

@Service
@Scope("prototype")
public class BiometricClientServiceImpl  implements IBiometricClientService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired 
	private IBiometricClientAPGRestClient biometricClientAPGRestClient;
	
	public AuthenticateResponse obtenerBiometrico(AuthenticateRequest request) throws ServiceExceptionBBVA {
		logger.debug("BiometricClientServiceImpl obtenerBiometrico: inicio");
		AuthenticateResponse respuesta = biometricClientAPGRestClient.obtenerBiometrico(request);
		logger.debug("BiometricClientServiceImpl obtenerBiometrico: fin");
		return respuesta;
	}

	
}
