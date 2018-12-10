package pe.bbva.aso.servicios.createcardstampingorders.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcardstampingorders.controller.CreateCardStampingOrdersController;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;
import pe.bbva.aso.servicios.createcardstampingorders.dto.ResponseCreateCardStampingOrders;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcardstampingorders.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcardstampingorders.properties" 
})
public class CreateCardStampingOrdersASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCardStampingOrdersASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateCardStampingOrders createCardStampingOrders(RequestCreateCardStampingOrders filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardStampingOrdersASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCardStampingOrdersASOConfig.class);
		CreateCardStampingOrdersController createCardStampingOrdersController = ctx.getBean(CreateCardStampingOrdersController.class);
		logger.debug("CreateCardStampingOrdersASOConfig enviar: fin");
		return createCardStampingOrdersController.createCardStampingOrders(filtro, tsec);
	}
}
