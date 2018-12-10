package pe.bbva.aso.servicios.createcardstampingorders.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;

public interface ICreateCardStampingOrdersAPGRestClient {	
	ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA;
}
