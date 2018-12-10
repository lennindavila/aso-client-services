package pe.bbva.aso.servicios.getbankpositiondashboard.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;

@Component
@Scope("prototype")
public class GetBankPositionDashboardValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestGetBankPositionDashboard request = (RequestGetBankPositionDashboard) target;
		if (StringUtils.isBlank(request.getCustomerId())) {
			logger.error("Customer Id es requerido");
			errors.rejectValue("CustomerId", "Es requerido");
		}else if (StringUtils.isBlank(request.getDocumentId())) {
			logger.error("Document Id es requerido");
			errors.rejectValue("DocumentId", "Es requerido");
		}else if (StringUtils.isBlank(request.getDocumentType())) {
			logger.error("Document Type es requerido");
			errors.rejectValue("DocumentType", "Es requerido");
		}	
		logger.debug("validate: fin");
	}
}
