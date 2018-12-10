package pe.bbva.servicios.biometricclient.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;


public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	

	public AuthenticateResponse obtenerBiometrico(AuthenticateRequest request) throws ServiceExceptionBBVA {
		logger.debug("BaseController obtenerBiometrico: inicio");
		AuthenticateResponse response = this.ejecutar(request);
		logger.debug("BaseController obtenerBiometrico: fin");
		return response;
	}
	
	abstract AuthenticateResponse ejecutar(AuthenticateRequest request) throws ServiceExceptionBBVA ;
	
}
