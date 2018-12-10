package pe.bbva.aso.servicios.getdigitalaffiliation.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;

public interface IGetDigitalAffiliationService {
	public ResponseGetDigitalAffiliation getDigitalAffiliation(RequestGetDigitalAffiliation filtro, String tsec) throws ServiceExceptionBBVA;	
}
