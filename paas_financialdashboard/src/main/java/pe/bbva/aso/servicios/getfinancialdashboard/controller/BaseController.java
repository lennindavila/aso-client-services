package pe.bbva.aso.servicios.getfinancialdashboard.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseGetFinancialDashboard getFinancialDashboard(RequestGetFinancialDashboard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetFinancialDashboardController getFinancialDashboard: inicio");
		ResponseGetFinancialDashboard response = this.ejecutar(filtro, tsec);
		logger.debug("GetFinancialDashboardController getFinancialDashboard: fin");
		return response;
	}
	
	abstract ResponseGetFinancialDashboard ejecutar(RequestGetFinancialDashboard filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
