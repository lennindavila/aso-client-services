package pe.bbva.aso.servicios.cliente.paas_createcardrelatedcontract;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcardrelatedcontract.config.CreateCardRelatedContractASOConfig;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.CardRelatedContractDTO;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.ResponseCreateCardRelatedContract;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateCardRelatedContractASOConfig {

	@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateCardRelatedContractASOConfig obj = new CreateCardRelatedContractASOConfig();
		RequestCreateCardRelatedContract filtro = new RequestCreateCardRelatedContract();
		filtro.setContractId("ly1pbd5lfiix7hvqnu");
		filtro.setCardId("1divk2hgnkdgud86");

		ResponseCreateCardRelatedContract response = null;
		CardRelatedContractDTO data = null;

		try {
			response = obj.createCardRelatedContract(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getContractId());
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
