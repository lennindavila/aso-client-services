package pe.bbva.aso.servicios.getbankpositiondashboard.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;

public interface IGetBankPositionDashboardService {
	public ResponseGetBankPositionDashboard getBankPositionDashboard(RequestGetBankPositionDashboard filtro, String tsec) throws ServiceExceptionBBVA;	
}
