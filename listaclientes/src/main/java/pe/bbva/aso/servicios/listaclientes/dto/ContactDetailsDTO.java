package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("contactDetailId")
	private String contactDetailId;

	@JsonProperty("contactType")
	private ContactTypeDTO contactType;

	@JsonProperty("contact")
	private String contact;

	@JsonProperty("country")
	private CountryDTO country;

	@JsonProperty("regionalCode")
	private String regionalCode;

	@JsonProperty("extension")
	private String extension;

	@JsonProperty("isPreferential")
	private String isPreferential;

	@JsonProperty("isChecked")
	private String isChecked;

	public String getContactDetailId() {
		return contactDetailId;
	}

	public void setContactDetailId(String contactDetailId) {
		this.contactDetailId = contactDetailId;
	}
	public ContactTypeDTO getContactType() {
		return contactType;
	}

	public void setContactType(ContactTypeDTO contactType) {
		this.contactType = contactType;
	}
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	public String getRegionalCode() {
		return regionalCode;
	}

	public void setRegionalCode(String regionalCode) {
		this.regionalCode = regionalCode;
	}
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getIsPreferential() {
		return isPreferential;
	}

	public void setIsPreferential(String isPreferential) {
		this.isPreferential = isPreferential;
	}
	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}
}

