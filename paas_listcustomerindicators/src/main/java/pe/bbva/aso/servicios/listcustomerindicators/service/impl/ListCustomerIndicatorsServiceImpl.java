package pe.bbva.aso.servicios.listcustomerindicators.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listcustomerindicators.dao.IListCustomerIndicatorsAPGRestClient;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.service.IListCustomerIndicatorsService;

@Service
@Scope("prototype")
public class ListCustomerIndicatorsServiceImpl  implements IListCustomerIndicatorsService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());
	

	@Autowired
	private IListCustomerIndicatorsAPGRestClient consultaIndicadorCliente;
	
	public ResponseCustomerIndicators listCustomerIndicators(RequestListCustomersIndicators filtro,String tsec) throws ServiceExceptionBBVA {
		String customerId = filtro.getCustomerId();		
		ResponseCustomerIndicators respuesta = consultaIndicadorCliente.listCustomerIndicators(customerId, tsec);
		return respuesta;
	}
}
