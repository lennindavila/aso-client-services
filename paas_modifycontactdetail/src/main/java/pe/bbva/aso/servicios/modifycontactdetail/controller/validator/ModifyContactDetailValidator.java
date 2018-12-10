package pe.bbva.aso.servicios.modifycontactdetail.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;

@Component
@Scope("prototype")
public class ModifyContactDetailValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestModifyContactDetail request = (RequestModifyContactDetail) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("customerId es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getContactDetailId())) {
			logger.error("contactDetailId es requerido");
			errors.rejectValue("contactDetailId", "Es requerido");					
		}
		logger.debug("validate: fin");		
	}
}
