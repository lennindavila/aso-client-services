package pe.bbva.aso.servicios.cliente.paas_createcustomer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.aso.servicios.createcustomer.config.CreateCustomerASOConfig;
import pe.bbva.aso.servicios.createcustomer.dto.AddressesDTO;
import pe.bbva.aso.servicios.createcustomer.dto.BirthDataDTO;
import pe.bbva.aso.servicios.createcustomer.dto.CountryDTO;
import pe.bbva.aso.servicios.createcustomer.dto.CustomerDTO;
import pe.bbva.aso.servicios.createcustomer.dto.DocumentTypeDTO;
import pe.bbva.aso.servicios.createcustomer.dto.EconomicDataDTO;
import pe.bbva.aso.servicios.createcustomer.dto.GenderDTO;
import pe.bbva.aso.servicios.createcustomer.dto.GeographicGroupTypeDTO;
import pe.bbva.aso.servicios.createcustomer.dto.GeographicGroupsDTO;
import pe.bbva.aso.servicios.createcustomer.dto.IdentityDocumentsDTO;
import pe.bbva.aso.servicios.createcustomer.dto.LocationDTO;
import pe.bbva.aso.servicios.createcustomer.dto.MaritalStatusDTO;
import pe.bbva.aso.servicios.createcustomer.dto.NationalitiesDTO;
import pe.bbva.aso.servicios.createcustomer.dto.OccupationTypeDTO;
import pe.bbva.aso.servicios.createcustomer.dto.OwnershipTypeDTO;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.ResidenceDTO;
import pe.bbva.aso.servicios.createcustomer.dto.ResponseCreateCustomer;
import pe.bbva.aso.servicios.createcustomer.dto.WorkplaceDTO;
import pe.bbva.aso.servicios.grantingticket.config.GrantingTicketASOConfig;

public class TestCreateCustomerASOConfig {

	@Test
	public void consultar() {
		String tsec = "xxx";
		try {
			//tsec = new GrantingTicketASOConfig().obtenerTsec();
		}catch(Exception e) {
			tsec = "xxx";
		}		
		System.out.println("tsec "+ tsec);	 	

		CreateCustomerASOConfig obj = new CreateCustomerASOConfig();
		RequestCreateCustomer filtro = new RequestCreateCustomer();
		List<IdentityDocumentsDTO> listIdentityDocuments = new ArrayList<IdentityDocumentsDTO>();
		IdentityDocumentsDTO identityDocument = new IdentityDocumentsDTO();
		DocumentTypeDTO documentType = new DocumentTypeDTO();
		documentType.setId("DNI");
		identityDocument.setDocumentNumber("72939985");
		identityDocument.setExpirationDate("2022-12-01");
		identityDocument.setDocumentType(documentType);
		listIdentityDocuments.add(identityDocument);
		filtro.setIdentityDocuments(listIdentityDocuments);
		filtro.setFirstName("CHRISTINA");
		filtro.setLastName("JAQUE");
		filtro.setSurnames("TORRES");

		MaritalStatusDTO maritalStatus = new MaritalStatusDTO();
		maritalStatus.setId("SINGLE");
		filtro.setMaritalStatus(maritalStatus);

		GenderDTO gender = new GenderDTO();
		gender.setId("FEMALE");
		filtro.setGender(gender);

		EconomicDataDTO economicData = new EconomicDataDTO();
		OccupationTypeDTO occupationType = new OccupationTypeDTO();
		WorkplaceDTO workplace = new WorkplaceDTO();
		occupationType.setId("PRF");
		workplace.setName("PRF");
		economicData.setOccupationType(occupationType);
		economicData.setWorkplace(workplace);
		filtro.setEconomicData(economicData);

		BirthDataDTO birthData = new BirthDataDTO();
		CountryDTO country = new CountryDTO();
		birthData.setBirthDate("1988-10-25");
		country.setId("PER");
		birthData.setCountry(country);
		filtro.setBirthData(birthData);

		ResidenceDTO residence = new ResidenceDTO();
		CountryDTO country_residence = new CountryDTO();
		//country_residence.setId("PER");
		residence.setCountry(country_residence);
		filtro.setResidence(residence);

		List<NationalitiesDTO> listNationalities = new ArrayList<NationalitiesDTO>();
		NationalitiesDTO nationality = new NationalitiesDTO();
		nationality.setId("PER");
		listNationalities.add(nationality);
		filtro.setNationalities(listNationalities);

		List<AddressesDTO> listAddresses  = new ArrayList<AddressesDTO>();
		AddressesDTO address =  new AddressesDTO();
		OwnershipTypeDTO ownershipType = new OwnershipTypeDTO();
		LocationDTO location = new LocationDTO();
		CountryDTO country_location= new CountryDTO();

		ownershipType.setId("FAMILY");
		country_location.setId("PER");
		location.setCountry(country_location);
		address.setOwnershipType(ownershipType);

		List<GeographicGroupsDTO> listGeographicGroups = new ArrayList<GeographicGroupsDTO>();
		String[] strGeographicGroupType = {"AVENUE","URBANIZATION","EXTERIOR_NUMBER","INTERIOR_NUMBER","DEPARTMENT","PROVINCE","DISTRICT"};
		String[] strGeographicGroupsNname = {"CASTRAT","CHAMA","376","202","03","01","007"};
		for (int i=0;i<7;i++) {
			GeographicGroupsDTO geographicGroup = new GeographicGroupsDTO();
			GeographicGroupTypeDTO geographicGroupType = new GeographicGroupTypeDTO();
			geographicGroup.setName(strGeographicGroupsNname[i]);
			geographicGroup.setCode("code GG");
			geographicGroupType.setId(strGeographicGroupType[i]);
			geographicGroupType.setName("tipe GT");
			geographicGroup.setGeographicGroupType(geographicGroupType);
			listGeographicGroups.add(geographicGroup);
		}
		location.setGeographicGroups(listGeographicGroups);
		address.setLocation(location);
		listAddresses.add(address);
		filtro.setAddresses(listAddresses);

		ResponseCreateCustomer response = null;
		CustomerDTO data = null;

		try {
			response = obj.createCustomer(filtro, tsec);
			if(response!=null){
				if(!response.hasError()) {
					data = response.getData();
					System.out.println("data "+ data.getCustomerId());
				}else {
					System.out.println(" ErrorCode: " + response.getErrorCode());
					System.out.println(" ErrorMessage: " + response.getErrorMessage());
				}
			}
		} catch (ValidacionExceptionBBVA e) {
			if(e instanceof ValidacionExceptionBBVA) {
				ValidacionExceptionBBVA ev = (ValidacionExceptionBBVA) e;
				System.out.println("Handling1 validation exception getCode : " + ev.getErrores().getFieldError().getCode());
				System.out.println("Handling1 validation exception getField: " + ev.getErrores().getFieldError().getField());
				System.out.println("Handling1 validation exception : " + ev.getErrores().getFieldError().getField() + " " + ev.getErrores().getFieldError().getCode());
			}else {
				System.out.println("Handling1 any exception: " + e.getMessage());
			}
			e.printStackTrace();
		}catch (ServiceExceptionBBVA e) {
			if(e instanceof ValidacionExceptionBBVA) {
				ValidacionExceptionBBVA ev = (ValidacionExceptionBBVA) e;
				System.out.println("Handling validation exception getCode : " + ev.getErrores().getFieldError().getCode());
				System.out.println("Handling validation exception getField: " + ev.getErrores().getFieldError().getField());
				System.out.println("Handling validation exception : " + ev.getErrores().getFieldError().getField() + " " + ev.getErrores().getFieldError().getCode());
			}else {
				System.out.println("Handling any exception: " + e.getMessage());
			}
			e.printStackTrace();
		}
	}
}
