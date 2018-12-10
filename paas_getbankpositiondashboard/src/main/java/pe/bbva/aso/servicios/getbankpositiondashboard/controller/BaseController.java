package pe.bbva.aso.servicios.getbankpositiondashboard.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseGetBankPositionDashboard getBankPositionDashboard(RequestGetBankPositionDashboard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetBankPositionDashboardController getBankPositionDashboard: inicio");
		ResponseGetBankPositionDashboard response = this.ejecutar(filtro, tsec);
		logger.debug("GetBankPositionDashboardController getBankPositionDashboard: fin");
		return response;
	}
	
	abstract ResponseGetBankPositionDashboard ejecutar(RequestGetBankPositionDashboard filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
