package pe.bbva.aso.servicios.modifycustomerterm.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;

@Component
@Scope("prototype")
public class ModifyCustomerTermValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("ModifyCustomerTermValidator validate: inicio");
		RequestModifyCustomerTerm request = (RequestModifyCustomerTerm) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getTermId())) {
			logger.error("termId id es requerido");
			errors.rejectValue("termId", "Es requerido");
		}else if (request.getStatus() == null || StringUtils.isBlank(request.getStatus().getId())) {
			logger.error("Status.id es requerido");
			errors.rejectValue("status.id", "Es requerido");
		}
		logger.debug("ModifyCustomerTermValidator validate: fin");
	}
}