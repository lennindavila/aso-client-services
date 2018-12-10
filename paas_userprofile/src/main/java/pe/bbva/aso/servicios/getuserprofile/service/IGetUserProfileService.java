package pe.bbva.aso.servicios.getuserprofile.service;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;

public interface IGetUserProfileService {
	public ResponseGetUserProfile getUserProfile(RequestGetUserProfile filtro, String tsec) throws ServiceExceptionBBVA;	
}
