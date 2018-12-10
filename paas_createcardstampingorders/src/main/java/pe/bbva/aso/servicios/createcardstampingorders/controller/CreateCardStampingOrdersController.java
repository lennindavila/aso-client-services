package pe.bbva.aso.servicios.createcardstampingorders.controller;

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
import pe.bbva.aso.servicios.createcardstampingorders.controller.validator.CreateCardStampingOrdersValidator;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.service.ICreateCardStampingOrdersService;

@Controller
@Scope("prototype")
public class CreateCardStampingOrdersController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateCardStampingOrdersService createCardStampingOrdersService;
	
	@Autowired
	private CreateCardStampingOrdersValidator createCardStampingOrdersValidator;	

	@Override
	ResponseCreateCardStampingOrders ejecutar(RequestCreateCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");		
	
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCardStampingOrdersValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}			
		
		ResponseCreateCardStampingOrders response = this.createCardStampingOrdersService.createCardStampingOrders(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
