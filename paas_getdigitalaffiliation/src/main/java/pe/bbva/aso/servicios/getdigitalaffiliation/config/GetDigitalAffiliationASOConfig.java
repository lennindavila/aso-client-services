package pe.bbva.aso.servicios.getdigitalaffiliation.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.getdigitalaffiliation.controller.GetDigitalAffiliationController;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.getdigitalaffiliation.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_getdigitalaffiliation.properties" 
})
public class GetDigitalAffiliationASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GetDigitalAffiliationASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;	

	public ResponseGetDigitalAffiliation getDigitalAffiliation(RequestGetDigitalAffiliation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetDigitalAffiliationASOConfig getDigitalAffiliation: inicio");
		ctx = new AnnotationConfigApplicationContext(GetDigitalAffiliationASOConfig.class);
		GetDigitalAffiliationController getDigitalAffiliationController = ctx.getBean(GetDigitalAffiliationController.class);
		logger.debug("GetDigitalAffiliationASOConfig getDigitalAffiliation: fin");
		return getDigitalAffiliationController.getDigitalAffiliation(filtro, tsec);
	}
}
