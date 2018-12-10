package pe.bbva.servicios.biometricclient.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;

public interface IBiometricClientService {
	public AuthenticateResponse obtenerBiometrico(AuthenticateRequest request) throws ServiceExceptionBBVA;	
}
