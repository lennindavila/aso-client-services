package pe.bbva.aso.servicios.createchannelinformation.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseCreateChannelInformation createChannelInformation(RequestCreateChannelInformation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateChannelInformationController consultar: inicio");
		ResponseCreateChannelInformation response = this.ejecutar(filtro, tsec);
		logger.debug("CreateChannelInformationController: fin");
		return response;
	}
	
	abstract ResponseCreateChannelInformation ejecutar(RequestCreateChannelInformation filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
