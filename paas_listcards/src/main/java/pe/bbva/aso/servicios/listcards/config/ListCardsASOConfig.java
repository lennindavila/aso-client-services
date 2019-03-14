package pe.bbva.aso.servicios.listcards.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listcards.controller.ListCardsController;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listcards.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listcards.properties" 
})
public class ListCardsASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListCardsASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseListCards listCards(RequestListCards filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCardsASOConfig listCards: inicio");
		ctx = new AnnotationConfigApplicationContext(ListCardsASOConfig.class);
		ListCardsController listCardsController = ctx.getBean(ListCardsController.class);
		ResponseListCards response = listCardsController.listCards(filtro, tsec);
		logger.debug("ListCardsASOConfig listCards: fin");
		return response;
	}
}
