package pe.bbva.aso.servicios.listcontactdetail.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListContactDetailController listContactDetail: inicio");
		ResponseContactDetailDTO response = this.ejecutar(filtro, tsec);
		logger.debug("ListContactDetailController listContactDetail: fin");
		return response;
	}
	
	abstract ResponseContactDetailDTO ejecutar(RequestListContactDetailDTO filtro,String tsec) throws ServiceExceptionBBVA ;
}
