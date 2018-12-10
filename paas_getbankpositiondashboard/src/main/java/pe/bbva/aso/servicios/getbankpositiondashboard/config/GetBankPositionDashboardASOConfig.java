package pe.bbva.aso.servicios.getbankpositiondashboard.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.getbankpositiondashboard.controller.GetBankPositionDashboardController;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.getbankpositiondashboard.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_getbankpositiondashboard.properties" 
})
public class GetBankPositionDashboardASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GetBankPositionDashboardASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseGetBankPositionDashboard getBankPositionDashboard(RequestGetBankPositionDashboard filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetBankPositionDashboardASOConfig getBankPositionDashboard: inicio");
		ctx = new AnnotationConfigApplicationContext(GetBankPositionDashboardASOConfig.class);
		GetBankPositionDashboardController getBankPositionDashboardController = ctx.getBean(GetBankPositionDashboardController.class);
		logger.debug("GetBankPositionDashboardASOConfig getBankPositionDashboard: fin");
		return getBankPositionDashboardController.getBankPositionDashboard(filtro, tsec);
	}
}
