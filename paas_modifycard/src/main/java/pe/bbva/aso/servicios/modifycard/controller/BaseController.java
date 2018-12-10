package pe.bbva.aso.servicios.modifycard.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	public ResponseModifyCard modifyCard(RequestModifyCard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("BaseController modifyCard: inicio");
		ResponseModifyCard response = this.ejecutar(filtro, tsec);
		logger.debug("BaseController modifyCard: fin");
		return response;
	}
	
	abstract ResponseModifyCard ejecutar(RequestModifyCard filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
