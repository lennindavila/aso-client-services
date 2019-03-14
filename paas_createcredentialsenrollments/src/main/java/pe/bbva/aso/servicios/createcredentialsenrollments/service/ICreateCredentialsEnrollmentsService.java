package pe.bbva.aso.servicios.createcredentialsenrollments.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;

public interface ICreateCredentialsEnrollmentsService {
	public ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro, String tsec,String contactID) throws ServiceExceptionBBVA;	
}
