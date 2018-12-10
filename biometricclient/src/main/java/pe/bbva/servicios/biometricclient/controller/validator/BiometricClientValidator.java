package pe.bbva.servicios.biometricclient.controller.validator;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;

@Component
@Scope("prototype")
public class BiometricClientValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("BiometricClientValidator validate: inicio");
		AuthenticateRequest request = (AuthenticateRequest) target;
		
/*		if (request.getCustomer() == null || StringUtils.isBlank(request.getCustomer().getId())) {
			logger.error("id de cliente es requerido");
			errors.rejectValue("Customer.Id", "Es requerido");			
		}else if(StringUtils.isBlank(request.getDocumentNumber())){
			logger.error("DocumentNumber es requerido");
			errors.rejectValue("DocumentNumber", "Es requerido");
		}else if(StringUtils.isBlank(request.getDocumentTypeId())){
			logger.error("DocumentTypeId es requerido");
			errors.rejectValue("DocumentTypeId", "Es requerido");			
		}*/
		logger.debug("BiometricClientValidator validate: fin");
	}
}
