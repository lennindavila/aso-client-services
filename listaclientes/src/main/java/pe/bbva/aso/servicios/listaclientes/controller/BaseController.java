package pe.bbva.aso.servicios.listaclientes.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	

	public ResponseListCustomers consultarCliente(RequestListCustomers filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCustomersController consultar: inicio");
		ResponseListCustomers response = this.ejecutar(filtro, tsec);
		logger.debug("ListCustomersController: fin");
		return response;
	}
	
	abstract ResponseListCustomers ejecutar(RequestListCustomers filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
