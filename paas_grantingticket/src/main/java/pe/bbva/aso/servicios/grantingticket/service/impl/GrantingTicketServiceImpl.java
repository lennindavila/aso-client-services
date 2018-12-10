package pe.bbva.aso.servicios.grantingticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.grantingticket.dao.IGrantingTicketAPGRestClient;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;
import pe.bbva.aso.servicios.grantingticket.service.IGrantingTicketService;

@Service
@Scope("prototype")
public class GrantingTicketServiceImpl  implements IGrantingTicketService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGrantingTicketAPGRestClient grantingTicketAPGRestClient;

	@Override
	public String grantingTicket(RequestGrantingTicket filtro) {
		String customerId = ""; /*filtro.getCustomerId();*/		
		String respuesta = grantingTicketAPGRestClient.grantingTicket(filtro);
		return respuesta;
	}
}
