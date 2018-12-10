package pe.bbva.aso.servicios.getcustomerterm.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.getcustomerterm.controller.GetCustomerTermController;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;
import pe.bbva.aso.servicios.getcustomerterm.dto.ResponseGetCustomerTerm;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.getcustomerterm.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_getcustomerterm.properties" 
})
public class GetCustomerTermASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GetCustomerTermASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseGetCustomerTerm getCustomerTerm(RequestGetCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetCustomerTermASOConfig getCustomerTerm: inicio");
		ctx = new AnnotationConfigApplicationContext(GetCustomerTermASOConfig.class);
		GetCustomerTermController getCustomerTermController = ctx.getBean(GetCustomerTermController.class);
		logger.debug("GetCustomerTermASOConfig getCustomerTerm: fin");
		return getCustomerTermController.getCustomerTerm(filtro, tsec);
	}
}
