package pe.bbva.aso.servicios.modifyindicator.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.modifyindicator.dto.RequestModifyIndicator;

@Component
@Scope("prototype")
public class ModifyIndicatorValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestModifyIndicator request = (RequestModifyIndicator) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("customerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getIndicatorId())) {
			logger.error("Codigo de indicador es requerido");
			errors.rejectValue("indicatorId", "Es requerido");
		}else if (request.getData() == null || StringUtils.isBlank(request.getData().getIsActive())) {
			logger.error("IsActive es requerido");
			errors.rejectValue("data.isActive", "Es requerido");
		}
		logger.debug("validate: fin");		
	}
}
