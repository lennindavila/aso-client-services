package pe.bbva.aso.servicios.cliente.paas_modifycardpin;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycardpin.config.ModifyCardPinASOConfig;
import pe.bbva.aso.servicios.modifycardpin.dto.CardDTO;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;
import pe.bbva.aso.servicios.modifycardpin.dto.ResponseModifyCardPin;

public class TestModifyCardPinASOConfig {
	@Test
	public void consultar() {		
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);

		ModifyCardPinASOConfig obj = new ModifyCardPinASOConfig();
		RequestModifyCardPin filtro = new RequestModifyCardPin();		
		
		String cardId = "4919119021973505";
		filtro.setPin("0433A2E6FDE68CAF");
		
		ResponseModifyCardPin response = null;
		CardDTO data = null;

		try {
			response = obj.modifyCardPin(cardId,filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
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
