package pe.bbva.aso.servicios.cliente.paas_listcards;

import java.util.List;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.listcards.config.ListCardsASOConfig;
import pe.bbva.aso.servicios.listcards.dto.CardsDTO;
import pe.bbva.aso.servicios.listcards.dto.CustomerDTO;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;

public class TestListCardsASOConfig {
	
    @Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}
		System.out.println("tsec "+ tsec);	
		
		ListCardsASOConfig obj = new ListCardsASOConfig();
		RequestListCards filtro = new RequestListCards();
		CustomerDTO customer = new CustomerDTO();
		customer.setId("46995525");
		filtro.setCustomer(customer);

		ResponseListCards response = null;
		List<CardsDTO> data = null;
		try {
		 response = obj.listCards(filtro, tsec);
		 if(response!=null) {
			 if(!response.hasError()) {
				 data = response.getData();
				 System.out.println("data "+ data.get(0).getNumber());
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
