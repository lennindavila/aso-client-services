package pe.bbva.aso.servicios.createcardrelatedcontract.controller;

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
import pe.bbva.aso.servicios.createcardrelatedcontract.controller.validator.CreateCardRelatedContractValidator;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.service.ICreateCardRelatedContractService;

@Controller
@Scope("prototype")
public class CreateCardRelatedContractController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;	
	
	@Autowired
	private ICreateCardRelatedContractService createCardRelatedContractService;
	
	@Autowired
	private CreateCardRelatedContractValidator createCardRelatedContractValidator;	

	@Override
	ResponseCreateCardRelatedContract ejecutar(RequestCreateCardRelatedContract filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCardRelatedContractValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.CREATECARDRELATEDCONTRACT,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}		
		
		ResponseCreateCardRelatedContract response = this.createCardRelatedContractService.createCardRelatedContract(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
