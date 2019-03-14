package pe.bbva.aso.servicios.modifycustomerterm.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseModifyCustomerTerm modifyCustomerTerm(RequestModifyCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCustomerTermController modifyCustomerTerm: inicio");
		ResponseModifyCustomerTerm response = this.ejecutar(filtro, tsec);
		logger.debug("ModifyCustomerTermController modifyCustomerTerm: fin");
		return response;
	}
	
	abstract ResponseModifyCustomerTerm ejecutar(RequestModifyCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
