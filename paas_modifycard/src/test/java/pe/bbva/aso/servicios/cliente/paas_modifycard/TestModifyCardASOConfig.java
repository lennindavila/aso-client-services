package pe.bbva.aso.servicios.cliente.paas_modifycard;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycard.config.ModifyCardASOConfig;
import pe.bbva.aso.servicios.modifycard.dto.CardDTO;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.ResponseModifyCard;
import pe.bbva.aso.servicios.modifycard.dto.StatusDTO;

public class TestModifyCardASOConfig {
	@Test
	public void consultar() {		
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsecxx "+ tsec);	 	

		ModifyCardASOConfig obj = new ModifyCardASOConfig();
		RequestModifyCard filtro = new RequestModifyCard();
		StatusDTO estado = new StatusDTO();
		estado.setId("xxxxxxxxxx");
		filtro.setCardId("xxxxxxxxxx");
		filtro.setStatus(estado);
		
		ResponseModifyCard response = null;
		CardDTO data = null;

		try {
			response = obj.modifyCard(filtro, tsec);
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
