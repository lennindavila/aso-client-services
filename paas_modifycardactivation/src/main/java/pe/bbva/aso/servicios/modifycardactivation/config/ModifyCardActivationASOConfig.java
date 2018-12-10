package pe.bbva.aso.servicios.modifycardactivation.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycardactivation.controller.ModifyCardActivationController;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycardactivation.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycardactivation.properties" 
})
public class ModifyCardActivationASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyCardActivationASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseModifyCardActivation modifyCardActivation(RequestModifyCardActivation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardActivationASOConfig modifyCardActivation: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyCardActivationASOConfig.class);
		ModifyCardActivationController modifyIndicatorController = ctx.getBean(ModifyCardActivationController.class);
		logger.debug("ModifyCardActivationASOConfig modifyCardActivation: fin");
		ResponseModifyCardActivation respuesta = modifyIndicatorController.modifyCardActivation(filtro, tsec);
		return respuesta;
	}
}
