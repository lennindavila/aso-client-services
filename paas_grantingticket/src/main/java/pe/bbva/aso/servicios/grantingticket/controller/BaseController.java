package pe.bbva.aso.servicios.grantingticket.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public String consultar(RequestGrantingTicket filtro) {
		logger.debug("GrantingTicketController consultar: inicio");
		String response = this.ejecutar(filtro);
		logger.debug("GrantingTicketController: fin");
		return response;
	}
	
	abstract String ejecutar(RequestGrantingTicket filtro) ;
	
}
