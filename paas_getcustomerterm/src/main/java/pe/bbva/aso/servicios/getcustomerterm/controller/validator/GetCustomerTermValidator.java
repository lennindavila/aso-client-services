package pe.bbva.aso.servicios.getcustomerterm.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.getcustomerterm.dto.RequestGetCustomerTerm;

@Component
@Scope("prototype")
public class GetCustomerTermValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestGetCustomerTerm request = (RequestGetCustomerTerm) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Customer Id es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getTermId())) {
			logger.error("Term Id es requerido");
			errors.rejectValue("termId", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}
