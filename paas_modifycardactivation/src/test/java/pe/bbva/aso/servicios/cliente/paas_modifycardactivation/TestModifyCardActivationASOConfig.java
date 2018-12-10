package pe.bbva.aso.servicios.cliente.paas_modifycardactivation;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycardactivation.config.ModifyCardActivationASOConfig;
import pe.bbva.aso.servicios.modifycardactivation.dto.CardActivationDTO;
import pe.bbva.aso.servicios.modifycardactivation.dto.RequestModifyCardActivation;
import pe.bbva.aso.servicios.modifycardactivation.dto.ResponseModifyCardActivation;

public class TestModifyCardActivationASOConfig {
	
	//@Test
	public void consultar() {	 
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ModifyCardActivationASOConfig obj = new ModifyCardActivationASOConfig();
		 RequestModifyCardActivation filtro = new RequestModifyCardActivation();
		 //url
		 filtro.setCardId("************3987001102405001327744");
		 filtro.setActivationId("CASHWITHDRAWAL_ACTIVATION");
		 //Body Request
		 filtro.setIsActive("true");
		
		 ResponseModifyCardActivation response = null;
		 CardActivationDTO data = null;

		try {
			response = obj.modifyCardActivation(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getCardActivation();
					System.out.println("data "+ data.toString());
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
