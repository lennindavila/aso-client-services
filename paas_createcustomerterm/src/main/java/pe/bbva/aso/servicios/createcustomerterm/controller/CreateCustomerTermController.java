package pe.bbva.aso.servicios.createcustomerterm.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.enumerators.ServiceNameEnum;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.controller.validator.CreateCustomerTermValidator;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.service.ICreateCustomerTermService;

@Controller
@Scope("prototype")
public class CreateCustomerTermController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateCustomerTermService createCustomerTermService;
	
	@Autowired
	private CreateCustomerTermValidator createCustomerTermValidator;	

	@Override
	ResponseCreateCustomerTerm ejecutar(RequestCreateCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCustomerTermValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.CREATECUSTOMERTERM,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}		
		
		ResponseCreateCustomerTerm response = this.createCustomerTermService.createCustomerTerm(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
