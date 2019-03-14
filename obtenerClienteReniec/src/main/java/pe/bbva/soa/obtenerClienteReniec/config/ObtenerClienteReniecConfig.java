package pe.bbva.soa.obtenerClienteReniec.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.soa.obtenerClienteReniec.controller.ObtenerClienteReniecController;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.soa.obtenerClienteReniec.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/reniec_obtenercliente.properties" 
})
public class ObtenerClienteReniecConfig{
	final static Logger logger = (Logger) LoggerFactory.getLogger(ObtenerClienteReniecConfig.class);

	private static AnnotationConfigApplicationContext ctx;

	public ConsultaPorDNIResponse consultar(ConsultaPorDNIDTO filtro) {
		logger.debug("ObtenerClienteReniecConfig consultar: inicio");
		ConsultaPorDNIResponse listCustomers=null;
		try {
		ctx = new AnnotationConfigApplicationContext(ObtenerClienteReniecConfig.class);
		ObtenerClienteReniecController listarClientesController = ctx.getBean(ObtenerClienteReniecController.class);		
			listCustomers = listarClientesController.consultar(filtro);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		logger.debug("ObtenerClienteReniecConfig consultar: fin");
		return listCustomers;
	}
}
