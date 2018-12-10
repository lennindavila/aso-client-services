package pe.bbva.aso.servicios.createsecurecontact.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createsecurecontact.controller.CreateSecureContactController;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createsecurecontact.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createsecurecontact.properties" 
})
public class CreateSecureContactASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateSecureContactASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateSecureContact createSecureContact(RequestCreateSecureContact filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateSecureContactASOConfig createSecureContact: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateSecureContactASOConfig.class);
		CreateSecureContactController createSecureContactController = ctx.getBean(CreateSecureContactController.class);
		logger.debug("CreateSecureContactASOConfig createSecureContact: fin");
		return createSecureContactController.createSecureContact(filtro, tsec);
	}
}
