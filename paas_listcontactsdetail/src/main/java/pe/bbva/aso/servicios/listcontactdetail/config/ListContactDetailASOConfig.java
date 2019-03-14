package pe.bbva.aso.servicios.listcontactdetail.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listcontactdetail.controller.ListContactDetailController;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listcontactdetail.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listcontactsdetail.properties" 
})
public class ListContactDetailASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListContactDetailASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
	
	public ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListContactDetailASOConfig listContactDetail: inicio");
		ctx = new AnnotationConfigApplicationContext(ListContactDetailASOConfig.class);
		ListContactDetailController listContactDetailController = ctx.getBean(ListContactDetailController.class);
		ResponseContactDetailDTO response = listContactDetailController.listContactDetail(filtro, tsec);
		logger.debug("ListContactDetailASOConfig listContactDetail: fin");
		return response;
	}
}
