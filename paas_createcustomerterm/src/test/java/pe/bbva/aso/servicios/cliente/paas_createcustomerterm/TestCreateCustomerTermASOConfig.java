package pe.bbva.aso.servicios.cliente.paas_createcustomerterm;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcustomerterm.config.CreateCustomerTermASOConfig;
import pe.bbva.aso.servicios.createcustomerterm.dto.CustomerTermDTO;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.ResponseCreateCustomerTerm;
import pe.bbva.aso.servicios.createcustomerterm.dto.StatusDTO;
import pe.bbva.aso.servicios.createcustomerterm.dto.TermTypeDTO;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateCustomerTermASOConfig {

	@Test
	public void consultar() {	
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateCustomerTermASOConfig obj = new CreateCustomerTermASOConfig();
		RequestCreateCustomerTerm filtro = new RequestCreateCustomerTerm();
		TermTypeDTO termType = new TermTypeDTO();
		StatusDTO status = new StatusDTO();
		termType.setId("001");
		status.setId("S");
		filtro.setTermType(termType);
		filtro.setStatus(status);	

		ResponseCreateCustomerTerm response = null;
		CustomerTermDTO data = null;

		try {
			response = obj.createCustomerTerm(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getTermId());
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
