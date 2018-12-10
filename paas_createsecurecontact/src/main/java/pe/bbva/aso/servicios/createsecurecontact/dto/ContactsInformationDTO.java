package pe.bbva.aso.servicios.createsecurecontact.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactsInformationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("additionalInformation")
	private String additionalInformation;

	@JsonProperty("name")
	private String name;

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

