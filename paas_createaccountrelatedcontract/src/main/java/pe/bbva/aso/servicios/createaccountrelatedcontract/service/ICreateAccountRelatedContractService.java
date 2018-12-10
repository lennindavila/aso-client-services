package pe.bbva.aso.servicios.createaccountrelatedcontract.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;

public interface ICreateAccountRelatedContractService {
	public ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro, String tsec) throws ServiceExceptionBBVA;	
}
