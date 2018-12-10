package pe.bbva.aso.servicios.modifycardblock.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyCardBlock modifyCardBlock(RequestModifyCardBlock filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardBlockController modifyCardBlock: inicio");
		ResponseModifyCardBlock respuesta = this.ejecutar(filtro, tsec);
		logger.debug("ModifyCardBlockController modifyCardBlock: fin");
		return respuesta;
	}
	
	abstract ResponseModifyCardBlock ejecutar(RequestModifyCardBlock filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
