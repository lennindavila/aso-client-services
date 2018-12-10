package pe.bbva.aso.servicios.createrqcardstampingorders.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateRqCardStampingOrdersController createRqCardStampingOrders: inicio");
		ResponseCreateRqCardStampingOrders response = this.ejecutar(filtro, tsec);
		logger.debug("CreateRqCardStampingOrdersController createRqCardStampingOrders: fin");
		return response;
	}
	
	abstract ResponseCreateRqCardStampingOrders ejecutar(RequestCreateRqCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
