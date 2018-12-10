package pe.bbva.aso.servicios.createcardrelatedcontract.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardRelatedContractController consultar: inicio");
		ResponseCreateCardRelatedContract response = this.ejecutar(filtro, tsec);
		logger.debug("CreateCardRelatedContractController: fin");
		return response;
	}
	
	abstract ResponseCreateCardRelatedContract ejecutar(RequestCreateCardRelatedContract filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
