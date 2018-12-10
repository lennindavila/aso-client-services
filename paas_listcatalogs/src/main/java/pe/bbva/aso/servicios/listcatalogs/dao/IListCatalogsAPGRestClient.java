package pe.bbva.aso.servicios.listcatalogs.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;

public interface IListCatalogsAPGRestClient {	
	ResponseListCatalogs listCatalogs(RequestListCatalogs filtro, String tsec) throws ServiceExceptionBBVA;
}

