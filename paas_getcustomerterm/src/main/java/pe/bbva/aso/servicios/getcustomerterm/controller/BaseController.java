package pe.bbva.aso.servicios.getcustomerterm.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.dto.ResponseGetCustomerTerm;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseGetCustomerTerm getCustomerTerm(RequestGetCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetCustomerTermController getCustomerTerm: inicio");
		ResponseGetCustomerTerm response = this.ejecutar(filtro, tsec);
		logger.debug("GetCustomerTermController getCustomerTerm: fin");
		return response;
	}
	
	abstract ResponseGetCustomerTerm ejecutar(RequestGetCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
