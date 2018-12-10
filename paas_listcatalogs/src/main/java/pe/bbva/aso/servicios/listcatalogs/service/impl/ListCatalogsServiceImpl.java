package pe.bbva.aso.servicios.listcatalogs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcatalogs.dao.IListCatalogsAPGRestClient;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.service.IListCatalogsService;

@Service
@Scope("prototype")
public class ListCatalogsServiceImpl  implements IListCatalogsService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IListCatalogsAPGRestClient listCatalogsAPGRestClient;
	
	@Override
	public ResponseListCatalogs listCatalogs(RequestListCatalogs filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseListCatalogs respuesta = listCatalogsAPGRestClient.listCatalogs(filtro, tsec);
		return respuesta;
	}
}
