package pe.bbva.servicios.biometricclient.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.servicios.biometricclient.controller.BiometricClientController;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;


@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.servicios.biometricclient.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/biometricclient.properties" 
})
public class BiometricClientASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(BiometricClientASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public AuthenticateResponse obtenerBiometrico(AuthenticateRequest request) throws ServiceExceptionBBVA {
		logger.debug("BiometricClientASOConfig obtenerBiometrico: inicio");
		AuthenticateResponse response = null;
		ctx = new AnnotationConfigApplicationContext(BiometricClientASOConfig.class);
		BiometricClientController controller = ctx.getBean(BiometricClientController.class);
		logger.debug("BiometricClientASOConfig obtenerBiometrico: fin");
		response = controller.obtenerBiometrico(request);
		return response;
	}
}
