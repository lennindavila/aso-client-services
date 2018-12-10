package pe.bbva.aso.servicios.createrqcardstampingorders.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createrqcardstampingorders.dao.ICreateRqCardStampingOrdersAPGRestClient;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.service.ICreateRqCardStampingOrdersService;

@Service
@Scope("prototype")
public class CreateRqCardStampingOrdersServiceImpl  implements ICreateRqCardStampingOrdersService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateRqCardStampingOrdersAPGRestClient createRqCardStampingOrdersAPGRestClient;

	@Override
	public ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateRqCardStampingOrders respuesta = createRqCardStampingOrdersAPGRestClient.createRqCardStampingOrders(filtro, tsec);
		return respuesta;
	}
}
