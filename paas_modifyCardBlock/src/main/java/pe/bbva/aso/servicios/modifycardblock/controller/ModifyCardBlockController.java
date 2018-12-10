package pe.bbva.aso.servicios.modifycardblock.controller;

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
import pe.bbva.aso.servicios.modifycardblock.controller.validator.ModifyCardBlockValidator;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.service.IModifyCardBlockService;

@Controller
@Scope("prototype")
public class ModifyCardBlockController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyCardBlockService modifyCardBlockService;
	
	@Autowired
	private ModifyCardBlockValidator modifyCardBlockValidator;	

	@Override
	ResponseModifyCardBlock ejecutar(RequestModifyCardBlock filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyCardBlockValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseModifyCardBlock respuesta = this.modifyCardBlockService.modifyCardBlock(filtro, tsec);
		logger.debug("ejecutar: fin");
		return respuesta;
	}
}
