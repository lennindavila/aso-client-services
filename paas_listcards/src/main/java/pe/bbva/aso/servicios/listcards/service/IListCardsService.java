package pe.bbva.aso.servicios.listcards.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;


public interface IListCardsService {
	public ResponseListCards listCards(RequestListCards filtro, String tsec)throws ServiceExceptionBBVA;	
}
