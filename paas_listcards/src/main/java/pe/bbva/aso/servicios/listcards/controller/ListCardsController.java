package pe.bbva.aso.servicios.listcards.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcards.controller.validator.ListCardsValidator;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;
import pe.bbva.aso.servicios.listcards.service.IListCardsService;

@Controller
@Scope("prototype")
public class ListCardsController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IListCardsService listCardsService;
	
	@Autowired
	private ListCardsValidator listCardsValidator;	

	@Override
	ResponseListCards ejecutar(RequestListCards filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este Servicio no tiene parametros obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listCardsValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		ResponseListCards response = this.listCardsService.listCards(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
