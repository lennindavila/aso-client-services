package pe.bbva.aso.servicios.cliente.paas_createcontactdetail;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcontactdetail.config.CreateContactDetailASOConfig;
import pe.bbva.aso.servicios.createcontactdetail.dto.ContactDetailDTO;
import pe.bbva.aso.servicios.createcontactdetail.dto.ContactTypeDTO;
import pe.bbva.aso.servicios.createcontactdetail.dto.PhoneCompanyDTO;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;
import pe.bbva.aso.servicios.createcontactdetail.dto.ResponseCreateContactDetail;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateContactDetailASOConfig {
	
	@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateContactDetailASOConfig obj = new CreateContactDetailASOConfig();
		RequestCreateContactDetail filtro = new RequestCreateContactDetail();
		 filtro.setContact("qwer1011_6@HOTMAIL.COM");
		 ContactTypeDTO contactType = new ContactTypeDTO();
		 contactType.setId("EMAIL");
		 filtro.setContactType(contactType);
		 filtro.setCustomerId("97170208");
		 filtro.setRegionalCode("");
		 filtro.setExtension("");
		 //PhoneCompanyDTO phoneCompany = new PhoneCompanyDTO();
		 //phoneCompany.setId("B");
		 filtro.setIsPreferential("true");
		 filtro.setIsChecked("true");
		 //filtro.setPhoneCompany(phoneCompany);
		
		// {"customer-id":"97170208",
		//"contact":"qwer1011_4@HOTMAIL.COM",
		//"contactType":{"id":"EMAIL"},"regionalCode":"","extension":"","phoneCompany":null,"isPreferential":"true","isChecked":null}
		 
		 ResponseCreateContactDetail response = null;
		 ContactDetailDTO data = null;

		try {
			response = obj.createContactDetail(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getContactDetailId());
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
