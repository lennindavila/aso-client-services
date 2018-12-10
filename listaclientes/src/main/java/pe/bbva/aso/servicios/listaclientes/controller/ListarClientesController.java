package pe.bbva.aso.servicios.listaclientes.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaclientes.controller.validator.ListarClientesValidator;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;
import pe.bbva.aso.servicios.listaclientes.service.IConsultarClienteService;

@Controller
@Scope("prototype")
public class ListarClientesController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	/*	
	@Autowired
	private Environment env;	
	*/
	@Autowired
	private IConsultarClienteService consultarClienteService;
	
	@Autowired
	private ListarClientesValidator listarClientesValidator;

	public ResponseListCustomers ejecutar(RequestListCustomers filtro,String tsec) throws ServiceExceptionBBVA {
		logger.info("ejecutar: inicio");
		//Este servicio no tiene campos obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarClientesValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		
		ResponseListCustomers response = this.consultarClienteService.consultarCliente(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
