package pe.bbva.aso.servicios.listcontactdetail.controller;

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
import pe.bbva.aso.servicios.listcontactdetail.controller.validator.ListContactDetailValidator;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.service.IListContactDetailService;

@Controller
@Scope("prototype")
public class ListContactDetailController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IListContactDetailService contactDetailCustomersService;
	
	@Autowired
	private ListContactDetailValidator listarContactoDetalleClienteValidator;	

	@Override
	ResponseContactDetailDTO ejecutar(RequestListContactDetailDTO filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarContactoDetalleClienteValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseContactDetailDTO response = this.contactDetailCustomersService.listContactDetail(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
