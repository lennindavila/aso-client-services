package pe.bbva.aso.servicios.createrqcardstampingorders.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;

public interface ICreateRqCardStampingOrdersService {
	public ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA;	
}
