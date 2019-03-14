package pe.bbva.soa.envioSMS.service;

import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;

import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;

public interface IEnviarSMSService {
  
	public EnviarSMSResponse obtenerSMS(EnviarSMSDto filtro) throws ServiceExceptionBBVA;
}
