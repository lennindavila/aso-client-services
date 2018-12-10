package pe.bbva.aso.servicios.createaccountrelatedcontract.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;

public interface ICreateAccountRelatedContractAPGRestClient {	
	ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro, String tsec) throws ServiceExceptionBBVA;
}
