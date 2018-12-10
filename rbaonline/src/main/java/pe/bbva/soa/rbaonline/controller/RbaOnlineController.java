package pe.bbva.soa.rbaonline.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;

import ch.qos.logback.classic.Logger;
import pe.bbva.soa.rbaonline.service.IRbaOnlineService;

@Controller
@Scope("prototype")
public class RbaOnlineController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private IRbaOnlineService rbaOnlineService;
	
	@Override
	SalidaOnlineDTO ejecutar(EntradaOnlineDTO filtro) {
		logger.debug("ejecutar: inicio");		
		/*Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarClientesValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, ConfigProperty.getProperty("atm.respuesta.error.general.codigo"),
					ConfigProperty.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}*/
		SalidaOnlineDTO response = this.rbaOnlineService.getConsultaOnline(filtro);
		
		logger.debug("ejecutar: fin");
		return response;
	}
}
