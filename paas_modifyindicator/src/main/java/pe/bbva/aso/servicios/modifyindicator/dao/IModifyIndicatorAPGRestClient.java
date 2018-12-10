package pe.bbva.aso.servicios.modifyindicator.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

public interface IModifyIndicatorAPGRestClient {	
	ResponseModifyIndicator modifyIndicator(String customerId,String indicatorId,String isActive, String tsec) throws ServiceExceptionBBVA ;
		

}
