package pe.bbva.aso.servicios.createaccount.controller;

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
import pe.bbva.aso.servicios.createaccount.controller.validator.CreateAccountValidator;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;
import pe.bbva.aso.servicios.createaccount.service.ICreateAccountService;

@Controller
@Scope("prototype")
public class CreateAccountController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateAccountService createAccountService;
	
	@Autowired
	private CreateAccountValidator createAccountValidator;

	@Override
	ResponseCreateAccount ejecutar(RequestCreateAccount filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createAccountValidator.validate(filtro, errores);
		/*if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}*/
		
		ResponseCreateAccount response = this.createAccountService.createAccount(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
