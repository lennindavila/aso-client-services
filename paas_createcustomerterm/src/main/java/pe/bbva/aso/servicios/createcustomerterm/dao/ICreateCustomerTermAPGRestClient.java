package pe.bbva.aso.servicios.createcustomerterm.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;

public interface ICreateCustomerTermAPGRestClient {	
	ResponseCreateCustomerTerm createCustomerTerm(RequestCreateCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA;
}
