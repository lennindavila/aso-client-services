package pe.bbva.aso.servicios.createsecurecontact.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createsecurecontact.dto.ContactsInformationDTO;
import pe.bbva.aso.servicios.createsecurecontact.dto.IdentityDocumentDTO;
import pe.bbva.aso.servicios.createsecurecontact.dto.RequestCreateSecureContact;
import pe.bbva.aso.servicios.createsecurecontact.dto.SecureContactDTO;

@Component
@Scope("prototype")
public class CreateSecureContactValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateSecureContact request = (RequestCreateSecureContact) target;
		
		if (request.getSecureContact() != null) {	
			SecureContactDTO secureContact = request.getSecureContact();			
			if(secureContact.getIdentityDocument() != null && secureContact.getIdentityDocument().isEmpty() == false) {
				for (int i = 0;i < secureContact.getIdentityDocument().size();i++) {
					IdentityDocumentDTO obj = secureContact.getIdentityDocument().get(i);
					if(obj.getType() == null || StringUtils.isBlank(obj.getType().getId())) {
						logger.error("secureContact.identityDocument.type.id es requerido");
						errors.rejectValue("secureContact.identityDocument[" + i + "].type.id", "Es requerido");
						return;
					}else if(StringUtils.isBlank(obj.getNumber())) {
						logger.error("participant Id es requerido");
						errors.rejectValue("secureContact.identityDocument[" + i + "].number", "Es requerido");
						return;
					}					
				}				
			}else {
				logger.error("participant Id es requerido");
				errors.rejectValue("secureContact.identityDocument", "Es requerido");
				return;
			}
			
			if(secureContact.getContactsInformation() != null && secureContact.getContactsInformation().isEmpty() == false) {
				for (int i = 0;i < secureContact.getContactsInformation().size();i++) {
					ContactsInformationDTO obj = secureContact.getContactsInformation().get(i);
					if(StringUtils.isBlank(obj.getAdditionalInformation())) {
						logger.error("secureContact.contactsInformation.additionalInformation es requerido");
						errors.rejectValue("secureContact.contactsInformation[" + i + "].additionalInformation", "Es requerido");
						return;
					}else if(StringUtils.isBlank(obj.getName())) {
						logger.error("secureContact.contactsInformation.name es requerido");
						errors.rejectValue("secureContact.contactsInformation[" + i + "].name", "Es requerido");
						return;
					}					
				}				
			}else {
				logger.error("participant Id es requerido");
				errors.rejectValue("secureContact.contactsInformation", "Es requerido");
				return;
			}
		}else {
			logger.error("secureContact es requerido");
			errors.rejectValue("secureContact", "Es requerido");
		}
		logger.debug("validate: fin");		
	}
}
