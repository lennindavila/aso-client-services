package pe.bbva.aso.servicios.getfinancialdashboard.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;

public interface IGetFinancialDashboardService {
	public ResponseGetFinancialDashboard getFinancialDashboard(RequestGetFinancialDashboard filtro, String tsec) throws ServiceExceptionBBVA;	
}
