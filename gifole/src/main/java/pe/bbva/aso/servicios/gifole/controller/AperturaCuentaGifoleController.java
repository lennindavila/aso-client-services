package pe.bbva.aso.servicios.gifole.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.gifole.controller.validator.AperturaCuentaGifoleValidator;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.service.IAperturaCuentaGifoleService;

@Controller
@Scope("prototype")
public class AperturaCuentaGifoleController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IAperturaCuentaGifoleService aperturaCuentaGifoleService;
	
	@Autowired
	private AperturaCuentaGifoleValidator aperturaCuentaGifoleValidator;	

	@Override
	ResponseAperturaCuentaGifole ejecutar(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este Servicio no tiene parametros obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.aperturaCuentaGifoleValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		ResponseAperturaCuentaGifole response = this.aperturaCuentaGifoleService.aperturaCuentaGifole(filtro);
		logger.debug("ejecutar: fin");
		return response;
	}
}
