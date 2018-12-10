package pe.bbva.aso.servicios.gifole.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;

public interface IAperturaCuentaGifoleAPGRestClient {	
	ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA;
}
