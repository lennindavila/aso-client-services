package pe.bbva.aso.servicios.createcustomer.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcustomer.dto.AddressesDTO;
import pe.bbva.aso.servicios.createcustomer.dto.GeographicGroupsDTO;
import pe.bbva.aso.servicios.createcustomer.dto.IdentityDocumentsDTO;
import pe.bbva.aso.servicios.createcustomer.dto.LocationDTO;
import pe.bbva.aso.servicios.createcustomer.dto.NationalitiesDTO;
import pe.bbva.aso.servicios.createcustomer.dto.RequestCreateCustomer;

@Component
@Scope("prototype")
public class CreateCustomerValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateCustomer request = (RequestCreateCustomer) target;
		if (StringUtils.isBlank(request.getLastName())) {
			logger.error("lastName es requerido");
			errors.rejectValue("lastName", "Es requerido");
			return;
		}else if (StringUtils.isBlank(request.getSurnames())) {
			logger.error("surnames es requerido");
			errors.rejectValue("surnames", "Es requerido");
			return;
		}else if (StringUtils.isBlank(request.getFirstName())) {
			logger.error("firstName es requerido");
			errors.rejectValue("firstName", "Es requerido");
			return;
		}else if (request.getMaritalStatus() == null || StringUtils.isBlank(request.getMaritalStatus().getId())) {
			logger.error("maritalStatus id es requerido");
			errors.rejectValue("maritalStatus.id", "Es requerido");
			return;
		}else if (request.getGender() == null || StringUtils.isBlank(request.getGender().getId())) {
			logger.error("gender id es requerido");
			errors.rejectValue("gender.id", "Es requerido");
			return;
		}else if (request.getEconomicData() == null || request.getEconomicData().getOccupationType()== null || StringUtils.isBlank(request.getEconomicData().getOccupationType().getId())) {
			logger.error("economicData occupationType id es requerido");
			errors.rejectValue("economicData.occupationType.id", "Es requerido");
			return;
		}else if (request.getEconomicData() == null || request.getEconomicData().getWorkplace() == null || StringUtils.isBlank(request.getEconomicData().getWorkplace().getName())) {
			logger.error("economicData workplace name id es requerido");
			errors.rejectValue("economicData.workplace.name", "Es requerido");
			return;
		}else if (request.getBirthData() == null || StringUtils.isBlank(request.getBirthData().getBirthDate())) {
			logger.error("birthData birthDate id es requerido");
			errors.rejectValue("birthData.birthDate", "Es requerido");
			return;
		}else if (request.getBirthData() == null || request.getBirthData().getCountry() == null || StringUtils.isBlank(request.getBirthData().getCountry().getId())) {
			logger.error("birthData country id id es requerido");
			errors.rejectValue("birthData.country.id", "Es requerido");	
			return;
		}
		
		if(request.getNationalities()!= null && request.getNationalities().isEmpty() == false) {
			for (int i = 0;i < request.getNationalities().size();i++) {
				NationalitiesDTO nationalities = request.getNationalities().get(i);				
				if(StringUtils.isBlank(nationalities.getId())) {
					logger.error("nationalities.id es requerido");
					errors.rejectValue("nationalities[" + i + "].id", "Es requerido");
					return;
				}				
			}
		}else {
			logger.error("nationalities es requerido");
			errors.rejectValue("nationalities", "Es requerido");
			return;
		}
		
		if(request.getIdentityDocuments()!= null && request.getIdentityDocuments().isEmpty() == false) {
			for (int i = 0;i < request.getIdentityDocuments().size();i++ ) {
				IdentityDocumentsDTO identityDocuments = request.getIdentityDocuments().get(i);				
				if(StringUtils.isBlank(identityDocuments.getDocumentNumber())) {
					logger.error("identityDocuments.documentNumber es requerido");
					errors.rejectValue("identityDocuments[" + i + "].documentNumber", "Es requerido");
					return;
				}				
				if(identityDocuments.getDocumentType() == null || StringUtils.isBlank(identityDocuments.getDocumentType().getId())) {
					logger.error("identityDocuments.documentType.id es requerido");
					errors.rejectValue("identityDocuments[" + i + "].documentType.id", "Es requerido");
					return;
				}
			}
		}else {
			logger.error("identityDocuments es requerido");
			errors.rejectValue("identityDocuments", "Es requerido");
			return;
		}		
		
		if(request.getAddresses() != null && request.getAddresses().isEmpty() == false) {
			for (int i = 0;i < request.getAddresses().size();i++) {
				AddressesDTO addresses = request.getAddresses().get(i);					
				if(addresses.getOwnershipType()== null || StringUtils.isBlank(addresses.getOwnershipType().getId())) {
					logger.error("addresses.ownershipType.id es requerido");
					errors.rejectValue("addresses[" + i + "].ownershipType.id", "Es requerido");
					return;
				}
				if(addresses.getLocation() != null) {
					LocationDTO location = addresses.getLocation();
					if(location.getCountry() == null || StringUtils.isBlank(location.getCountry().getId()) ) {
						logger.error("addresses[n].location.country.id es requerido");
						errors.rejectValue("addresses[" + i + "].location.country.id", "Es requerido");
						return;
					}
					if(location.getGeographicGroups()!= null && location.getGeographicGroups().isEmpty()== false) {
						for (int x = 0;x <  location.getGeographicGroups().size();x++) {
							GeographicGroupsDTO geographicGroups = location.getGeographicGroups().get(x);							
							if(geographicGroups.getGeographicGroupType()== null || StringUtils.isBlank(geographicGroups.getGeographicGroupType().getId())) {
								logger.error("addresses.location.geographicGroups.geographicGroupType.id es requerido");
								errors.rejectValue("addresses[" + i + "].location.geographicGroups[" + x + "].geographicGroupType.id", "Es requerido");
								return;
							}
							/*							
							if(geographicGroups.getGeographicGroupType()== null || StringUtils.isBlank(geographicGroups.getGeographicGroupType().getName())) {
								logger.error("addresses.location.geographicGroups.geographicGroupType.name es requerido");
								errors.rejectValue("addresses[" + i + "].location.geographicGroups[" + x + "].geographicGroupType.name", "Es requerido");
								return;
							}
							*/
							/*							
							if(StringUtils.isBlank(geographicGroups.getCode())) {
								logger.error("addresses.location.geographicGroups.code es requerido");
								errors.rejectValue("addresses[" + i + "].location.geographicGroups[" + x + "].code", "Es requerido");
								return;
							}
							*/
						}						
					}else {
						logger.error("addresses.location.geographicGroups es requerido");
						errors.rejectValue("addresses[" + i + "].location.geographicGroups", "Es requerido");
						return;
					}
				}else {
					logger.error("addresses[n].location es requerido");
					errors.rejectValue("addresses[" + i + "].location", "Es requerido");
					return;					
				}
			}
		}else {
			logger.error("addresses es requerido");
			errors.rejectValue("addresses", "Es requerido");
			return;
		}	
		logger.debug("validate: fin");
	}
}
