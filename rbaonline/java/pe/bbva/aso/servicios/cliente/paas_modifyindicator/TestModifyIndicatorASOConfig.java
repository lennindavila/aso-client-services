package pe.bbva.aso.servicios.cliente.paas_modifyindicator;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifyindicator.config.ModifyIndicatorASOConfig;
import pe.bbva.aso.servicios.modifyindicator.dto.IndicatorDTO;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

public class TestModifyIndicatorASOConfig {

	//@Test
	public void consultar() {	
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ModifyIndicatorASOConfig obj = new ModifyIndicatorASOConfig();
		RequestModifyIndicator filtro = new RequestModifyIndicator();
		filtro.setCustomerId("90014937");
		filtro.setIndicatorId("PEP");
		IndicatorDTO indicatorDTO = new IndicatorDTO();
		indicatorDTO.setIsActive("false");
		filtro.setData(indicatorDTO);;

		ResponseModifyIndicator response = null;
		String data = null;

		try {
			response = obj.consultar(filtro, tsec);
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
