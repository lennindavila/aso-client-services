package pe.bbva.aso.servicios.cliente.paas_createsecurecontact;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createsecurecontact.config.CreateSecureContactASOConfig;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.ResponseCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.SecureContactDTO;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateSecureContactASOConfig {
	
	//@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateSecureContactASOConfig obj = new CreateSecureContactASOConfig();
		RequestCreateSecureContact filtro = new RequestCreateSecureContact();
		
		ResponseCreateSecureContact response = null;
		SecureContactDTO data = null;

		try {
			response = obj.createSecureContact(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getSecureContact();
					System.out.println("data "+ data.getId());
				}else {
					System.out.println(" ErrorCode: " + response.getErrorCode());
					System.out.println(" ErrorMessage: " + response.getErrorMessage());
				}
			}
		} catch (ServiceExceptionBBVA e) {
			if(e instanceof ValidacionExceptionBBVA) {
				ValidacionExceptionBBVA ev = (ValidacionExceptionBBVA) e;
				System.out.println("Handling validation exception getCode : " + ev.getErrores().getFieldError().getCode());
				System.out.println("Handling validation exception getField: " + ev.getErrores().getFieldError().getField());
				System.out.println("Handling validation exception : " + ev.getErrores().getFieldError().getField() + " " + ev.getErrores().getFieldError().getCode());
			}else {
				System.out.println("Handling any exception: " + e.getMessage());
			}		
			e.printStackTrace();
		}	 
	}
}
