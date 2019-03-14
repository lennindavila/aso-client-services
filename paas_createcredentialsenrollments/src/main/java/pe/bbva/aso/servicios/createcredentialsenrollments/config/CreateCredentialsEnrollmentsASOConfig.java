package pe.bbva.aso.servicios.createcredentialsenrollments.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcredentialsenrollments.controller.CreateCredentialsEnrollmentsController;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcredentialsenrollments.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcredentialsenrollments.properties" 
})
public class CreateCredentialsEnrollmentsASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCredentialsEnrollmentsASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCredentialsEnrollments createCredentialEnrollment(RequestCredentialsEnrollments filtro,String tsec,String contactID) throws ServiceExceptionBBVA {
		logger.debug("CreateCredentialsEnrollmentsASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCredentialsEnrollmentsASOConfig.class);
		CreateCredentialsEnrollmentsController createCustomerController = ctx.getBean(CreateCredentialsEnrollmentsController.class);
		logger.debug("CreateCredentialsEnrollmentsASOConfig enviar: fin");
		return createCustomerController.createCredentialEnrollment(filtro, tsec, contactID);
	}
}
