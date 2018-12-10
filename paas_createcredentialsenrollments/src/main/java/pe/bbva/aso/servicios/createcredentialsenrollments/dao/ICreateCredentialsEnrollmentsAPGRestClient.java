package pe.bbva.aso.servicios.createcredentialsenrollments.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;

public interface ICreateCredentialsEnrollmentsAPGRestClient {	
	ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro, String tsec) throws ServiceExceptionBBVA;
}
