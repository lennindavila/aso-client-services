package pe.bbva.aso.servicios.listaclientes.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.listaclientes.controller.ListarClientesController;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.listaclientes.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_listcustomers.properties" 
})
public class ListCustomersASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(ListCustomersASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
	public static final String ServiceName = "ListCustomers";

	public ResponseListCustomers consultarCliente(RequestListCustomers filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCustomersASOConfig enviar: inicio");
		ResponseListCustomers listCustomers = null;
		ctx = new AnnotationConfigApplicationContext(ListCustomersASOConfig.class);
		ListarClientesController listarClientesController = ctx.getBean(ListarClientesController.class);		
		listCustomers = listarClientesController.consultarCliente(filtro, tsec);
		logger.debug("ListCustomersASOConfig enviar: fin");
		return listCustomers;
	}
}
