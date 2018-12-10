package pe.bbva.aso.servicios.createrqcardstampingorders.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.createrqcardstampingorders.dto.RequestCreateRqCardStampingOrders;

@Component
@Scope("prototype")
public class CreateRqCardStampingOrdersValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestCreateRqCardStampingOrders request = (RequestCreateRqCardStampingOrders) target;
		if (request.getBank() == null || request.getBank().getBranch() == null || StringUtils.isBlank(request.getBank().getBranch().getId())) {
			logger.error("bank.branch.id es requerido");
			errors.rejectValue("bank.branch.id", "Es requerido");
		}else if (request.getCard() == null || StringUtils.isBlank(request.getCard().getOrder())) {
			logger.error("card.order es requerido");
			errors.rejectValue("card.order", "Es requerido");					
		}else if (request.getCard() == null || request.getCard().getCardType() == null || StringUtils.isBlank(request.getCard().getCardType().getId())) {
			logger.error("Joint id es requerido");
			errors.rejectValue("Joint id", "Es requerido");
		}else if (request.getCard() == null || StringUtils.isBlank(request.getCard().getFormatType())) {
			logger.error("card.formatType es requerido");
			errors.rejectValue("card.formatType", "Es requerido");			
		}
		logger.debug("validate: fin");		
	}
}
