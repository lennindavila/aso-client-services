package pe.bbva.aso.servicios.listcontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("contactDetailId")
	private String contactDetailId;

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

	@JsonProperty("adsAllowed")
	private String adsAllowed;

	@JsonProperty("lastUpdateDate")
	private String lastUpdateDate;

	@JsonProperty("isChecked")
	private String isChecked;

	public String getContactDetailId() {
		return contactDetailId;
	}

	public void setContactDetailId(String contactDetailId) {
		this.contactDetailId = contactDetailId;
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
	public String getAdsAllowed() {
		return adsAllowed;
	}

	public void setAdsAllowed(String adsAllowed) {
		this.adsAllowed = adsAllowed;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}
}

