package pe.bbva.aso.servicios.getfinancialdashboard.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;

public interface IGetFinancialDashboardAPGRestClient {	
	ResponseGetFinancialDashboard getFinancialDashboard(String customerId, String tsec) throws ServiceExceptionBBVA;
}
