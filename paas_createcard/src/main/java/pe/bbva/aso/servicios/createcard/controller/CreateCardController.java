package pe.bbva.aso.servicios.createcard.controller;

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
import pe.bbva.aso.servicios.createcard.controller.validator.CreateCardValidator;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;
import pe.bbva.aso.servicios.createcard.service.ICreateCardService;

@Controller
@Scope("prototype")
public class CreateCardController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateCardService createCardService;
	
	@Autowired
	private CreateCardValidator createCardValidator;	

	@Override
	public ResponseCreateCard ejecutar(RequestCreateCard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");		
				
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createCardValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}				
		
		ResponseCreateCard response = this.createCardService.createCard(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
