package pe.bbva.aso.servicios.listcatalogs.controller.validator;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;

@Component
@Scope("prototype")
public class ListCatalogsValidator implements Validator {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		logger.debug("validate: inicio");
		RequestListCatalogs request = (RequestListCatalogs) target;
		if (StringUtils.isBlank(request.getCatalogId())) {
			logger.error("Codigo de Catalogo es requerido");
			errors.rejectValue("catalogId", "Es requerido");
		}
		logger.debug("validate: fin");
	}
}