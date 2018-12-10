package pe.bbva.aso.servicios.modifycardactivation.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyCardActivation modifyCardActivation(RequestModifyCardActivation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardActivationController modifyCardActivation: inicio");
		ResponseModifyCardActivation respuesta = this.ejecutar(filtro, tsec);
		logger.debug("ModifyCardActivationController modifyCardActivation: fin");
		return respuesta;
	}
	
	abstract ResponseModifyCardActivation ejecutar(RequestModifyCardActivation filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
