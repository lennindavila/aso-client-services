package pe.bbva.aso.servicios.modifyindicator.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyIndicator modifyIndicator(RequestModifyIndicator filtro, String tsec) throws ServiceExceptionBBVA{
		logger.debug("ModifyIndicatorController modifyIndicator: inicio");
		ResponseModifyIndicator response = this.ejecutar(filtro, tsec);
		logger.debug("ModifyIndicatorController modifyIndicator: fin");
		return response;
	}
	
	abstract ResponseModifyIndicator ejecutar(RequestModifyIndicator filtro,String tsec) throws ValidacionExceptionBBVA, ServiceExceptionBBVA ;
	
}
