package pe.bbva.aso.servicios.createrqcardstampingorders.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;

public interface ICreateRqCardStampingOrdersAPGRestClient {	
	ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA;
}
