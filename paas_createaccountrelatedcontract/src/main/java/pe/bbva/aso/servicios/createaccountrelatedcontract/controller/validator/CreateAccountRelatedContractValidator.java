package pe.bbva.aso.servicios.createaccountrelatedcontract.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createaccountrelatedcontract.dto.RequestCreateAccountRelatedContract;

@Component
@Scope("prototype")
public class CreateAccountRelatedContractValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateAccountRelatedContract request = (RequestCreateAccountRelatedContract) target;
		if (StringUtils.isBlank(request.getAccountId())) {
			logger.error("Account Id es requerido");
			errors.rejectValue("accountId", "Es requerido");
		}else if (StringUtils.isBlank(request.getContractId())) {
			logger.error("Contract Id es requerido");
			errors.rejectValue("contractId", "Es requerido");
		}else if (request.getProduct() == null || StringUtils.isBlank(request.getProduct().getId())) {
			logger.error("Product Id es requerido");
			errors.rejectValue("product.id", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}