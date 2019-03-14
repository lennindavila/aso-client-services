package pe.bbva.aso.servicios.cliente.paas_modifycustomerterm;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycustomerterm.config.ModifyCustomerTermASOConfig;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.StatusDTO;

public class TestModifyCustomerTermASOConfig {

	@Test
	public void consultar() {	
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ModifyCustomerTermASOConfig obj = new ModifyCustomerTermASOConfig();
		RequestModifyCustomerTerm filtro = new RequestModifyCustomerTerm();
		
		StatusDTO status = new StatusDTO();	
		status.setId("ACCEPTED");		
		filtro.setStatus(status);
		filtro.setCustomerId("90025131");
		filtro.setTermId("001");
		filtro.setTermVersion("dfsdfsd");
		
		ResponseModifyCustomerTerm response = null;
	
		try {
			response = obj.modifyCustomerTerm(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {					
					System.out.println("data vacia ");
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

