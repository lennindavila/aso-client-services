package pe.bbva.soa.rbaonline.controller;

import org.slf4j.LoggerFactory;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;

import ch.qos.logback.classic.Logger;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	

	public SalidaOnlineDTO consultar(EntradaOnlineDTO filtro) {
		logger.debug("SalidaOnlineDTOResponse: inicio");
		SalidaOnlineDTO response = this.ejecutar(filtro);
		logger.debug("SalidaOnlineDTOResponse: fin");
		return response;
	}
	
	abstract SalidaOnlineDTO ejecutar(EntradaOnlineDTO filtro) ;
	
}
