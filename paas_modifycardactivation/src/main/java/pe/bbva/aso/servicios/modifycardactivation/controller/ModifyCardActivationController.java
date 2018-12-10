package pe.bbva.aso.servicios.modifycardactivation.controller;

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
import pe.bbva.aso.servicios.modifycardactivation.controller.validator.ModifyCardActivationValidator;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.service.IModifyCardActivationService;

@Controller
@Scope("prototype")
public class ModifyCardActivationController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyCardActivationService modifyCardActivationService;
	
	@Autowired
	private ModifyCardActivationValidator modifyCardActivationValidator;	

	@Override
	ResponseModifyCardActivation ejecutar(RequestModifyCardActivation filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyCardActivationValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseModifyCardActivation respuesta = this.modifyCardActivationService.modifyCardActivation(filtro, tsec);
		logger.debug("ejecutar: fin");
		return respuesta;
	}
}
