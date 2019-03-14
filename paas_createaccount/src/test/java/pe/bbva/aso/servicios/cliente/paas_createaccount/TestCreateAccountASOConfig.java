package pe.bbva.aso.servicios.cliente.paas_createaccount;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createaccount.config.CreateAccountASOConfig;
import pe.bbva.aso.servicios.createaccount.dto.AccountDTO;
import pe.bbva.aso.servicios.createaccount.dto.BankDTO;
import pe.bbva.aso.servicios.createaccount.dto.BranchDTO;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;
import pe.bbva.aso.servicios.createaccount.dto.ResponseCreateAccount;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateAccountASOConfig {

	@Test
	public void consultar() {
		String tsec = "";
		try {
			tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	 	

		CreateAccountASOConfig obj = new CreateAccountASOConfig();
		RequestCreateAccount filtro = new RequestCreateAccount();
		BankDTO bank = new BankDTO();
		BranchDTO branch = new BranchDTO();
		branch.setBranchId("0486");
		bank.setBranch(branch);
		filtro.setBank(bank);

		ResponseCreateAccount response = null;
		AccountDTO data = null;
		try {
			response = obj.createAccount(filtro, tsec);
			if(response!=null) {
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getNumber());
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
