package pe.bbva.soa.obtenerClienteReniec.controller;

import org.slf4j.LoggerFactory;

import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	

	public ConsultaPorDNIResponse consultar(ConsultaPorDNIDTO filtro) throws ServiceExceptionBBVA {
		logger.debug("ConsultaPorDNIResponse: inicio");
		ConsultaPorDNIResponse response = this.ejecutar(filtro);
		logger.debug("ConsultaPorDNIResponse: fin");
		return response;
	}
	
	abstract ConsultaPorDNIResponse ejecutar(ConsultaPorDNIDTO filtro) throws ServiceExceptionBBVA ;
	
}
