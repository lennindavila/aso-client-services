package pe.bbva.aso.servicios.createsecurecontact.controller;

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
import pe.bbva.aso.servicios.createsecurecontact.controller.validator.CreateSecureContactValidator;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.service.ICreateSecureContactService;

@Controller
@Scope("prototype")
public class CreateSecureContactController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateSecureContactService createSecureContactService;
	
	@Autowired
	private CreateSecureContactValidator createSecureContactValidator;	

	@Override
	ResponseCreateSecureContact ejecutar(RequestCreateSecureContact filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createSecureContactValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseCreateSecureContact response = this.createSecureContactService.createSecureContact(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
