package pe.bbva.aso.servicios.getuserprofile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getuserprofile.dao.IGetUserProfileAPGRestClient;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.service.IGetUserProfileService;

@Service
@Scope("prototype")
public class GetUserProfileServiceImpl  implements IGetUserProfileService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IGetUserProfileAPGRestClient getUserProfileAPGRestClient;

	@Override
	public ResponseGetUserProfile getUserProfile(RequestGetUserProfile filtro, String tsec) throws ServiceExceptionBBVA {
		ResponseGetUserProfile respuesta = getUserProfileAPGRestClient.getUserProfile(filtro, tsec);
		return respuesta;
	}
}
