package pe.bbva.soa.obtenerClienteReniec.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;
import pe.bbva.soa.obtenerClienteReniec.service.IObtenerClienteReniecService;

@Controller
@Scope("prototype")
public class ObtenerClienteReniecController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
		
	@Autowired
	private IObtenerClienteReniecService obtenerClienteReniecService;
	
//	@Autowired
//	protected Environment env;
//	@Autowired
//	private ListarClientesValidator listarClientesValidator;

	public ConsultaPorDNIResponse ejecutar(ConsultaPorDNIDTO filtro) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//String canal = env.getProperty("reniec.canal");
		//logger.debug("canal "+canal);
		/*Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarClientesValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, ConfigProperty.getProperty("atm.respuesta.error.general.codigo"),
					ConfigProperty.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}*/
		ConsultaPorDNIResponse response = this.obtenerClienteReniecService.obtenerClienteDNI(filtro);
		
		logger.debug("ejecutar: fin");
		return response;
	}
}
