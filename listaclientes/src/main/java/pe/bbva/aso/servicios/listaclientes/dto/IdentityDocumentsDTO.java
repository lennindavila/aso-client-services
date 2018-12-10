package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdentityDocumentsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("documentType")
	private DocumentTypeDTO documentType;

	@JsonProperty("documentNumber")
	private String documentNumber;

	@JsonProperty("expirationDate")
	private String expirationDate;

	public DocumentTypeDTO getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentTypeDTO documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}

