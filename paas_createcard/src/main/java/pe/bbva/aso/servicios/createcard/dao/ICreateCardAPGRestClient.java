package pe.bbva.aso.servicios.createcard.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;

public interface ICreateCardAPGRestClient {	
	ResponseCreateCard createCard(RequestCreateCard filtro, String tsec) throws ServiceExceptionBBVA;
}
