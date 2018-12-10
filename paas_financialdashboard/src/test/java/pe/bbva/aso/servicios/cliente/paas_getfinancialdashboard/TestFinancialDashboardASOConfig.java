package pe.bbva.aso.servicios.cliente.paas_getfinancialdashboard;

import java.util.List;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.getfinancialdashboard.config.GetFinancialDashboardASOConfig;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.FinancialDashboardDTO;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.RequestGetFinancialDashboard;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestFinancialDashboardASOConfig {
	
	//@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		GetFinancialDashboardASOConfig obj = new GetFinancialDashboardASOConfig();
		RequestGetFinancialDashboard filtro = new RequestGetFinancialDashboard();
		
		ResponseGetFinancialDashboard response = null;
		List<FinancialDashboardDTO> data = null;

		try {
			response = obj.getFinancialDashboard(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.get(0).toString());
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
