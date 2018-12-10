package pe.bbva.aso.servicios.modifycardactivation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardactivation.dao.IModifyCardActivationAPGRestClient;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.service.IModifyCardActivationService;

@Service
@Scope("prototype")
public class ModifyCardActivationServiceImpl  implements IModifyCardActivationService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyCardActivationAPGRestClient modifyCardActivationAPGRestClient;

	@Override
	public ResponseModifyCardActivation modifyCardActivation(RequestModifyCardActivation filtro, String tsec) throws ServiceExceptionBBVA {	
		String cardId = filtro.getCardId();
		String activationId = filtro.getActivationId();
		String isActive = filtro.getIsActive();
		ResponseModifyCardActivation respuesta = modifyCardActivationAPGRestClient.modifyCardActivation( cardId, activationId, isActive, tsec);
		return respuesta;
	}
}


