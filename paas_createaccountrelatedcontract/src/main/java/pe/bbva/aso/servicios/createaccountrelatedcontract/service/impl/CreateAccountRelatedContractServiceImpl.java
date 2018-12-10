package pe.bbva.aso.servicios.createaccountrelatedcontract.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dao.ICreateAccountRelatedContractAPGRestClient;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.service.ICreateAccountRelatedContractService;

@Service
@Scope("prototype")
public class CreateAccountRelatedContractServiceImpl  implements ICreateAccountRelatedContractService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateAccountRelatedContractAPGRestClient createAccountRelatedContractAPGRestClient;

	@Override
	public ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro,
			String tsec) throws ServiceExceptionBBVA {
		logger.debug("createAccountRelatedContract: inicio");
		ResponseCreateAccountRelatedContract respuesta = createAccountRelatedContractAPGRestClient.createAccountRelatedContract(filtro, tsec);
		return respuesta;
	}
}

 