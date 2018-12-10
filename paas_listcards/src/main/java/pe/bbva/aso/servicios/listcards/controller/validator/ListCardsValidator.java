package pe.bbva.aso.servicios.listcards.controller.validator;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;

@Component
@Scope("prototype")
public class ListCardsValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		/*RequestListCards request = (RequestListCards) target;
		if (StringUtils.isBlank(request.getCustomer().getId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}*/
		logger.debug("validate: fin");
	}
}
