package pe.bbva.aso.servicios.cliente.paas_modifycardblock;

import java.util.List;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;
import pe.bbva.aso.servicios.modifycardblock.config.ModifyCardBlockASOConfig;
import pe.bbva.aso.servicios.modifycardblock.dto.ModifyCardBlockDTO;
import pe.bbva.aso.servicios.modifycardblock.dto.RequestModifyCardBlock;
import pe.bbva.aso.servicios.modifycardblock.dto.ResponseModifyCardBlock;

public class TestModifyCardBlockASOConfig {
	
	@Test
	public void consultar() {	 
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		ModifyCardBlockASOConfig obj = new ModifyCardBlockASOConfig();
		 RequestModifyCardBlock filtro = new RequestModifyCardBlock();
		 //url
		 filtro.setCardId("c9Ibn-VCIbGjx2tOHjXwvY6RKpZ7JNGpvWYKPQuC4Q8=");
		 filtro.setBlockId("INTERNAL");
		 //Body Request
		 filtro.setIsActive("true");
		 filtro.setIsReissued("true");
		 filtro.setAdditionalInformation("Card blocked internally");
		
		 ResponseModifyCardBlock response = null;
		 List<ModifyCardBlockDTO> data = null;

		try {
			response = obj.modifyCardBlock(filtro, tsec);
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
