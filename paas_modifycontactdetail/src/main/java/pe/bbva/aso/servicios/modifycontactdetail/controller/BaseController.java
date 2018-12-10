package pe.bbva.aso.servicios.modifycontactdetail.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyContactDetailController modifyContactDetail: inicio");
		ResponseModifyContactDetail response = this.ejecutar(filtro, tsec);
		logger.debug("ModifyContactDetailController modifyContactDetail: fin");
		return response;
	}
	
	abstract ResponseModifyContactDetail ejecutar(RequestModifyContactDetail filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
