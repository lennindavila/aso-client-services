package pe.bbva.aso.servicios.modifycardpin.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.dto.ResponseModifyCardPin;

public interface IModifyCardPinService {
	public ResponseModifyCardPin modifyCardPin(String cardId,RequestModifyCardPin filtro, String tsec) throws ServiceExceptionBBVA;	
}
