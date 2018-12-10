package pe.bbva.aso.servicios.modifyindicator.controller;

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
import pe.bbva.aso.servicios.modifyindicator.controller.validator.ModifyIndicatorValidator;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.service.IModifyIndicatorService;

@Controller
@Scope("prototype")
public class ModifyIndicatorController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyIndicatorService modifyIndicatorService;
	
	@Autowired
	private ModifyIndicatorValidator modifyIndicatorValidator;	

	@Override
	ResponseModifyIndicator ejecutar(RequestModifyIndicator filtro, String tsec) throws ServiceExceptionBBVA{
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyIndicatorValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseModifyIndicator response = this.modifyIndicatorService.modifyIndicator(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
