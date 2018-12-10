package pe.bbva.aso.servicios.createcardrelatedcontract.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;

public interface ICreateCardRelatedContractService {
	public ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro, String tsec) throws ServiceExceptionBBVA;	
}
