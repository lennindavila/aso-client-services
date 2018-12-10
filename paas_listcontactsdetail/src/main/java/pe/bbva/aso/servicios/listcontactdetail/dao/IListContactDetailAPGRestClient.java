package pe.bbva.aso.servicios.listcontactdetail.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

public interface IListContactDetailAPGRestClient {	
	ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro, String tsec) throws ServiceExceptionBBVA;
}
