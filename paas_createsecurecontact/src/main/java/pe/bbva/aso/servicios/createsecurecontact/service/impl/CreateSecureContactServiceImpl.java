package pe.bbva.aso.servicios.createsecurecontact.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createsecurecontact.dao.ICreateSecureContactAPGRestClient;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.service.ICreateSecureContactService;

@Service
@Scope("prototype")
public class CreateSecureContactServiceImpl  implements ICreateSecureContactService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateSecureContactAPGRestClient createSecureContactAPGRestClient;
	
	@Override
	public ResponseCreateSecureContact createSecureContact(RequestCreateSecureContact filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseCreateSecureContact respuesta = createSecureContactAPGRestClient.createSecureContact(filtro, tsec);
		return respuesta;
	}
}
