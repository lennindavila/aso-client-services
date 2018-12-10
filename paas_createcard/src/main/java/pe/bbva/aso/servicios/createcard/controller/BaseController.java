package pe.bbva.aso.servicios.createcard.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateCard createCard(RequestCreateCard filtro,String tsec)throws ServiceExceptionBBVA {
		logger.debug("CreateCardController consultar: inicio");
		ResponseCreateCard response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCardController: fin");
		return response;
	}
	
	abstract ResponseCreateCard ejecutar(RequestCreateCard filtro,String tsec) throws ServiceExceptionBBVA;
	
}
