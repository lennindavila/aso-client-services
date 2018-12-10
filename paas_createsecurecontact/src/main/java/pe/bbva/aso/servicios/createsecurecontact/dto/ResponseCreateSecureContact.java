package pe.bbva.aso.servicios.createsecurecontact.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import pe.bbva.aso.servicios.cliente.base.dto.BaseDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCreateSecureContact extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("secureContact")
	private SecureContactDTO secureContact;

	public SecureContactDTO getSecureContact() {
		return secureContact;
	}

	public void setSecureContact(SecureContactDTO secureContact) {
		this.secureContact = secureContact;
	} 	
}
