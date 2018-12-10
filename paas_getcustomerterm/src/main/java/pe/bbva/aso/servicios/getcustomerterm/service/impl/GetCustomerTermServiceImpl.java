package pe.bbva.aso.servicios.getcustomerterm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getcustomerterm.dao.IGetCustomerTermAPGRestClient;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.dto.ResponseGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.service.IGetCustomerTermService;

@Service
@Scope("prototype")
public class GetCustomerTermServiceImpl  implements IGetCustomerTermService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGetCustomerTermAPGRestClient getCustomerTermAPGRestClient;
	
	@Override
	public ResponseGetCustomerTerm getCustomerTerm(RequestGetCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseGetCustomerTerm respuesta = getCustomerTermAPGRestClient.getCustomerTerm(filtro, tsec);
		return respuesta;
	}
}
