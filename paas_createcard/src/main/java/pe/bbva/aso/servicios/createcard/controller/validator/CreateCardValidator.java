package pe.bbva.aso.servicios.createcard.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcard.dto.RequestCreateCard;

@Component
@Scope("prototype")
public class CreateCardValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateCard request = (RequestCreateCard) target;
		if (request.getCardType() == null || StringUtils.isBlank(request.getCardType().getId())) {
			logger.error("cardType id es requerido");
			errors.rejectValue("cardType.id", "Es requerido");
		}else if (request.getPhysicalSupport() == null || StringUtils.isBlank(request.getPhysicalSupport().getId())) {
			logger.error("physicalSupport id es requerido");
			errors.rejectValue("physicalSupport.id", "Es requerido");
		}
		logger.debug("validate: fin");		
	}
}
