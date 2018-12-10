package pe.bbva.aso.servicios.listcards.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseListCards listCards(RequestListCards filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCardsController listCards: inicio");
		ResponseListCards response = this.ejecutar(filtro, tsec);
		logger.debug("ListCardsController listCards: fin");
		return response;
	}
	
	abstract ResponseListCards ejecutar(RequestListCards filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
