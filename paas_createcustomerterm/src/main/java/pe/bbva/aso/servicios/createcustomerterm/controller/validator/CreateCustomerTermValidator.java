package pe.bbva.aso.servicios.createcustomerterm.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcustomerterm.dto.RequestCreateCustomerTerm;

@Component
@Scope("prototype")
public class CreateCustomerTermValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateCustomerTerm request = (RequestCreateCustomerTerm) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (request.getTermType() == null || StringUtils.isBlank(request.getTermType().getId())) {
			logger.error("TermType id es requerido");
			errors.rejectValue("TermTypeId", "Es requerido");
		}else if (request.getStatus() == null || StringUtils.isBlank(request.getStatus().getId())) {
			logger.error("Status id es requerido");
			errors.rejectValue("StatusId", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}