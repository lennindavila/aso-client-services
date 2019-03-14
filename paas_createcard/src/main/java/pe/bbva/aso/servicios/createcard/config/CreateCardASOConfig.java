package pe.bbva.aso.servicios.createcard.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcard.controller.CreateCardController;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;
import pe.bbva.aso.servicios.createcard.dto.ResponseCreateCard;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcard.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcard.properties" 
})
public class CreateCardASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCardASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateCard createCard(RequestCreateCard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardASOConfig createCard: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCardASOConfig.class);
		CreateCardController createCardController = ctx.getBean(CreateCardController.class);
		ResponseCreateCard response = createCardController.createCard(filtro, tsec);
		logger.debug("CreateCardASOConfig createCard: fin");
		return response;
	}
}
