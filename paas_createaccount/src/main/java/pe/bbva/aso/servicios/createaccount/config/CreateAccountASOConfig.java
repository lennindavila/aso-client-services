package pe.bbva.aso.servicios.createaccount.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createaccount.controller.CreateAccountController;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;
import pe.bbva.aso.servicios.session.SessionASO;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createaccount.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createaccount.properties" 
})
public class CreateAccountASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateAccountASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateAccount createAccount(RequestCreateAccount filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateAccountASOConfig enviar: inicio");
		
		SessionASO.session.put("usuario","lennin");
		logger.debug("CreateAccountASOConfig enviar: inicio session " + SessionASO.session.get("usuario"));
		
		ctx = new AnnotationConfigApplicationContext(CreateAccountASOConfig.class);		
		CreateAccountController createAccountController = ctx.getBean(CreateAccountController.class);
		logger.debug("CreateAccountASOConfig enviar: fin");
		return createAccountController.createAccount(filtro, tsec);
	}
}
