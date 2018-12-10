package pe.bbva.aso.servicios.createcustomerterm.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateCustomerTerm createCustomerTerm(RequestCreateCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCustomerTermController createCustomerTerm: inicio");
		ResponseCreateCustomerTerm response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCustomerTermController createCustomerTerm: fin");
		return response;
	}
	
	abstract ResponseCreateCustomerTerm ejecutar(RequestCreateCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
