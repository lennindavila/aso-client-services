package pe.bbva.aso.servicios.listcustomerindicators.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listcustomerindicators.controller.ListCustomerIndicatorsController;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;
import pe.bbva.aso.servicios.listcustomerindicators.dto.ResponseCustomerIndicators;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listcustomerindicators.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listcustomerindicators.properties" 
})
public class ListCustomerIndicatorsASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListCustomerIndicatorsASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;	

	public ResponseCustomerIndicators listCustomerIndicators(RequestListCustomersIndicators filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCustomerIndicatorsASOConfig listCustomerIndicators: inicio");
		ctx = new AnnotationConfigApplicationContext(ListCustomerIndicatorsASOConfig.class);
		ListCustomerIndicatorsController listCustomerIndicatorsController = ctx.getBean(ListCustomerIndicatorsController.class);
		logger.debug("ListCustomerIndicatorsASOConfig listCustomerIndicators: fin");
		return listCustomerIndicatorsController.listCustomerIndicators(filtro, tsec);
	}
}
