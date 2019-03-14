package pe.bbva.aso.servicios.cliente.paas_grantingticket;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.getbankpositiondashboard.config.GetBankPositionDashboardASOConfig;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.BankPositionDashboardDTO;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestGetBankPositionDashboardASOConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(TestGetBankPositionDashboardASOConfig.class);

   @Test
	public void consultar() {
		String tsec = "xxx";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		GetBankPositionDashboardASOConfig obj = new GetBankPositionDashboardASOConfig();
		RequestGetBankPositionDashboard filtro = new RequestGetBankPositionDashboard();
		
		filtro.setCustomerId("97163072"); //90025131  97163086
		//filtro.setDocumentId("42633441");
		//filtro.setDocumentType("DNI");
		
		ResponseGetBankPositionDashboard response = null;

		try {
			response = obj.getBankPositionDashboard(filtro, tsec);
			Gson json = new Gson();
			logger.info("JsonPruebaConfig: " + json.toJson(response));
			if(response!=null) {
				if(!response.hasError()) {
					System.out.println("data "+ response.getAssetProductsNumber());
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
