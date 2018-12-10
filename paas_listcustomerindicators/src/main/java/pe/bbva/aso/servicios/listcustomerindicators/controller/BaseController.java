package pe.bbva.aso.servicios.listcustomerindicators.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCustomerIndicators listCustomerIndicators(RequestListCustomersIndicators filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCustomerIndicatorsController listCustomerIndicators: inicio");
		ResponseCustomerIndicators response = this.ejecutar(filtro, tsec);
		logger.debug("ListCustomerIndicatorsController listCustomerIndicators: fin");
		return response;
	}
	
	abstract ResponseCustomerIndicators ejecutar(RequestListCustomersIndicators filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
