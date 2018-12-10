package pe.bbva.aso.servicios.modifycard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.modifycard.dao.IModifyCardAPGRestClient;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;
import pe.bbva.aso.servicios.modifycard.service.IModifyCardService;

@Service
@Scope("prototype")
public class ModifyCardServiceImpl  implements IModifyCardService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IModifyCardAPGRestClient modifyCardAPGRestClient;

	@Override
	public ResponseModifyCard modifyCard(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA {
		return modifyCardAPGRestClient.modifyCard(filtro, tsec);
	}
}
