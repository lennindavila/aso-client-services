package pe.bbva.aso.servicios.listaccounts.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseListAccounts listAccounts(RequestListAccounts filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListAccountsController listAccounts: inicio");
		ResponseListAccounts response = this.ejecutar(filtro, tsec);
		logger.debug("ListAccountsController listAccounts: fin");
		return response;
	}
	
	abstract ResponseListAccounts ejecutar(RequestListAccounts filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
