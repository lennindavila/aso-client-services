package pe.bbva.aso.servicios.createsecurecontact.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateSecureContact createSecureContact(RequestCreateSecureContact filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateSecureContactController createSecureContact: inicio");
		ResponseCreateSecureContact response = this.ejecutar(filtro, tsec);
		logger.debug("CreateSecureContactController createSecureContact: fin");
		return response;
	}
	
	abstract ResponseCreateSecureContact ejecutar(RequestCreateSecureContact filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
