package pe.bbva.aso.servicios.createcontactdetail.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcontactdetail.controller.CreateContactDetailController;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcontactdetail.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcontactdetail.properties" 
})
public class CreateContactDetailASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateContactDetailASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateContactDetail createContactDetail(RequestCreateContactDetail filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateContactDetailASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateContactDetailASOConfig.class);
		CreateContactDetailController createContactDetailController = ctx.getBean(CreateContactDetailController.class);
		logger.debug("CreateContactDetailASOConfig enviar: fin");
		return createContactDetailController.createContactDetail(filtro, tsec);
	}
}
