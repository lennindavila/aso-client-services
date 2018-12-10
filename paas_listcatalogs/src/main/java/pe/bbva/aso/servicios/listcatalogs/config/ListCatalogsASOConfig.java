package pe.bbva.aso.servicios.listcatalogs.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listcatalogs.controller.ListCatalogsController;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listcatalogs.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listcatalogs.properties" 
})
public class ListCatalogsASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListCatalogsASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseListCatalogs listCatalogs(RequestListCatalogs filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCatalogsASOConfig listCatalogs: inicio");
		ctx = new AnnotationConfigApplicationContext(ListCatalogsASOConfig.class);
		ListCatalogsController listCatalogsController = ctx.getBean(ListCatalogsController.class);
		logger.debug("ListCatalogsASOConfig listCatalogs: fin");
		return listCatalogsController.listCatalogs(filtro, tsec);
	}
}
