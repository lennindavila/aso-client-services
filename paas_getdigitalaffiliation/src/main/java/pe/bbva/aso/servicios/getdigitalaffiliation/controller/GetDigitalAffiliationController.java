package pe.bbva.aso.servicios.getdigitalaffiliation.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.getdigitalaffiliation.controller.validator.GetDigitalAffiliationValidator;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.RequestGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.dto.ResponseGetDigitalAffiliation;
import pe.bbva.aso.servicios.getdigitalaffiliation.service.IGetDigitalAffiliationService;

@Controller
@Scope("prototype")
public class GetDigitalAffiliationController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Environment env;
	
	@Autowired
	private IGetDigitalAffiliationService digitalAffiliationService;
	
	@Autowired
	private GetDigitalAffiliationValidator getAfiliacionDigitalValidator;

	@Override
	public ResponseGetDigitalAffiliation ejecutar(RequestGetDigitalAffiliation filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ejecutar: inicio");
		//Este servicio no tiene parametros obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.getAfiliacionDigitalValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		ResponseGetDigitalAffiliation response = this.digitalAffiliationService.getDigitalAffiliation(filtro, tsec);
		logger.debug("ejecutar: fin");
		return response;
	}
}
