package pe.bbva.aso.servicios.cliente.paas_createrqcardstampingorders;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createrqcardstampingorders.config.CreateRqCardStampingOrdersASOConfig;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.ResponseCreateRqCardStampingOrders;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RqCardStampingOrdersDTO;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateRqCardStampingOrdersASOConfig {

	//@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateRqCardStampingOrdersASOConfig obj = new CreateRqCardStampingOrdersASOConfig();
		RequestCreateRqCardStampingOrders filtro = new RequestCreateRqCardStampingOrders();
		
		ResponseCreateRqCardStampingOrders response = null;
		RqCardStampingOrdersDTO data = null;

		try {
			response = obj.createRqCardStampingOrders(filtro, tsec);
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
