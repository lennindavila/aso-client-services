package pe.bbva.aso.servicios.modifycardpin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycardpin.dao.IModifyCardPinAPGRestClient;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.dto.ResponseModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.service.IModifyCardPinService;

@Service
@Scope("prototype")
public class ModifyCardPinServiceImpl  implements IModifyCardPinService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyCardPinAPGRestClient modifyCardAPGRestClient;

	@Override
	public ResponseModifyCardPin modifyCardPin(String cardId,RequestModifyCardPin filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseModifyCardPin respuesta = modifyCardAPGRestClient.modifyCardPin(cardId,filtro, tsec);
		return respuesta;
	}
}
