package pe.bbva.aso.servicios.createcustomer.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcustomer.controller.CreateCustomerController;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcustomer.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcustomer.properties" 
})
public class CreateCustomerASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCustomerASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateCustomer createCustomer(RequestCreateCustomer filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCustomerASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCustomerASOConfig.class);
		CreateCustomerController createCustomerController = ctx.getBean(CreateCustomerController.class);
		logger.debug("CreateCustomerASOConfig enviar: fin");
		return createCustomerController.createCustomer(filtro, tsec);
	}
}
