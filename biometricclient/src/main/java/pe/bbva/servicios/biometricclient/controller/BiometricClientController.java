package pe.bbva.servicios.biometricclient.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.servicios.biometricclient.controller.validator.BiometricClientValidator;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;
import pe.bbva.servicios.biometricclient.service.IBiometricClientService;

@Controller
@Scope("prototype")
public class BiometricClientController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	/*	
	@Autowired
	private Environment env;	
	*/
	@Autowired
	private IBiometricClientService biometricClientService;
	
	@Autowired
	private BiometricClientValidator biometricClientValidator;

	public AuthenticateResponse ejecutar(AuthenticateRequest request) throws ServiceExceptionBBVA {
		logger.info("BiometricClientValidator ejecutar: inicio");
		//Este servicio no tiene campos obligatorios
		/*		
		Errors errores = new BindException(filtro, filtro.getClass().getName());
		this.listarClientesValidator.validate(filtro, errores);
		if (errores.hasErrors()) {
			throw new ValidacionExceptionBBVA(errores, 
											  env.getProperty("atm.respuesta.error.general.codigo"),
											  env.getProperty("atm.respuesta.error.general.validacion.mensaje"));
		}
		*/
		
		AuthenticateResponse response = this.biometricClientService.obtenerBiometrico(request);
		logger.info("BiometricClientValidator ejecutar: fin");
		return response;
	}
}
