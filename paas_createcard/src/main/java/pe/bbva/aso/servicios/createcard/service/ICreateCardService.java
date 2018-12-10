package pe.bbva.aso.servicios.createcard.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;

public interface ICreateCardService {
	public ResponseCreateCard createCard(RequestCreateCard filtro, String tsec)throws ServiceExceptionBBVA;	
}
