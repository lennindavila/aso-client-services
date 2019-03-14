package pe.bbva.aso.servicios.cliente.paas_modifycontactdetail;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycontactdetail.config.ModifyContactDetailASOConfig;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ContactDetailDTO;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ContactTypeDTO;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

public class TestModifyContactDetailASOConfig {
	
	@Test
	public void consultar() {	 
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ModifyContactDetailASOConfig obj = new ModifyContactDetailASOConfig();
		RequestModifyContactDetail filtro = new RequestModifyContactDetail();
		
		filtro.setCustomerId("97163090");
		filtro.setContactDetailId("C001982078451");
		ContactDetailDTO data1 = new ContactDetailDTO();
		data1.setContact("982078451");
		ContactTypeDTO contactType = new ContactTypeDTO();
		contactType.setId("MOBILE_NUMBER_1");
		//contactType.setName("MOBILE_NUMBER");
		data1.setContactType(contactType);
		filtro.setData(data1);
		
		ResponseModifyContactDetail response = null;
		ContactDetailDTO data = null;

		try {
			response = obj.modifyContactDetail(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getContact());
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
