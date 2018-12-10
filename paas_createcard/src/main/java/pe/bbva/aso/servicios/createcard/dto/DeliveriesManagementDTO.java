package pe.bbva.aso.servicios.createcard.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveriesManagementDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("serviceType")
	private ServiceTypeDTO serviceType;

	@JsonProperty("contactDetail")
	private ContactDetailDTO contactDetail;

	@JsonProperty("address")
	private AddressDTO address;

	public ServiceTypeDTO getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceTypeDTO serviceType) {
		this.serviceType = serviceType;
	}
	public ContactDetailDTO getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetailDTO contactDetail) {
		this.contactDetail = contactDetail;
	}
	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}

