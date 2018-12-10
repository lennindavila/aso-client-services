package pe.bbva.aso.servicios.grantingticket.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.grantingticket.controller.validator.GrantingTicketValidator;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;
import pe.bbva.aso.servicios.grantingticket.service.IGrantingTicketService;

@Controller
@Scope("prototype")
public class GrantingTicketController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IGrantingTicketService grantingTicketService;
	
	@Autowired
	private GrantingTicketValidator grantingTicketValidator;	

	@Override
	String ejecutar(RequestGrantingTicket filtro) {
		logger.debug("ejecutar: inicio");
		
		/*Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.grantingTicketValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, ConfigProperty.getProperty("atm.respuesta.error.general.codigo"),
					ConfigProperty.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}*/
		
		String response = this.grantingTicketService.grantingTicket(filtro);
		logger.debug("ejecutar: fin");
		return response;
	}
}
