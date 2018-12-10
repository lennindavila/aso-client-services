package pe.bbva.aso.servicios.createaccount.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccount.dao.ICreateAccountAPGRestClient;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;
import pe.bbva.aso.servicios.createaccount.service.ICreateAccountService;

@Service
@Scope("prototype")
public class CreateAccountServiceImpl  implements ICreateAccountService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateAccountAPGRestClient createAccountAPGRestClient;

	@Override
	public ResponseCreateAccount createAccount(RequestCreateAccount filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateAccount respuesta = createAccountAPGRestClient.createAccount(filtro, tsec);
		return respuesta;
	}
}
