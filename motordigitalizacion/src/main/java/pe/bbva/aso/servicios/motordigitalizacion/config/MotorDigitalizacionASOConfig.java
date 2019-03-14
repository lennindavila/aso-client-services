package pe.bbva.aso.servicios.motordigitalizacion.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.motordigitalizacion.controller.MotorDigitalizacionController;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestFileUnico;

@Configuration
@ComponentScan(basePackages = {
			   "pe.bbva.aso.servicios.motordigitalizacion.*" }, 
			   basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/motordigitalizacion.properties" 
})
public class MotorDigitalizacionASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(MotorDigitalizacionASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
	
	public ZicResult envioContrato(RequestFileUnico request) {
		logger.debug("MotorDigitalizacionASOConfig envioContrato: inicio");
		ZicResult response=null;
		try {
			ctx = new AnnotationConfigApplicationContext(MotorDigitalizacionASOConfig.class);
			MotorDigitalizacionController motorDigitalizacionController = ctx.getBean(MotorDigitalizacionController.class);
			response = motorDigitalizacionController.ejecutarEnvioContrato(request);
			logger.debug("MotorDigitalizacionASOConfig envioContrato: fin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public ZicResult generarDocumentos(RequestFileUnico request)throws Exception  {
		logger.debug("MotorDigitalizacionASOConfig generarDocumentos: inicio");
		ZicResult response=null;
		try {
			ctx = new AnnotationConfigApplicationContext(MotorDigitalizacionASOConfig.class);
			MotorDigitalizacionController motorDigitalizacionController = ctx.getBean(MotorDigitalizacionController.class);
			response = motorDigitalizacionController.ejecutarGenerarDocumentos(request);
			logger.debug("MotorDigitalizacionASOConfig generarDocumentos: fin");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
}
