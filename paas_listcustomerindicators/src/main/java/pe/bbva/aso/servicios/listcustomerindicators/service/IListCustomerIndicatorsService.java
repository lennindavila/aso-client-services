package pe.bbva.aso.servicios.listcustomerindicators.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;

public interface IListCustomerIndicatorsService {
	public ResponseCustomerIndicators listCustomerIndicators(RequestListCustomersIndicators filtro, String tsec) throws ServiceExceptionBBVA;	
}
