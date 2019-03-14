package pe.bbva.aso.servicios.createcredentialsenrollments.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcredentialsenrollments.dao.ICreateCredentialsEnrollmentsAPGRestClient;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.service.ICreateCredentialsEnrollmentsService;

@Service
@Scope("prototype")
public class CreateCredentialsEnrollmentsServiceImpl  implements ICreateCredentialsEnrollmentsService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private ICreateCredentialsEnrollmentsAPGRestClient createCredentialsEnrollmentsAPGRestClient;

	@Override
	public ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro, String tsec,String contactID) throws ServiceExceptionBBVA {		
		ResponseCredentialsEnrollments respuesta = createCredentialsEnrollmentsAPGRestClient.createCredentialEnrollment(filtro, tsec, contactID);
		return respuesta;
	}
}
