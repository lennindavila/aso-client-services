package pe.bbva.aso.servicios.cliente.paas_grantingticket;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.grantingticket.dto.AuthenticationDTO;
import pe.bbva.aso.servicios.grantingticket.dto.AuthenticationDataDTO;
import pe.bbva.aso.servicios.grantingticket.dto.BackendUserRequestDTO;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;

public class TestGrantingTicketASOConfig {
	
   @Test
	public void consultar() {	 
	 GrantingTicketASOConfig obj = new GrantingTicketASOConfig();
	 RequestGrantingTicket filtro = new RequestGrantingTicket();
	 AuthenticationDTO authenticationDTO = new AuthenticationDTO();
	 authenticationDTO.setUserID("L43500890");
	 authenticationDTO.setConsumerID("13000035");
	 authenticationDTO.setAuthenticationType("02");
	 AuthenticationDataDTO authenticationDataDTO = new AuthenticationDataDTO();
	 List<String> listAuthenticationData = new ArrayList<String>();
	 listAuthenticationData.add("gestion12");
	 authenticationDataDTO.setAuthenticationData(listAuthenticationData);
	 authenticationDataDTO.setIdAuthenticationData("password");
	 List<AuthenticationDataDTO> listauthenticationDataDTO= new ArrayList<AuthenticationDataDTO>();
	 listauthenticationDataDTO.add(authenticationDataDTO);
	 
	 BackendUserRequestDTO backendUserRequestDTO = new BackendUserRequestDTO();
	 backendUserRequestDTO.setUserID("");
	 backendUserRequestDTO.setAccessCode("L43500890");
	 backendUserRequestDTO.setDialogId("");
	 
	 authenticationDTO.setAuthenticationData(listauthenticationDataDTO);
	 filtro.setAuthentication(authenticationDTO);
	 filtro.setBackendUserRequest(backendUserRequestDTO);
	 
	 String tsec = obj.consultar(filtro);
	 System.out.println("tsec valor "+tsec);
	}
}
