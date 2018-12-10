package pe.bbva.aso.servicios.createsecurecontact.dao;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;

public interface ICreateSecureContactAPGRestClient {	
	ResponseCreateSecureContact createSecureContact(RequestCreateSecureContact filtro, String tsec) throws ServiceExceptionBBVA;
}
