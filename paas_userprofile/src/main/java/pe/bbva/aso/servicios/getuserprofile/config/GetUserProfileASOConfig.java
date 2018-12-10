package pe.bbva.aso.servicios.getuserprofile.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.getuserprofile.controller.GetUserProfileController;
import pe.bbva.aso.servicios.getuserprofile.dto.RequestGetUserProfile;
import pe.bbva.aso.servicios.getuserprofile.dto.ResponseGetUserProfile;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.getuserprofile.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_getuserprofile.properties" 
})
public class GetUserProfileASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GetUserProfileASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public ResponseGetUserProfile getUserProfile(RequestGetUserProfile filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetUserProfileASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(GetUserProfileASOConfig.class);
		GetUserProfileController modifyCardController = ctx.getBean(GetUserProfileController.class);
		logger.debug("GetUserProfileASOConfig enviar: fin");
		return modifyCardController.getUserProfile(filtro, tsec);
	}
}
