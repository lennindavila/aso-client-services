package pe.bbva.aso.servicios.createcredentialsenrollments.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCredentialsEnrollmentsController createCredentialEnrollment: inicio");
		ResponseCredentialsEnrollments response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCredentialsEnrollmentsController: fin");
		return response;
	}
	
	abstract ResponseCredentialsEnrollments ejecutar(RequestCredentialsEnrollments filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
