package pe.bbva.aso.servicios.listaccounts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaccounts.dao.IListAccountsAPGRestClient;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;
import pe.bbva.aso.servicios.listaccounts.service.IListAccountsService;

@Service
@Scope("prototype")
public class ListAccountsServiceImpl  implements IListAccountsService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IListAccountsAPGRestClient listAccountsAPGRestClient;

	@Override
	public ResponseListAccounts listAccounts(RequestListAccounts filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseListAccounts respuesta = listAccountsAPGRestClient.listAccounts(filtro, tsec);
		return respuesta;
	}
}
