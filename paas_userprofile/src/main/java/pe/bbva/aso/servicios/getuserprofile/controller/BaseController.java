package pe.bbva.aso.servicios.getuserprofile.controller;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;

public abstract class BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());	

	public ResponseGetUserProfile getUserProfile(RequestGetUserProfile filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetUserProfileController consultar: inicio");
		ResponseGetUserProfile response = this.ejecutar(filtro, tsec);
		logger.debug("GetUserProfileController: fin");
		return response;
	}
	
	abstract ResponseGetUserProfile ejecutar(RequestGetUserProfile filtro,String tsec) throws ServiceExceptionBBVA ;
	
}
