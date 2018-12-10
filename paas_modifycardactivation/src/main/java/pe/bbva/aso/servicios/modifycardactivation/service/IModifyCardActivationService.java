package pe.bbva.aso.servicios.modifycardactivation.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

public interface IModifyCardActivationService {
	public ResponseModifyCardActivation modifyCardActivation(RequestModifyCardActivation filtro, String tsec) throws ServiceExceptionBBVA;	
}
