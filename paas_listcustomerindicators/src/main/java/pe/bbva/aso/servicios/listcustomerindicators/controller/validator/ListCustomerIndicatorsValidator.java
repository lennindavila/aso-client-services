package pe.bbva.aso.servicios.listcustomerindicators.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.listcustomerindicators.dto.RequestListCustomersIndicators;

@Component
@Scope("prototype")
public class ListCustomerIndicatorsValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	/*@Override*/
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	/*@Override*/
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestListCustomersIndicators request = (RequestListCustomersIndicators) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}
