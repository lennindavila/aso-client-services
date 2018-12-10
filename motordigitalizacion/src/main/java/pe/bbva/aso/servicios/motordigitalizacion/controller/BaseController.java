package pe.bbva.aso.servicios.motordigitalizacion.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestFileUnico;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	public ZicResult envioContrato(RequestFileUnico filtro) {
		logger.debug("MotorDigitalizacionController envioContrato: inicio");
		ZicResult response = this.ejecutarEnvioContrato(filtro);
		logger.debug("MotorDigitalizacionController: fin");
		return response;
	}
	
	public ZicResult generarDocumentos(RequestFileUnico filtro)throws Exception {
		logger.debug("MotorDigitalizacionController generarDocumentos: inicio");
		ZicResult response = this.ejecutarGenerarDocumentos(filtro);
		logger.debug("MotorDigitalizacionController: fin");
		return response;
	}	
	
	abstract ZicResult ejecutarEnvioContrato(RequestFileUnico request);
	abstract ZicResult ejecutarGenerarDocumentos(RequestFileUnico request) throws Exception;
	
}
