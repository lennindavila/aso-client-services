package pe.bbva.aso.servicios.createcontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("contactDetailId")
	private String contactDetailId;

	public String getContactDetailId() {
		return contactDetailId;
	}

	public void setContactDetailId(String contactDetailId) {
		this.contactDetailId = contactDetailId;
	}
}

