package pe.bbva.aso.servicios.createcustomerterm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.dao.ICreateCustomerTermAPGRestClient;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.service.ICreateCustomerTermService;

@Service
@Scope("prototype")
public class CreateCustomerTermServiceImpl  implements ICreateCustomerTermService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCustomerTermAPGRestClient createCustomerTermAPGRestClient;

	@Override
	public ResponseCreateCustomerTerm createCustomerTerm(RequestCreateCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {		
		ResponseCreateCustomerTerm respuesta = createCustomerTermAPGRestClient.createCustomerTerm(filtro, tsec);
		return respuesta;
	}
}
