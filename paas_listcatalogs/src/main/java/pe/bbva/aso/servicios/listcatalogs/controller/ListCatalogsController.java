package pe.bbva.aso.servicios.listcatalogs.controller;

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
import pe.bbva.aso.servicios.listcatalogs.controller.validator.ListCatalogsValidator;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.service.IListCatalogsService;

@Controller
@Scope("prototype")
public class ListCatalogsController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IListCatalogsService listCatalogsService;
	
	@Autowired
	private ListCatalogsValidator listCatalogsValidator;		

	@Override
	ResponseListCatalogs ejecutar(RequestListCatalogs filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listCatalogsValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(ServiceNameEnum.LISTCATALOGS,errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		
		ResponseListCatalogs response = this.listCatalogsService.listCatalogs(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
