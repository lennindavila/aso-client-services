package pe.bbva.aso.servicios.modifycard.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.modifycard.dto.RequestModifyCard;

@Component
@Scope("prototype")
public class ModifyCardValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestModifyCard request = (RequestModifyCard) target;
		if (StringUtils.isBlank(request.getCardId())) {
			logger.error("cardId id es requerido");
			errors.rejectValue("cardId", "Es requerido");
		}else if (request.getStatus() == null || StringUtils.isBlank(request.getStatus().getId())) {
			logger.error("status.id es requerido");
			errors.rejectValue("status.id", "Es requerido");					
		}
		logger.debug("validate: fin");
	}
}
