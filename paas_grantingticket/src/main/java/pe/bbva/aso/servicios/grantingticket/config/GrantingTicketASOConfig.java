package pe.bbva.aso.servicios.grantingticket.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.aso.servicios.cliente.base.resttemplate.ServiciosASOAutenticadoConfig;
import pe.bbva.aso.servicios.grantingticket.controller.GrantingTicketController;
import pe.bbva.aso.servicios.grantingticket.dto.AuthenticationDTO;
import pe.bbva.aso.servicios.grantingticket.dto.AuthenticationDataDTO;
import pe.bbva.aso.servicios.grantingticket.dto.BackendUserRequestDTO;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;

@Configuration
@ComponentScan(
		basePackages = {"pe.bbva.aso.servicios.grantingticket.*" },
		basePackageClasses = SpringConfigurableMapper.class)
@PropertySource({ 
	"file:${PROPERTIEFILE}/aso_servicios.properties",
	"file:${PROPERTIEFILE}/servicios/${aso.servicios.ruta.ambiente}/paas_grantingticket.properties" 
})
public class GrantingTicketASOConfig extends ServiciosASOAutenticadoConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(GrantingTicketASOConfig.class);

	private static AnnotationConfigApplicationContext ctx;
		
	public String consultar(RequestGrantingTicket filtro) {
		logger.debug("GrantingTicketASOConfig enviar: inicio filtro " + filtro.getAuthentication().getUserID());
		ctx = new AnnotationConfigApplicationContext(GrantingTicketASOConfig.class);
		GrantingTicketController getFinancialDashboardController = ctx.getBean(GrantingTicketController.class);
		logger.debug("GrantingTicketASOConfig enviar: fin");
		return getFinancialDashboardController.consultar(filtro);
	}
	
	public String obtenerTsec() {
		 GrantingTicketASOConfig objGrantingTicket = new GrantingTicketASOConfig();
		 RequestGrantingTicket rqGrantingTicket = new RequestGrantingTicket();
		 AuthenticationDTO authenticationDTO = new AuthenticationDTO();
		 authenticationDTO.setUserID("L43500890");
		 authenticationDTO.setConsumerID("13000035");
		 authenticationDTO.setAuthenticationType("02");
		 AuthenticationDataDTO authenticationDataDTO = new AuthenticationDataDTO();
		 List<String> listAuthenticationData = new ArrayList<String>();
		 listAuthenticationData.add("gestion11");
		 authenticationDataDTO.setAuthenticationData(listAuthenticationData);
		 authenticationDataDTO.setIdAuthenticationData("password");
		 List<AuthenticationDataDTO> listauthenticationDataDTO= new ArrayList<AuthenticationDataDTO>();
		 listauthenticationDataDTO.add(authenticationDataDTO);
		 
		 BackendUserRequestDTO backendUserRequestDTO = new BackendUserRequestDTO();
		 backendUserRequestDTO.setUserID("");
		 backendUserRequestDTO.setAccessCode("L43500890");
		 backendUserRequestDTO.setDialogId("");
		 
		 authenticationDTO.setAuthenticationData(listauthenticationDataDTO);
		 rqGrantingTicket.setAuthentication(authenticationDTO);
		 rqGrantingTicket.setBackendUserRequest(backendUserRequestDTO);
		 
		 String tsec = objGrantingTicket.consultar(rqGrantingTicket);		
		 return tsec;
	}
}
