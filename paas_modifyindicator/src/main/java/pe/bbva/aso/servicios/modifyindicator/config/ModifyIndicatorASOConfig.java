package pe.bbva.aso.servicios.modifyindicator.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifyindicator.controller.ModifyIndicatorController;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifyindicator.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifyindicator.properties" 
})
public class ModifyIndicatorASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyIndicatorASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseModifyIndicator modifyIndicator(RequestModifyIndicator filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyIndicatorASOConfig modifyIndicator: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyIndicatorASOConfig.class);
		ModifyIndicatorController modifyIndicatorController = ctx.getBean(ModifyIndicatorController.class);
		ResponseModifyIndicator response = modifyIndicatorController.modifyIndicator(filtro, tsec);
		logger.debug("ModifyIndicatorASOConfig modifyIndicator: fin");
		return response;
	}
}
