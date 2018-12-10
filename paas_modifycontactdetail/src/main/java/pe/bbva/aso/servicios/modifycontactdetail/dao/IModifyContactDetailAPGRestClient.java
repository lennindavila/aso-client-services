package pe.bbva.aso.servicios.modifycontactdetail.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

public interface IModifyContactDetailAPGRestClient {	
	ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro, String tsec) throws ServiceExceptionBBVA;
}
