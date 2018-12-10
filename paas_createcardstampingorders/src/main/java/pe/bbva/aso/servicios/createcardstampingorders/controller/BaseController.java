package pe.bbva.aso.servicios.createcardstampingorders.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardStampingOrdersController consultar: inicio");
		ResponseCreateCardStampingOrders response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCardStampingOrdersController: fin");
		return response;
	}
	
	abstract ResponseCreateCardStampingOrders ejecutar(RequestCreateCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
