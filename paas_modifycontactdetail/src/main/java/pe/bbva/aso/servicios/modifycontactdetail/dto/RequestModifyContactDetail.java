package pe.bbva.aso.servicios.modifycontactdetail.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestModifyContactDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("customer-id")
	private String customerId;

	@JsonProperty("contact-detail-id")
	private String contactDetailId;
	
	@JsonProperty("data")
	private ContactDetailDTO data;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getContactDetailId() {
		return contactDetailId;
	}

	public void setContactDetailId(String contactDetailId) {
		this.contactDetailId = contactDetailId;
	}
	
	public ContactDetailDTO getData() {
		return data;
	}

	public void setData(ContactDetailDTO data) {
		this.data = data;
	}
}
