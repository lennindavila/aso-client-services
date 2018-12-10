package pe.bbva.aso.servicios.modifycontactdetail.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

public interface IModifyContactDetailService {
	public ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro, String tsec) throws ServiceExceptionBBVA;	
}
