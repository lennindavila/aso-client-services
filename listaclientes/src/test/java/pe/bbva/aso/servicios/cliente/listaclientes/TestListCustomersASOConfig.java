package pe.bbva.aso.servicios.cliente.listaclientes;

import java.util.List;

//import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.listaclientes.config.ListCustomersASOConfig;
import pe.bbva.aso.servicios.listaclientes.dto.CustomerDTO;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;

public class TestListCustomersASOConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(TestListCustomersASOConfig.class);
	
	//@Test
	public void consultar() {
		logger.info("TestListCustomersASOConfig consultar - inicio: ");
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 

		ListCustomersASOConfig obj = new ListCustomersASOConfig();
		RequestListCustomers filtro = new RequestListCustomers();
		filtro.setDocumentNumber("42633441");
		filtro.setDocumentTypeId("DNI");
		//filtro.setCustomer(new CustomerDTO());		 

		ResponseListCustomers response = null;
		List<CustomerDTO> data = null;
		try {
			response = obj.consultarCliente(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()){
					data = response.getData();
					System.out.println("data "+ data.get(0).getCustomerId());
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
