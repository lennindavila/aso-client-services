package pe.bbva.aso.servicios.listcustomerindicators.controller;

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
import pe.bbva.aso.servicios.listcustomerindicators.controller.validator.ListCustomerIndicatorsValidator;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.service.IListCustomerIndicatorsService;

@Controller
@Scope("prototype")
public class ListCustomerIndicatorsController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IListCustomerIndicatorsService customerIndicatorsService;
	
	@Autowired
	private ListCustomerIndicatorsValidator listarIndicadorsClientesValidator;

	@Override
	public ResponseCustomerIndicators ejecutar(RequestListCustomersIndicators filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");

		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarIndicadorsClientesValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}

		ResponseCustomerIndicators response = this.customerIndicatorsService.listCustomerIndicators(filtro, tsec);

		logger.debug("ejecutar: fin");
		return response;
	}
}
