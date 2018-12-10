package pe.bbva.aso.servicios.cliente.paas_createaccountrelatedcontract;

//import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createaccountrelatedcontract.config.CreateAccountRelatedContractASOConfig;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.AccountRelatedContractDTO;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ProductDTO;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.ResponseCreateAccountRelatedContract;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateAccountRelatedContractASOConfig {

	//@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	  	

		CreateAccountRelatedContractASOConfig obj = new CreateAccountRelatedContractASOConfig();
		RequestCreateAccountRelatedContract filtro = new RequestCreateAccountRelatedContract();
		ProductDTO product = new ProductDTO();
		product.setId("CARDS");
		filtro.setContractId("4551709022482674");
		filtro.setProduct(product);

		ResponseCreateAccountRelatedContract response = null;
		AccountRelatedContractDTO data = null;
		try {
			response = obj.createAccountRelatedContract(filtro, tsec);
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
