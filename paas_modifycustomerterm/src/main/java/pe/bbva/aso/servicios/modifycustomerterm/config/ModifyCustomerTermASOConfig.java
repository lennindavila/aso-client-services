package pe.bbva.aso.servicios.modifycustomerterm.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycustomerterm.controller.ModifyCustomerTermController;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycustomerterm.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycustomerterm.properties" 
})
public class ModifyCustomerTermASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyCustomerTermASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseModifyCustomerTerm modifyCustomerTerm(RequestModifyCustomerTerm filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCustomerTermASOConfig modifyCustomerTerm: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyCustomerTermASOConfig.class);
		ModifyCustomerTermController createCustomerTermController = ctx.getBean(ModifyCustomerTermController.class);
		ResponseModifyCustomerTerm response = createCustomerTermController.modifyCustomerTerm(filtro, tsec);
		logger.debug("ModifyCustomerTermASOConfig modifyCustomerTerm: fin");
		return response;
	}
}
