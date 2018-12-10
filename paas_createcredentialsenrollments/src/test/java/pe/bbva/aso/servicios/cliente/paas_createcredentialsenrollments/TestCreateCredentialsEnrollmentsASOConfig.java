package pe.bbva.aso.servicios.cliente.paas_createcredentialsenrollments;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcredentialsenrollments.config.CreateCredentialsEnrollmentsASOConfig;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.ResponseCredentialsEnrollments;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateCredentialsEnrollmentsASOConfig {

	@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateCredentialsEnrollmentsASOConfig obj = new CreateCredentialsEnrollmentsASOConfig();
		RequestCredentialsEnrollments filtro = new RequestCredentialsEnrollments();
		filtro.setOriginAppId("13000004");
		filtro.setOriginUserId("L42271281");
		filtro.setPasswordValue("algunPassword");

		ResponseCredentialsEnrollments response = null;
		String data = null;

		try {
			response = obj.createCredentialEnrollment(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getConsumerRequestId();
					System.out.println("data "+ data);
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
