package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("contact")
	private String contact;

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}

