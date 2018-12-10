package pe.bbva.aso.servicios.modifycardpin.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.dto.ResponseModifyCardPin;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyCardPin modifyCardPin(String cardId,RequestModifyCardPin filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardController modifyCardPin: inicio");
		ResponseModifyCardPin response = this.ejecutar(cardId,filtro, tsec);
		logger.debug("ModifyCardController modifyCardPin: fin");
		return response;
	}
	
	abstract ResponseModifyCardPin ejecutar(String cardId,RequestModifyCardPin filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
