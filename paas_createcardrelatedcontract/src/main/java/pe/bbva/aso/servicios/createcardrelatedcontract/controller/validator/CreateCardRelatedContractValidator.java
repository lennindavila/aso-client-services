package pe.bbva.aso.servicios.createcardrelatedcontract.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcardrelatedcontract.dto.RequestCreateCardRelatedContract;

@Component
@Scope("prototype")
public class CreateCardRelatedContractValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateCardRelatedContract request = (RequestCreateCardRelatedContract) target;
		if (StringUtils.isBlank(request.getCardId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("cardId", "Es requerido");
		}else if (StringUtils.isBlank(request.getContractId())) {
			logger.error("Codigo de cliente es requerido");
			errors.rejectValue("contractId", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}
