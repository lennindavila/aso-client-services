package pe.bbva.aso.servicios.listcustomerindicators.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;

public interface IListCustomerIndicatorsAPGRestClient {	
	ResponseCustomerIndicators listCustomerIndicators(String customerId, String tsec) throws ServiceExceptionBBVA;
}
