package pe.bbva.soa.rbaonline.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.soa.rbaonline.controller.RbaOnlineController;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.soa.rbaonline.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/rbaonline.properties" 
})
public class RbaOnlineConfig{
	final static Logger logger = (Logger) LoggerFactory.getLogger(RbaOnlineConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public SalidaOnlineDTO consultar(EntradaOnlineDTO filtro) {
		logger.info("consultar enviar: inicio");
		SalidaOnlineDTO rbaResponse=null;
		try {
		ctx = new AnnotationConfigApplicationContext(RbaOnlineConfig.class);
		RbaOnlineController objController = ctx.getBean(RbaOnlineController.class);
		logger.debug("consultar enviar: fin");
		rbaResponse = objController.consultar(filtro);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return rbaResponse;
	}
}
