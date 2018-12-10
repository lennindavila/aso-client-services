package pe.bbva.aso.servicios.createcontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestCreateContactDetail implements Serializable {
    private static final long serialVersionUID = 1L;	

	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("contact")
	private String contact;

	@JsonProperty("contactType")
	private ContactTypeDTO contactType;

	@JsonProperty("regionalCode")
	private String regionalCode;

	@JsonProperty("extension")
	private String extension;

	@JsonProperty("phoneCompany")
	private PhoneCompanyDTO phoneCompany;

	@JsonProperty("isPreferential")
	private String isPreferential;
	
	@JsonProperty("isChecked")
	private String isChecked = null;
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public ContactTypeDTO getContactType() {
		return contactType;
	}

	public void setContactType(ContactTypeDTO contactType) {
		this.contactType = contactType;
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
	public PhoneCompanyDTO getPhoneCompany() {
		return phoneCompany;
	}

	public void setPhoneCompany(PhoneCompanyDTO phoneCompany) {
		this.phoneCompany = phoneCompany;
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
