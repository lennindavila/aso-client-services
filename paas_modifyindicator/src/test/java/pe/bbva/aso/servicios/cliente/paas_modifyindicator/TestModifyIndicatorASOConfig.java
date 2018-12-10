package pe.bbva.aso.servicios.cliente.paas_modifyindicator;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifyindicator.config.ModifyIndicatorASOConfig;
import pe.bbva.aso.servicios.modifyindicator.dto.IndicatorDTO;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;
import pe.bbva.aso.servicios.modifyindicator.dto.ResponseModifyIndicator;

public class TestModifyIndicatorASOConfig {

	@Test
		public void consultar() {	
			String tsec = "xxx";
			try {
				tsec = new GrantingTicketASOConfig().obtenerTsec();
			}catch(Exception e) {
				tsec = "xxx";
			}		
			System.out.println("tsec "+ tsec);	 	
			
			ModifyIndicatorASOConfig config = new ModifyIndicatorASOConfig();
			RequestModifyIndicator filtro = new RequestModifyIndicator();
			filtro.setCustomerId("97169848");
			filtro.setIndicatorId("FAT");
			IndicatorDTO data = new IndicatorDTO();
			data.setIsActive("true");
			filtro.setData(data);
			
			ResponseModifyIndicator response = null;
			
			
			try {
				response =  config.modifyIndicator(filtro, tsec);
				if(response!=null) {
					if(!response.hasError()) {
						System.out.println("Sin errores ");
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
