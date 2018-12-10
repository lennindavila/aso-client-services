package pe.bbva.aso.servicios.createcardstampingorders.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;

public interface ICreateCardStampingOrdersService {
	public ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA;	
}
