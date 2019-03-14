package pe.bbva.aso.servicios.modifycard.controller;

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
import pe.bbva.aso.servicios.modifycard.controller.validator.ModifyCardValidator;
import pe.bbva.aso.servicios.modifycard.dto.CardDTO;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;
import pe.bbva.aso.servicios.modifycard.service.IModifyCardService;

@Controller
@Scope("prototype")
public class ModifyCardController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
		
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyCardService modifyCardService;
	
	@Autowired
	private ModifyCardValidator modifyCardValidator;

	@Override
	public ResponseModifyCard ejecutar(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardController ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyCardValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.MODIFYCARD,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseModifyCard response = this.modifyCardService.modifyCard(filtro, tsec);
		logger.debug("ModifyCardController ejecutar: fin");
		return response;
	}
}
