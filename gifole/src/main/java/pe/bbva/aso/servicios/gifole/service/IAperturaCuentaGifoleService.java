package pe.bbva.aso.servicios.gifole.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;

public interface IAperturaCuentaGifoleService {
	public ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA;	
}
