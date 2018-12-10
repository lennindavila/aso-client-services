package pe.bbva.aso.servicios.createcardrelatedcontract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcardrelatedcontract.dao.ICreateCardRelatedContractAPGRestClient;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.service.ICreateCardRelatedContractService;

@Service
@Scope("prototype")
public class CreateCardRelatedContractServiceImpl  implements ICreateCardRelatedContractService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCardRelatedContractAPGRestClient createCardRelatedContractAPGRestClient;

	@Override
	public ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateCardRelatedContract respuesta = createCardRelatedContractAPGRestClient.createCardRelatedContract(filtro, tsec);
		return respuesta;
	}
}

