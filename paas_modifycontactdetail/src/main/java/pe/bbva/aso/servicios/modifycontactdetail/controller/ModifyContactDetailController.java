package pe.bbva.aso.servicios.modifycontactdetail.controller;

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
import pe.bbva.aso.servicios.modifycontactdetail.controller.validator.ModifyContactDetailValidator;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.service.IModifyContactDetailService;

@Controller
@Scope("prototype")
public class ModifyContactDetailController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IModifyContactDetailService modifyContactDetailService;
	
	@Autowired
	private ModifyContactDetailValidator modifyContactDetailValidator;	

	@Override
	ResponseModifyContactDetail ejecutar(RequestModifyContactDetail filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.modifyContactDetailValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseModifyContactDetail response = this.modifyContactDetailService.modifyContactDetail(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
