package pe.bbva.aso.servicios.listcatalogs.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseListCatalogs listCatalogs(RequestListCatalogs filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCatalogsController listCatalogs: inicio");
		ResponseListCatalogs response = this.ejecutar(filtro, tsec);
		logger.debug("ListCatalogsController listCatalogs: fin");
		return response;
	}
	
	abstract ResponseListCatalogs ejecutar(RequestListCatalogs filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
