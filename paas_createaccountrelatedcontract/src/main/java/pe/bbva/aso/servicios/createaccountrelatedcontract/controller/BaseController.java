package pe.bbva.aso.servicios.createaccountrelatedcontract.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateAccountRelatedContractController consultar: inicio");
		ResponseCreateAccountRelatedContract response = this.ejecutar(filtro, tsec);
		logger.debug("CreateAccountRelatedContractController: fin");
		return response;
	}
	
	abstract ResponseCreateAccountRelatedContract ejecutar(RequestCreateAccountRelatedContract filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
