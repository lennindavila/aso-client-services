package pe.bbva.aso.servicios.modifycustomerterm.controller;

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
import pe.bbva.aso.servicios.modifycustomerterm.controller.validator.ModifyCustomerTermValidator;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.service.IModifyCustomerTermService;

@Controller
@Scope("prototype")
public class ModifyCustomerTermController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyCustomerTermService createCustomerTermService;
	
	@Autowired
	private ModifyCustomerTermValidator createCustomerTermValidator;	

	@Override
	ResponseModifyCustomerTerm ejecutar(RequestModifyCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCustomerTermController ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCustomerTermValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.MODIFYCUSTOMERTERM,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}		
		
		ResponseModifyCustomerTerm response = this.createCustomerTermService.modifyCustomerTerm(filtro, tsec);
		logger.debug("ModifyCustomerTermController ejecutar: fin");
		return response;
	}
}
