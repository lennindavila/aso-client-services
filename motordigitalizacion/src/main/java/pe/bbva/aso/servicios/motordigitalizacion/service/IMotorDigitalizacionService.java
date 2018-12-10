package pe.bbva.aso.servicios.motordigitalizacion.service;

import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;

public interface IMotorDigitalizacionService {
	ZicResult envioContrato(FileUnico fileUnico);
	ZicResult generarDocumentos(FileUnico fileUnico) throws Exception;	
}
