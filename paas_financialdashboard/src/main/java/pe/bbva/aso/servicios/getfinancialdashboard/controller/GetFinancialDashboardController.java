package pe.bbva.aso.servicios.getfinancialdashboard.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.controller.validator.GetFinancialDashboardValidator;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.service.IGetFinancialDashboardService;

@Controller
@Scope("prototype")
public class GetFinancialDashboardController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IGetFinancialDashboardService getFinancialDashboardService;
	
	@Autowired
	private GetFinancialDashboardValidator getFinancialDashboardValidator;	

	@Override
	ResponseGetFinancialDashboard ejecutar(RequestGetFinancialDashboard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.getFinancialDashboardValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseGetFinancialDashboard response = this.getFinancialDashboardService.getFinancialDashboard(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
