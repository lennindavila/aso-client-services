package pe.bbva.aso.servicios.grantingticket.dao;

import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;

public interface IGrantingTicketAPGRestClient {	
	String grantingTicket(RequestGrantingTicket filtro);
}
