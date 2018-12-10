package pe.bbva.aso.servicios.createaccount.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateAccount createAccount(RequestCreateAccount filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateAccountController consultar: inicio");
		ResponseCreateAccount response = this.ejecutar(filtro, tsec);
		logger.debug("CreateAccountController: fin");
		return response;
	}
	
	abstract ResponseCreateAccount ejecutar(RequestCreateAccount filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
