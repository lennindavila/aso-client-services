package pe.bbva.aso.servicios.createsecurecontact.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecureContactDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("identityDocument")
	private List<IdentityDocumentDTO> identityDocument;

	@JsonProperty("contactsInformation")
	private List<ContactsInformationDTO> contactsInformation;

	@JsonProperty("id")
	private String id;

	public List<IdentityDocumentDTO> getIdentityDocument() {
		return identityDocument;
	}

	public void setIdentityDocument(List<IdentityDocumentDTO> identityDocument) {
		this.identityDocument = identityDocument;
	}
	public List<ContactsInformationDTO> getContactsInformation() {
		return contactsInformation;
	}

	public void setContactsInformation(List<ContactsInformationDTO> contactsInformation) {
		this.contactsInformation = contactsInformation;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

