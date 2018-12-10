package pe.bbva.aso.servicios.modifycard.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycard.controller.ModifyCardController;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycard.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycard.properties" 
})
public class ModifyCardASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyCardASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public ResponseModifyCard modifyCard(RequestModifyCard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardASOConfig modifyCard: inicio 897");
		
		ctx = new AnnotationConfigApplicationContext(ModifyCardASOConfig.class);
		ModifyCardController modifyCardController = ctx.getBean(ModifyCardController.class);
		logger.debug("ModifyCardASOConfig modifyCard: fin");
		return modifyCardController.modifyCard(filtro, tsec);
	}
}
