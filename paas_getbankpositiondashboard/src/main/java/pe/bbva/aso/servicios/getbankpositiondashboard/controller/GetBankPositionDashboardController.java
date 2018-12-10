package pe.bbva.aso.servicios.getbankpositiondashboard.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getbankpositiondashboard.controller.validator.GetBankPositionDashboardValidator;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.service.IGetBankPositionDashboardService;

@Controller
@Scope("prototype")
public class GetBankPositionDashboardController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IGetBankPositionDashboardService getBankPositionDashboardService;
	
	@Autowired
	private GetBankPositionDashboardValidator getBankPositionDashboardValidator;	

	@Override
	ResponseGetBankPositionDashboard ejecutar(RequestGetBankPositionDashboard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este servicio no tiene parametros obligados
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.getBankPositionDashboardValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		ResponseGetBankPositionDashboard response = this.getBankPositionDashboardService.getBankPositionDashboard(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
