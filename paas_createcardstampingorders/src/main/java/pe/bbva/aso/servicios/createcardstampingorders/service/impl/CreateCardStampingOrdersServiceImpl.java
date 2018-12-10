package pe.bbva.aso.servicios.createcardstampingorders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardstampingorders.dao.ICreateCardStampingOrdersAPGRestClient;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.service.ICreateCardStampingOrdersService;

@Service
@Scope("prototype")
public class CreateCardStampingOrdersServiceImpl  implements ICreateCardStampingOrdersService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCardStampingOrdersAPGRestClient createCardStampingOrdersAPGRestClient;

	@Override
	public ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateCardStampingOrders respuesta = createCardStampingOrdersAPGRestClient.createCardStampingOrders(filtro, tsec);
		return respuesta;
	}
}
