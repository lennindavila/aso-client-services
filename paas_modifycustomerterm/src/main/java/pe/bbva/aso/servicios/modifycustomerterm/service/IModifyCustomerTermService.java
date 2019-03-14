package pe.bbva.aso.servicios.modifycustomerterm.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;

public interface IModifyCustomerTermService {
	public ResponseModifyCustomerTerm modifyCustomerTerm(RequestModifyCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA;	
}
