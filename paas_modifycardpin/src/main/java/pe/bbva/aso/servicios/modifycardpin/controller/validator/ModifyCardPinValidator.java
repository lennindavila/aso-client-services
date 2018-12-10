package pe.bbva.aso.servicios.modifycardpin.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.modifycardpin.dto.RequestModifyCardPin;

@Component
@Scope("prototype")
public class ModifyCardPinValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestModifyCardPin request = (RequestModifyCardPin) target;
/*		if (StringUtils.isBlank(request.getCardId())) {
			logger.error("cardId id es requerido");
			errors.rejectValue("cardId", "Es requerido");
		}else*/ if (request.getPin() == null || StringUtils.isBlank(request.getPin().toString())) {
			logger.error("pin es requerido");
			errors.rejectValue("pin", "Es requerido");					
		}
		logger.debug("validate: fin");
	}
}
