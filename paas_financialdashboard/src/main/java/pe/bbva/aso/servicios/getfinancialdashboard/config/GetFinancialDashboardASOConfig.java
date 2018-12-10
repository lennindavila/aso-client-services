package pe.bbva.aso.servicios.getfinancialdashboard.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.getfinancialdashboard.controller.GetFinancialDashboardController;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.getfinancialdashboard.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_getfinancialdashboard.properties" 
})
public class GetFinancialDashboardASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GetFinancialDashboardASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseGetFinancialDashboard getFinancialDashboard(RequestGetFinancialDashboard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetFinancialDashboardASOConfig getFinancialDashboard: inicio");
		ctx = new AnnotationConfigApplicationContext(GetFinancialDashboardASOConfig.class);
		GetFinancialDashboardController getFinancialDashboardController = ctx.getBean(GetFinancialDashboardController.class);
		logger.debug("GetFinancialDashboardASOConfig getFinancialDashboard: fin");
		return getFinancialDashboardController.getFinancialDashboard(filtro, tsec);
	}
}
