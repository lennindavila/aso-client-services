package pe.bbva.aso.servicios.createrqcardstampingorders.controller;

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
import pe.bbva.aso.servicios.createrqcardstampingorders.controller.validator.CreateRqCardStampingOrdersValidator;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.service.ICreateRqCardStampingOrdersService;

@Controller
@Scope("prototype")
public class CreateRqCardStampingOrdersController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateRqCardStampingOrdersService createRqCardStampingOrdersService;
	
	@Autowired
	private CreateRqCardStampingOrdersValidator createRqCardStampingOrdersValidator;	

	@Override
	ResponseCreateRqCardStampingOrders ejecutar(RequestCreateRqCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createRqCardStampingOrdersValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.CREATERQCARDSTAMPINGORDERS,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseCreateRqCardStampingOrders response = this.createRqCardStampingOrdersService.createRqCardStampingOrders(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
