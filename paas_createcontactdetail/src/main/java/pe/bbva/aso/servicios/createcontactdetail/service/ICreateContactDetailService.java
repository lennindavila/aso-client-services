package pe.bbva.aso.servicios.createcontactdetail.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;

public interface ICreateContactDetailService {
	public ResponseCreateContactDetail createContactDetail(RequestCreateContactDetail filtro, String tsec) throws ServiceExceptionBBVA;	
}
