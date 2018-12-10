package pe.bbva.aso.servicios.createcustomerterm.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;

public interface ICreateCustomerTermService {
	public ResponseCreateCustomerTerm createCustomerTerm(RequestCreateCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA;	
}
