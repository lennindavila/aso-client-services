package pe.bbva.aso.servicios.getbankpositiondashboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getbankpositiondashboard.dao.IGetBankPositionDashboardAPGRestClient;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.service.IGetBankPositionDashboardService;

@Service
@Scope("prototype")
public class GetBankPositionDashboardServiceImpl  implements IGetBankPositionDashboardService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGetBankPositionDashboardAPGRestClient getBankPositionDashboardAPGRestClient;
	
	@Override
	public ResponseGetBankPositionDashboard getBankPositionDashboard(RequestGetBankPositionDashboard filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseGetBankPositionDashboard respuesta = getBankPositionDashboardAPGRestClient.getBankPositionDashboard(filtro,tsec);
		return respuesta;
	}
}
