package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressesDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("location")
	private LocationDTO location;

	@JsonProperty("addressType")
	private AddressTypeDTO addressType;

	@JsonProperty("ownershipType")
	private OwnershipTypeDTO ownershipType;

	@JsonProperty("residenceStartDate")
	private String residenceStartDate;

	public LocationDTO getLocation() {
		return location;
	}

	public void setLocation(LocationDTO location) {
		this.location = location;
	}
	public AddressTypeDTO getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressTypeDTO addressType) {
		this.addressType = addressType;
	}
	public OwnershipTypeDTO getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(OwnershipTypeDTO ownershipType) {
		this.ownershipType = ownershipType;
	}
	public String getResidenceStartDate() {
		return residenceStartDate;
	}

	public void setResidenceStartDate(String residenceStartDate) {
		this.residenceStartDate = residenceStartDate;
	}
}

