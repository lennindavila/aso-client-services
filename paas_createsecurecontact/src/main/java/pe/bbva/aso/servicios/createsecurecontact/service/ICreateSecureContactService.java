package pe.bbva.aso.servicios.createsecurecontact.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;

public interface ICreateSecureContactService {
	public ResponseCreateSecureContact createSecureContact(RequestCreateSecureContact filtro, String tsec) throws ServiceExceptionBBVA;	
}
