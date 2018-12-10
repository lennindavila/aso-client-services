package pe.bbva.aso.servicios.motordigitalizacion.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.OptionsClientes;
import pe.bbva.aso.servicios.motordigitalizacion.dto.OptionsItems;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;
import pe.bbva.aso.servicios.motordigitalizacion.dto.request.RequestFileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.service.IMotorDigitalizacionService;
import pe.bbva.aso.servicios.motordigitalizacion.util.Wrapper;

@Controller
@Scope("prototype")
public class MotorDigitalizacionController  extends BaseController {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	
	//@Qualifier(value="MotorDigitalizacionServiceImpl")
	@Autowired
	private IMotorDigitalizacionService motorDigitalizacionService;

	@Override
	public ZicResult ejecutarEnvioContrato(RequestFileUnico request) {
		logger.debug("ejecutarEnvioContrato: inicio");
		FileUnico fileUnico;
		ZicResult response=null;
		try {
			fileUnico = new Wrapper().Wrapper(request);
			
			System.out.println("fu FileUnico NumeroContrato: " + fileUnico.getNumeroContrato());
			System.out.println("fu FileUnico IdContrato: " + fileUnico.getIdContrato());
			
			for(OptionsItems it:fileUnico.getListaItems()) {
				System.out.println("fu FileUnico OptionsItems: " + it.getLabel() + " ** " + it.getValue());
			}
			for(OptionsClientes ic:fileUnico.getListaClientes()) {
				System.out.println("fu FileUnico OptionsClientes: " + ic.getEmail() + " ** " + ic.getTipoDocumento());
				for(OptionsItems it:ic.getListaItems()) {
					System.out.println("fu FileUnico Clientes OptionsItems: " + it.getLabel() + " ** " + it.getValue());
				}			
			}
			response = this.motorDigitalizacionService.envioContrato(fileUnico);
			logger.debug("ejecutarEnvioContrato: fin");			
		} catch (Exception e) {			
			e.printStackTrace();
		} 
		return response;
	}

	@Override
	public ZicResult ejecutarGenerarDocumentos(RequestFileUnico request) throws Exception {
		logger.debug("ejecutarGenerarDocumentos: inicio");
		FileUnico fileUnico = new Wrapper().Wrapper(request);
		
		System.out.println("fu FileUnico NumeroContrato: " + fileUnico.getNumeroContrato());
		System.out.println("fu FileUnico IdContrato: " + fileUnico.getIdContrato());
		
		for(OptionsItems it:fileUnico.getListaItems()) {
			System.out.println("fu FileUnico OptionsItems: " + it.getLabel() + " ** " + it.getValue());
		}
		for(OptionsClientes ic:fileUnico.getListaClientes()) {
			System.out.println("fu FileUnico OptionsClientes: " + ic.getEmail() + " ** " + ic.getTipoDocumento());
			for(OptionsItems it:ic.getListaItems()) {
				System.out.println("fu FileUnico Clientes OptionsItems: " + it.getLabel() + " ** " + it.getValue());
			}			
		}
		
		ZicResult response = this.motorDigitalizacionService.generarDocumentos(fileUnico);
		logger.debug("ejecutarGenerarDocumentos: fin");
		return response;
	}
}
