package pe.bbva.aso.servicios.getdigitalaffiliation.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;

public interface IGetDigitalAffiliationAPGRestClient {	
	ResponseGetDigitalAffiliation getDigitalAffiliation(RequestGetDigitalAffiliation filtro, String tsec) throws ServiceExceptionBBVA;
}
