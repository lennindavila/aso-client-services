package pe.bbva.aso.servicios.createchannelinformation.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createchannelinformation.controller.validator.CreateChannelInformationValidator;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.service.ICreateChannelInformationService;

@Controller
@Scope("prototype")
public class CreateChannelInformationController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ICreateChannelInformationService createChannelInformationService;
	
	@Autowired
	private CreateChannelInformationValidator createChannelInformationValidator;	

	@Override
	ResponseCreateChannelInformation ejecutar(RequestCreateChannelInformation filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este servicio no tiene campos obligados
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.createChannelInformationValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}		
		*/
		ResponseCreateChannelInformation response = this.createChannelInformationService.createChannelInformation(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
