package pe.bbva.aso.servicios.modifycustomerterm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycustomerterm.dao.IModifyCustomerTermAPGRestClient;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.service.IModifyCustomerTermService;

@Service
@Scope("prototype")
public class ModifyCustomerTermServiceImpl  implements IModifyCustomerTermService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyCustomerTermAPGRestClient createCustomerTermAPGRestClient;

	@Override
	public ResponseModifyCustomerTerm modifyCustomerTerm(RequestModifyCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {		
		ResponseModifyCustomerTerm respuesta = createCustomerTermAPGRestClient.modifyCustomerTerm(filtro, tsec);
		return respuesta;
	}
}
