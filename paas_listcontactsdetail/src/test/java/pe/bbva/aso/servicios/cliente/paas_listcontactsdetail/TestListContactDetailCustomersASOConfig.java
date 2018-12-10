package pe.bbva.aso.servicios.cliente.paas_listcontactsdetail;

import java.util.List;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.listcontactdetail.config.ListContactDetailASOConfig;
import pe.bbva.aso.servicios.listcontactdetail.dto.ContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

public class TestListContactDetailCustomersASOConfig {
	
	@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ListContactDetailASOConfig obj = new ListContactDetailASOConfig();
		RequestListContactDetailDTO filtro = new RequestListContactDetailDTO();
		filtro.setCustomerId("97169969");
		
		ResponseContactDetailDTO response = null;
		List<ContactDetailDTO> data = null;

		try {
			response = obj.listContactDetail(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.get(0).getContact());
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
