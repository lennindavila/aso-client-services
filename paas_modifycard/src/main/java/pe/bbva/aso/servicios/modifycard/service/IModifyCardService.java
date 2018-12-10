package pe.bbva.aso.servicios.modifycard.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;

public interface IModifyCardService {
	public ResponseModifyCard modifyCard(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA;	
}
