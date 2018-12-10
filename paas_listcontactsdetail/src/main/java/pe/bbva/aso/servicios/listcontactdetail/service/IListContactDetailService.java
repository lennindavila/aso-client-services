package pe.bbva.aso.servicios.listcontactdetail.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

public interface IListContactDetailService {
	public ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro, String tsec) throws ServiceExceptionBBVA;	
}
