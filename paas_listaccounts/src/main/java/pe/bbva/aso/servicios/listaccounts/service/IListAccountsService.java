package pe.bbva.aso.servicios.listaccounts.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;

public interface IListAccountsService {
	public ResponseListAccounts listAccounts(RequestListAccounts filtro, String tsec) throws ServiceExceptionBBVA;	
}
