package pe.bbva.aso.servicios.createaccountrelatedcontract.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.createaccountrelatedcontract.controller.CreateAccountRelatedContractController;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.createaccountrelatedcontract.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_createaccountrelatedcontract.properties" 
})
public class CreateAccountRelatedContractASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(CreateAccountRelatedContractASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public ResponseCreateAccountRelatedContract createAccountRelatedContract(RequestCreateAccountRelatedContract filtro,String tsec) throws ServiceExceptionBBVA {
		logger.debug("CreateAccountRelatedContractASOConfig createAccountRelatedContract: inicio");
		ctx = new AnnotationConfigApplicationContext(CreateAccountRelatedContractASOConfig.class);
		CreateAccountRelatedContractController createAccountRelatedContractController = ctx.getBean(CreateAccountRelatedContractController.class);
		ResponseCreateAccountRelatedContract response = createAccountRelatedContractController.createAccountRelatedContract(filtro, tsec);
		logger.debug("CreateAccountRelatedContractASOConfig createAccountRelatedContract: fin");
		return response;
	}
}
