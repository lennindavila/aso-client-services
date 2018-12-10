package pe.bbva.aso.servicios.createcustomer.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestCreateCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    
	@JsonProperty("identityDocuments")
	private List<IdentityDocumentsDTO> identityDocuments;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("surnames")
	private String surnames;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("personalTitle")
	private PersonalTitleDTO personalTitle;

	@JsonProperty("maritalStatus")
	private MaritalStatusDTO maritalStatus;

	@JsonProperty("gender")
	private GenderDTO gender;

	@JsonProperty("contactDetails")
	private List<ContactDetailsDTO> contactDetails;

	@JsonProperty("economicData")
	private EconomicDataDTO economicData;

	@JsonProperty("terms")
	private List<TermsDTO> terms;

	@JsonProperty("birthData")
	private BirthDataDTO birthData;

	@JsonProperty("residence")
	private ResidenceDTO residence;

	@JsonProperty("addresses")
	private List<AddressesDTO> addresses;

	@JsonProperty("nationalities")
	private List<NationalitiesDTO> nationalities;

	public List<IdentityDocumentsDTO> getIdentityDocuments() {
		return identityDocuments;
	}

	public void setIdentityDocuments(List<IdentityDocumentsDTO> identityDocuments) {
		this.identityDocuments = identityDocuments;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public PersonalTitleDTO getPersonalTitle() {
		return personalTitle;
	}

	public void setPersonalTitle(PersonalTitleDTO personalTitle) {
		this.personalTitle = personalTitle;
	}
	public MaritalStatusDTO getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatusDTO maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public GenderDTO getGender() {
		return gender;
	}

	public void setGender(GenderDTO gender) {
		this.gender = gender;
	}
	public List<ContactDetailsDTO> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
		this.contactDetails = contactDetails;
	}
	public EconomicDataDTO getEconomicData() {
		return economicData;
	}

	public void setEconomicData(EconomicDataDTO economicData) {
		this.economicData = economicData;
	}
	public List<TermsDTO> getTerms() {
		return terms;
	}

	public void setTerms(List<TermsDTO> terms) {
		this.terms = terms;
	}
	public BirthDataDTO getBirthData() {
		return birthData;
	}

	public void setBirthData(BirthDataDTO birthData) {
		this.birthData = birthData;
	}
	public ResidenceDTO getResidence() {
		return residence;
	}

	public void setResidence(ResidenceDTO residence) {
		this.residence = residence;
	}
	public List<AddressesDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressesDTO> addresses) {
		this.addresses = addresses;
	}
	public List<NationalitiesDTO> getNationalities() {
		return nationalities;
	}

	public void setNationalities(List<NationalitiesDTO> nationalities) {
		this.nationalities = nationalities;
	}
}
