package pe.bbva.aso.servicios.getfinancialdashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.dao.IGetFinancialDashboardAPGRestClient;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.service.IGetFinancialDashboardService;

@Service
@Scope("prototype")
public class GetFinancialDashboardServiceImpl  implements IGetFinancialDashboardService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGetFinancialDashboardAPGRestClient getFinancialDashboardAPGRestClient;
	
	@Override
	public ResponseGetFinancialDashboard getFinancialDashboard(RequestGetFinancialDashboard filtro, String tsec) throws ServiceExceptionBBVA {
		String customerId = ""; /*filtro.getCustomerId();*/		
		ResponseGetFinancialDashboard respuesta = getFinancialDashboardAPGRestClient.getFinancialDashboard(customerId, tsec);
		return respuesta;
	}
}
