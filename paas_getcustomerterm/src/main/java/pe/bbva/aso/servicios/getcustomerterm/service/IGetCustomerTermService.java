package pe.bbva.aso.servicios.getcustomerterm.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.dto.ResponseGetCustomerTerm;

public interface IGetCustomerTermService {
	public ResponseGetCustomerTerm getCustomerTerm(RequestGetCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA;	
}
