package pe.bbva.aso.servicios.createcustomer.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;

public interface ICreateCustomerService {
	public ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro, String tsec) throws ServiceExceptionBBVA;	
}
