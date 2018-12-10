package pe.bbva.aso.servicios.modifycardpin.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycardpin.controller.ModifyCardPinController;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.dto.ResponseModifyCardPin;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycardpin.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycardpin.properties" 
})
public class ModifyCardPinASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyCardPinASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public ResponseModifyCardPin modifyCardPin(String cardId,RequestModifyCardPin filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardPinASOConfig modifyCardPin: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyCardPinASOConfig.class);
		ModifyCardPinController modifyCardController = ctx.getBean(ModifyCardPinController.class);
		logger.debug("ModifyCardPinASOConfig modifyCardPin: fin");
		return modifyCardController.modifyCardPin(cardId,filtro, tsec);
	}
}
