package pe.bbva.aso.servicios.createcustomer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomer.dao.ICreateCustomerAPGRestClient;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.service.ICreateCustomerService;

@Service
@Scope("prototype")
public class CreateCustomerServiceImpl  implements ICreateCustomerService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCustomerAPGRestClient createCustomerAPGRestClient;

	@Override
	public ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateCustomer respuesta = createCustomerAPGRestClient.createCustomer(filtro, tsec);
		return respuesta;
	}
}
