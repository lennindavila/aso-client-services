package pe.bbva.aso.servicios.createcontactdetail.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;

public interface ICreateContactDetailAPGRestClient {	
	ResponseCreateContactDetail createContactDetail(RequestCreateContactDetail filtro, String tsec) throws ServiceExceptionBBVA;
}
