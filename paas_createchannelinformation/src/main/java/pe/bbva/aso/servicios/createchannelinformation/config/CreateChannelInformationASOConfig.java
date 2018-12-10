package pe.bbva.aso.servicios.createchannelinformation.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createchannelinformation.controller.CreateChannelInformationController;
import pe.bbva.aso.servicios.createchannelinformation.dto.RequestCreateChannelInformation;
import pe.bbva.aso.servicios.createchannelinformation.dto.ResponseCreateChannelInformation;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createchannelinformation.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createchannelinformation.properties" 
})
public class CreateChannelInformationASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateChannelInformationASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateChannelInformation createChannelInformation(RequestCreateChannelInformation filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateChannelInformationASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateChannelInformationASOConfig.class);
		CreateChannelInformationController createChannelInformationController = ctx.getBean(CreateChannelInformationController.class);
		logger.debug("CreateChannelInformationASOConfig enviar: fin");
		return createChannelInformationController.createChannelInformation(filtro, tsec);
	}
}
