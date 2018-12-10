package pe.bbva.aso.servicios.createrqcardstampingorders.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createrqcardstampingorders.controller.CreateRqCardStampingOrdersController;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createrqcardstampingorders.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createrqcardstampingorders.properties" 
})
public class CreateRqCardStampingOrdersASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateRqCardStampingOrdersASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateRqCardStampingOrders createRqCardStampingOrders(RequestCreateRqCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateRqCardStampingOrdersASOConfig createRqCardStampingOrders: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateRqCardStampingOrdersASOConfig.class);
		CreateRqCardStampingOrdersController createRqCardStampingOrdersController = ctx.getBean(CreateRqCardStampingOrdersController.class);
		logger.debug("CreateRqCardStampingOrdersASOConfig createRqCardStampingOrders: fin");
		return createRqCardStampingOrdersController.createRqCardStampingOrders(filtro, tsec);
	}
}
