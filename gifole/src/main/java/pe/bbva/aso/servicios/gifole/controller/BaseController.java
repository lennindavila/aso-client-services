package pe.bbva.aso.servicios.gifole.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA {
		logger.debug("AperturaCuentaGifoleController consultar: inicio");
		ResponseAperturaCuentaGifole response = this.ejecutar(filtro);
		logger.debug("AperturaCuentaGifoleController: fin");
		return response;
	}
	
	abstract ResponseAperturaCuentaGifole ejecutar(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA ;
	
}
