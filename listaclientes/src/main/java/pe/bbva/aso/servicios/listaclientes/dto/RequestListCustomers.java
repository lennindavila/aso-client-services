package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestListCustomers implements Serializable {
    private static final long serialVersionUID = 1L;
	
	@JsonProperty("documentTypeId")
	private String documentTypeId;

	@JsonProperty("documentNumber")
	private String documentNumber;

	@JsonProperty("customer")
	private CustomerDTO customer;

	@JsonProperty("expand")
	private String expand;	
	
	public String getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(String documentTypeId) {
		this.documentTypeId = documentTypeId;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}	

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}	
}
