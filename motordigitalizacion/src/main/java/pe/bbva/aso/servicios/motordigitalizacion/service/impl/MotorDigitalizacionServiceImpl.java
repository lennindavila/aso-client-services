package pe.bbva.aso.servicios.motordigitalizacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.motordigitalizacion.dao.IMotorDigitalizacionAPGRestClient;
import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;
import pe.bbva.aso.servicios.motordigitalizacion.service.IMotorDigitalizacionService;

@Service
@Scope("prototype")
public class MotorDigitalizacionServiceImpl  implements IMotorDigitalizacionService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	private IMotorDigitalizacionAPGRestClient motorDigitalizacionAPGRestClient;
	
	@Override
	public ZicResult envioContrato(FileUnico fileUnico) {	
		ZicResult respuesta = motorDigitalizacionAPGRestClient.envioContrato(fileUnico);
		return respuesta;
	}

	@Override
	public ZicResult generarDocumentos(FileUnico fileUnico) throws Exception {
		ZicResult respuesta = motorDigitalizacionAPGRestClient.generarDocumentos(fileUnico);
		return respuesta;
	}

	
}
