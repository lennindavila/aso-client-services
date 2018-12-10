package pe.bbva.aso.servicios.listcards.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;

public interface IListCardsAPGRestClient {	
	ResponseListCards listCards(RequestListCards filtro, String tsec)throws ServiceExceptionBBVA;
}
