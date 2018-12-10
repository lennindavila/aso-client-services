package pe.bbva.aso.servicios.createcontactdetail.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcontactdetail.dto.RequestCreateContactDetail;

@Component
@Scope("prototype")
public class CreateContactDetailValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateContactDetail request = (RequestCreateContactDetail) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getContact())) {
			logger.error("Contact es requerido");
			errors.rejectValue("contact", "Es requerido");
		}else if (request.getContactType() == null || StringUtils.isBlank(request.getContactType().getId())) {
			logger.error("ContactType id es requerido");
			errors.rejectValue("contactType.id", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}
