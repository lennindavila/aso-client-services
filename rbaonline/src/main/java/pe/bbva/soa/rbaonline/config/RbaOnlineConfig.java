package pe.bbva.soa.rbaonline.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;
import com.google.gson.Gson;

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
	
	private Gson json = new Gson();

	public SalidaOnlineDTO consultar(EntradaOnlineDTO filtro) {
		logger.info("RbaOnlineConfig consultar: inicio");
		logger.info("RbaOnlineConfig consultar: parameters request: " + json.toJson(filtro));
		SalidaOnlineDTO rbaResponse=null;
		try {
			ctx = new AnnotationConfigApplicationContext(RbaOnlineConfig.class);
			RbaOnlineController objController = ctx.getBean(RbaOnlineController.class);		
			rbaResponse = objController.consultar(filtro);
		} catch (Exception e) {
			e.printStackTrace();			
		}
		logger.info("RbaOnlineConfig consultar: parameters response: " + json.toJson(rbaResponse));
		logger.info("RbaOnlineConfig consultar: fin");
		return rbaResponse;
	}
}
