package pe.bbva.aso.servicios.createcustomer.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;

public interface ICreateCustomerAPGRestClient {	
	ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro, String tsec) throws ServiceExceptionBBVA;
}
