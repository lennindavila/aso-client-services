package pe.bbva.aso.servicios.getbankpositiondashboard.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestGetBankPositionDashboard implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("documentId")
	private String documentId;

	@JsonProperty("documentType")
	private String documentType;	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
}
