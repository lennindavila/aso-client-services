package pe.bbva.aso.servicios.createcardrelatedcontract.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;

public interface ICreateCardRelatedContractAPGRestClient {	
	ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro, String tsec) throws ServiceExceptionBBVA;
}
