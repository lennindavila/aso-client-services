package pe.bbva.aso.servicios.listaccounts.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaccounts.controller.validator.ListAccountsValidator;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;
import pe.bbva.aso.servicios.listaccounts.service.IListAccountsService;

@Controller
@Scope("prototype")
public class ListAccountsController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IListAccountsService listAccountsService;
	
	@Autowired
	private ListAccountsValidator listAccountsValidator;	

	@Override
	ResponseListAccounts ejecutar(RequestListAccounts filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este Servicio no tiene parametros obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listAccountsValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		ResponseListAccounts response = this.listAccountsService.listAccounts(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
