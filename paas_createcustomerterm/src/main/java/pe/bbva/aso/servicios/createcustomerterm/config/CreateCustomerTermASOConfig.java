package pe.bbva.aso.servicios.createcustomerterm.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcustomerterm.controller.CreateCustomerTermController;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcustomerterm.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcustomerterm.properties" 
})
public class CreateCustomerTermASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCustomerTermASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateCustomerTerm createCustomerTerm(RequestCreateCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCustomerTermASOConfig createCustomerTerm: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCustomerTermASOConfig.class);
		CreateCustomerTermController createCustomerTermController = ctx.getBean(CreateCustomerTermController.class);
		logger.debug("CreateCustomerTermASOConfig createCustomerTerm: fin");
		return createCustomerTermController.createCustomerTerm(filtro, tsec);
	}
}
