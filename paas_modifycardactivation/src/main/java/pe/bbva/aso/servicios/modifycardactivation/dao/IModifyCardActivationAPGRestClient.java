package pe.bbva.aso.servicios.modifycardactivation.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

public interface IModifyCardActivationAPGRestClient {	
	ResponseModifyCardActivation modifyCardActivation(String cardId,String activationId,String isActive, String tsec) throws ServiceExceptionBBVA;
}
