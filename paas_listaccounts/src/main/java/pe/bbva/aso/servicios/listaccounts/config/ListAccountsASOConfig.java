package pe.bbva.aso.servicios.listaccounts.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listaccounts.controller.ListAccountsController;
import pe.bbva.aso.servicios.listaccounts.dto.RequestListAccounts;
import pe.bbva.aso.servicios.listaccounts.dto.ResponseListAccounts;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listaccounts.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listaccounts.properties" 
})
public class ListAccountsASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListAccountsASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseListAccounts listAccounts(RequestListAccounts filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListAccountsASOConfig listAccounts: inicio");
		ctx = new AnnotationConfigApplicationContext(ListAccountsASOConfig.class);
		ListAccountsController listAccountsController = ctx.getBean(ListAccountsController.class);
		logger.debug("ListAccountsASOConfig listAccounts: fin");
		return listAccountsController.listAccounts(filtro, tsec);
	}
}
