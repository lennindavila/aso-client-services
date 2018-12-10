package pe.bbva.aso.servicios.modifyindicator.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;


public interface IModifyIndicatorService {
	public ResponseModifyIndicator modifyIndicator(RequestModifyIndicator filtro, String tsec) throws ServiceExceptionBBVA;
}
