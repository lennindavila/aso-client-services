package pe.bbva.aso.servicios.motordigitalizacion.dao;

import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;

public interface IMotorDigitalizacionAPGRestClient {	
	ZicResult envioContrato(FileUnico fileUnico);
	ZicResult generarDocumentos(FileUnico fileUnico) throws Exception;
}
