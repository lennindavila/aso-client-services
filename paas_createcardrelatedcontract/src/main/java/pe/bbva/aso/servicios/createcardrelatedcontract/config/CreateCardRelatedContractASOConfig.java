package pe.bbva.aso.servicios.createcardrelatedcontract.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createcardrelatedcontract.controller.CreateCardRelatedContractController;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createcardrelatedcontract.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createcardrelatedcontract.properties" 
})
public class CreateCardRelatedContractASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateCardRelatedContractASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateCardRelatedContract createCardRelatedContract(RequestCreateCardRelatedContract filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateCardRelatedContractASOConfig createCardRelatedContract: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateCardRelatedContractASOConfig.class);
		CreateCardRelatedContractController createCardRelatedContractController = ctx.getBean(CreateCardRelatedContractController.class);
		ResponseCreateCardRelatedContract respuesta = createCardRelatedContractController.createCardRelatedContract(filtro, tsec);
		logger.debug("CreateCardRelatedContractASOConfig createCardRelatedContract: fin");
		return respuesta;
	}
}
