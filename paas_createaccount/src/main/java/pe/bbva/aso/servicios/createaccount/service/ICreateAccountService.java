package pe.bbva.aso.servicios.createaccount.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;

public interface ICreateAccountService {
	public ResponseCreateAccount createAccount(RequestCreateAccount filtro, String tsec) throws ServiceExceptionBBVA;	
}
