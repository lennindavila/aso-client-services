package pe.bbva.aso.servicios.createaccountrelatedcontract.controller;

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
import pe.bbva.aso.servicios.createaccountrelatedcontract.controller.validator.CreateAccountRelatedContractValidator;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.service.ICreateAccountRelatedContractService;

@Controller
@Scope("prototype")
public class CreateAccountRelatedContractController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;	
	
	@Autowired
	private ICreateAccountRelatedContractService createAccountRelatedContractService;
	
	@Autowired
	private CreateAccountRelatedContractValidator createAccountRelatedContractValidator;	

	@Override
	ResponseCreateAccountRelatedContract ejecutar(RequestCreateAccountRelatedContract filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");		
				
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createAccountRelatedContractValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}				
		
		ResponseCreateAccountRelatedContract response = this.createAccountRelatedContractService.createAccountRelatedContract(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
