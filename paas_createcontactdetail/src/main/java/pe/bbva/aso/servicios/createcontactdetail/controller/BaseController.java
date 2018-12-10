package pe.bbva.aso.servicios.createcontactdetail.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateContactDetail createContactDetail(RequestCreateContactDetail filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateContactDetailController createContactDetail: inicio");
		ResponseCreateContactDetail response = this.ejecutar(filtro, tsec);
		logger.debug("CreateContactDetailController: fin");
		return response;
	}
	
	abstract ResponseCreateContactDetail ejecutar(RequestCreateContactDetail filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
