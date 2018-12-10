package pe.bbva.aso.servicios.createcontactdetail.controller;

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
import pe.bbva.aso.servicios.createcontactdetail.controller.validator.CreateContactDetailValidator;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.service.ICreateContactDetailService;

@Controller
@Scope("prototype")
public class CreateContactDetailController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
		
	@Autowired
	private ICreateContactDetailService contactDetailCustomersService;
	
	@Autowired
	private CreateContactDetailValidator createContactDetailValidator;	

	@Override
	ResponseCreateContactDetail ejecutar(RequestCreateContactDetail filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createContactDetailValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseCreateContactDetail response = this.contactDetailCustomersService.createContactDetail(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
