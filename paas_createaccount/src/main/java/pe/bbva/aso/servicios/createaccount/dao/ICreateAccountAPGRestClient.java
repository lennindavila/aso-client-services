package pe.bbva.aso.servicios.createaccount.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;

public interface ICreateAccountAPGRestClient {	
	ResponseCreateAccount createAccount(RequestCreateAccount filtro, String tsec) throws ServiceExceptionBBVA;
}
