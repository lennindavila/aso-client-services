package pe.bbva.aso.servicios.gifole.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.gifole.controller.AperturaCuentaGifoleController;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.gifole.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_aperturacuentagifole.properties" 
})
public class AperturaCuentaGifoleASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(AperturaCuentaGifoleASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("AperturaCuentaGifoleASOConfig enviar: inicio");
		ctx = new AnnotationConfigApplicationContext(AperturaCuentaGifoleASOConfig.class);
		AperturaCuentaGifoleController aperturaCuentaGifoleController = ctx.getBean(AperturaCuentaGifoleController.class);
		logger.debug("AperturaCuentaGifoleASOConfig enviar: fin");
		return aperturaCuentaGifoleController.aperturaCuentaGifole(filtro);
	}
}
