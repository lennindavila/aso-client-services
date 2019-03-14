package pe.bbva.aso.servicios.getcustomerterm.controller;

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
import pe.bbva.aso.servicios.getcustomerterm.controller.validator.GetCustomerTermValidator;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.dto.ResponseGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.service.IGetCustomerTermService;

@Controller
@Scope("prototype")
public class GetCustomerTermController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IGetCustomerTermService getCustomerTermService;
	
	@Autowired
	private GetCustomerTermValidator getCustomerTermValidator;	

	@Override
	ResponseGetCustomerTerm ejecutar(RequestGetCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.getCustomerTermValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.GETCUSTOMERTERM,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseGetCustomerTerm response = this.getCustomerTermService.getCustomerTerm(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
