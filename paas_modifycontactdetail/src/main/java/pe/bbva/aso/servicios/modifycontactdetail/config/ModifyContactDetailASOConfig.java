package pe.bbva.aso.servicios.modifycontactdetail.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.modifycontactdetail.controller.ModifyContactDetailController;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.modifycontactdetail.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_modifycontactdetail.properties" 
})
public class ModifyContactDetailASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ModifyContactDetailASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyContactDetailASOConfig modifyContactDetail: inicio");
		ctx = new AnnotationConfigApplicationContext(ModifyContactDetailASOConfig.class);
		ModifyContactDetailController modifyContactDetailController = ctx.getBean(ModifyContactDetailController.class);
		ResponseModifyContactDetail response = modifyContactDetailController.modifyContactDetail(filtro, tsec);
		logger.debug("ModifyContactDetailASOConfig modifyContactDetail: fin");
		return response;
	}
}
