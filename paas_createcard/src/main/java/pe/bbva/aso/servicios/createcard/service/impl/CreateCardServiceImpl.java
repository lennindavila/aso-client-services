package pe.bbva.aso.servicios.createcard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcard.dao.ICreateCardAPGRestClient;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;
import pe.bbva.aso.servicios.createcard.service.ICreateCardService;

@Service
@Scope("prototype")
public class CreateCardServiceImpl  implements ICreateCardService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCardAPGRestClient createAccountAPGRestClient;

	@Override
	public ResponseCreateCard createCard(RequestCreateCard filtro, String tsec) throws ServiceExceptionBBVA {			
		return createAccountAPGRestClient.createCard(filtro, tsec);		
	}
}
