package pe.bbva.aso.servicios.listaclientes.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String id;
	
	@JsonProperty("identityDocuments")
	private List<IdentityDocumentsDTO> identityDocuments;

	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("membershipDate")
	private String membershipDate;

	@JsonProperty("bank")
	private BankDTO bank;

	@JsonProperty("residence")
	private ResidenceDTO residence;

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

	@JsonProperty("birthData")
	private BirthDataDTO birthData;

	@JsonProperty("nationalities")
	private List<NationalitiesDTO> nationalities;

	@JsonProperty("economicData")
	private EconomicDataDTO economicData;

	@JsonProperty("classifications")
	private List<ClassificationsDTO> classifications;

	@JsonProperty("contactDetails")
	private List<ContactDetailsDTO> contactDetails;

	@JsonProperty("addresses")
	private List<AddressesDTO> addresses;

	@JsonProperty("terms")
	private List<TermsDTO> terms;

	@JsonProperty("indicators")
	private List<IndicatorsDTO> indicators;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public List<IdentityDocumentsDTO> getIdentityDocuments() {
		return identityDocuments;
	}

	public void setIdentityDocuments(List<IdentityDocumentsDTO> identityDocuments) {
		this.identityDocuments = identityDocuments;
	}
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}
	public BankDTO getBank() {
		return bank;
	}

	public void setBank(BankDTO bank) {
		this.bank = bank;
	}
	public ResidenceDTO getResidence() {
		return residence;
	}

	public void setResidence(ResidenceDTO residence) {
		this.residence = residence;
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
	public BirthDataDTO getBirthData() {
		return birthData;
	}

	public void setBirthData(BirthDataDTO birthData) {
		this.birthData = birthData;
	}
	public List<NationalitiesDTO> getNationalities() {
		return nationalities;
	}

	public void setNationalities(List<NationalitiesDTO> nationalities) {
		this.nationalities = nationalities;
	}
	public EconomicDataDTO getEconomicData() {
		return economicData;
	}

	public void setEconomicData(EconomicDataDTO economicData) {
		this.economicData = economicData;
	}
	public List<ClassificationsDTO> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<ClassificationsDTO> classifications) {
		this.classifications = classifications;
	}
	public List<ContactDetailsDTO> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
		this.contactDetails = contactDetails;
	}
	public List<AddressesDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressesDTO> addresses) {
		this.addresses = addresses;
	}
	public List<TermsDTO> getTerms() {
		return terms;
	}

	public void setTerms(List<TermsDTO> terms) {
		this.terms = terms;
	}
	public List<IndicatorsDTO> getIndicators() {
		return indicators;
	}

	public void setIndicators(List<IndicatorsDTO> indicators) {
		this.indicators = indicators;
	}	
}

