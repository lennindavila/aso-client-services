package pe.bbva.aso.servicios.modifycardblock.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycardblock.controller.ModifyCardBlockController;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycardblock.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycardblock.properties" 
})
public class ModifyCardBlockASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyCardBlockASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseModifyCardBlock modifyCardBlock(RequestModifyCardBlock filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCardBlockASOConfig modifyCardBlock: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyCardBlockASOConfig.class);
		ModifyCardBlockController modifyIndicatorController = ctx.getBean(ModifyCardBlockController.class);		
		ResponseModifyCardBlock respuesta = modifyIndicatorController.modifyCardBlock(filtro, tsec);
		logger.debug("ModifyCardBlockASOConfig modifyCardBlock: fin");
		return respuesta;
	}
}
