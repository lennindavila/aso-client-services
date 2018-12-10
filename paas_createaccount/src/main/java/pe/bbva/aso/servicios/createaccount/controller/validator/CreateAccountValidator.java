package pe.bbva.aso.servicios.createaccount.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createaccount.dto.ParticipantsDTO;
import pe.bbva.aso.servicios.createaccount.dto.RequestCreateAccount;

@Component
@Scope("prototype")
public class CreateAccountValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateAccount request = (RequestCreateAccount) target;
		if (request.getAccountType() == null || StringUtils.isBlank(request.getAccountType().getId())) {
			logger.error("AccountType id es requerido");
			errors.rejectValue("accountType.id", "Es requerido");
			return;
		}else if (request.getTitle() == null || StringUtils.isBlank(request.getTitle().getId())) {
			logger.error("Title id es requerido");
			errors.rejectValue("title.id", "Es requerido");
			return;
		}else if (request.getJoint() == null || StringUtils.isBlank(request.getJoint().getId())) {
			logger.error("Joint id es requerido");
			errors.rejectValue("joint.id", "Es requerido");
			return;
		}		
		
		if(request.getParticipants() != null && request.getParticipants().isEmpty() == false) {
			for (int i = 0;i < request.getParticipants().size();i++) {
				ParticipantsDTO obj = request.getParticipants().get(i);
				if(StringUtils.isBlank(obj.getParticipantId())) {
					logger.error("participant Id es requerido");
					errors.rejectValue("participants[" + i + "].participantId", "Es requerido");
					return;
				}else if(obj.getParticipantType()==null || StringUtils.isBlank(obj.getParticipantType().getId())) {
					logger.error("participant Id es requerido");
					errors.rejectValue("participants[" + i + "].participantType", "Es requerido");
					return;
				}					
			}			
		}else {
			logger.error("participants es requerido");
			errors.rejectValue("participants", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}
