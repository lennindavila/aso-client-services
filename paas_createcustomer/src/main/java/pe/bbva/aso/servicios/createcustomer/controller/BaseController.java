package pe.bbva.aso.servicios.createcustomer.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCustomerController createCustomer: inicio");
		ResponseCreateCustomer response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCustomerController createCustomer: fin");
		return response;
	}
	
	abstract ResponseCreateCustomer ejecutar(RequestCreateCustomer filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
