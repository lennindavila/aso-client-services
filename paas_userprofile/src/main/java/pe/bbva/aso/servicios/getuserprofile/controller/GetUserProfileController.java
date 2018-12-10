package pe.bbva.aso.servicios.getuserprofile.controller;

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
import pe.bbva.aso.servicios.getuserprofile.controller.validator.GetUserProfileValidator;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.service.IGetUserProfileService;

@Controller
@Scope("prototype")
public class GetUserProfileController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IGetUserProfileService modifyCardService;
	
	@Autowired
	private GetUserProfileValidator modifyCardValidator;	

	@Override
	ResponseGetUserProfile ejecutar(RequestGetUserProfile filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyCardValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseGetUserProfile response = this.modifyCardService.getUserProfile(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
