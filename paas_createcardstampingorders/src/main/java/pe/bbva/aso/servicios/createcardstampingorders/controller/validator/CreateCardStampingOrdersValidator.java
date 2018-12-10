package pe.bbva.aso.servicios.createcardstampingorders.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createcardstampingorders.dto.RequestCreateCardStampingOrders;

@Component
@Scope("prototype")
public class CreateCardStampingOrdersValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateCardStampingOrders request = (RequestCreateCardStampingOrders) target;
		if (StringUtils.isBlank(request.getId())) {
			logger.error("id id es requerido");
			errors.rejectValue("id id", "Es requerido");
		}else if (request.getBank() == null || request.getBank().getBranch() == null || StringUtils.isBlank(request.getBank().getBranch().getId())) {
			logger.error("bank branch id es requerido");
			errors.rejectValue("bank.branch.id", "Es requerido");					
		}else if (request.getCard() == null || StringUtils.isBlank(request.getCard().getOrder())) {
			logger.error("card order es requerido");
			errors.rejectValue("card.order", "Es requerido");
		}
		logger.debug("validate: fin");		
	}
}
