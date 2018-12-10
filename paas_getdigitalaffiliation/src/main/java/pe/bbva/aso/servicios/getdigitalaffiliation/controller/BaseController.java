package pe.bbva.aso.servicios.getdigitalaffiliation.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseGetDigitalAffiliation getDigitalAffiliation(RequestGetDigitalAffiliation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCustomersController getDigitalAffiliation: inicio");
		ResponseGetDigitalAffiliation response = this.ejecutar(filtro, tsec);
		logger.debug("ListCustomersController getDigitalAffiliation: fin");
		return response;
	}
	
	abstract ResponseGetDigitalAffiliation ejecutar(RequestGetDigitalAffiliation filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
