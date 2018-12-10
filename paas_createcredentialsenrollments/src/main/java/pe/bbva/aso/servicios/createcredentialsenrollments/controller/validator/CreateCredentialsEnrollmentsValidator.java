package pe.bbva.aso.servicios.createcredentialsenrollments.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcredentialsenrollments.dto.RequestCredentialsEnrollments;

@Component
@Scope("prototype")
public class CreateCredentialsEnrollmentsValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCredentialsEnrollments request = (RequestCredentialsEnrollments) target;
		if (StringUtils.isBlank(request.getOriginAppId())) {
			logger.error("Origin App Id es requerido");
			errors.rejectValue("originAppId", "Es requerido");
		}else if (StringUtils.isBlank(request.getOriginUserId())) {
			logger.error("Origin User Id es requerido");
			errors.rejectValue("originUserId", "Es requerido");
		}else if (StringUtils.isBlank(request.getPasswordValue())) {
			logger.error("Password Value es requerido");
			errors.rejectValue("passwordValue", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}

