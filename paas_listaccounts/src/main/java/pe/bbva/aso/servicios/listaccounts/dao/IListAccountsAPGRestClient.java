package pe.bbva.aso.servicios.listaccounts.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;

public interface IListAccountsAPGRestClient {	
	ResponseListAccounts listAccounts(RequestListAccounts filtro, String tsec) throws ServiceExceptionBBVA;
}
