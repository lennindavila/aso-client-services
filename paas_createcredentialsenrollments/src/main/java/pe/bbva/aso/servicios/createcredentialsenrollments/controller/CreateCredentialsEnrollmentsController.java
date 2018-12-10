package pe.bbva.aso.servicios.createcredentialsenrollments.controller;

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
import pe.bbva.aso.servicios.createcredentialsenrollments.controller.validator.CreateCredentialsEnrollmentsValidator;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.service.ICreateCredentialsEnrollmentsService;

@Controller
@Scope("prototype")
public class CreateCredentialsEnrollmentsController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
		
	@Autowired
	private ICreateCredentialsEnrollmentsService createCredentialsEnrollmentsService;
	
	@Autowired
	private CreateCredentialsEnrollmentsValidator createCredentialsEnrollmentsValidator;	

	@Override
	ResponseCredentialsEnrollments ejecutar(RequestCredentialsEnrollments filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCredentialsEnrollmentsValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}		
		
		ResponseCredentialsEnrollments response = this.createCredentialsEnrollmentsService.createCredentialEnrollment(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
