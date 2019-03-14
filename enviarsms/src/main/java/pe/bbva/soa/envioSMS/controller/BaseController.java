package pe.bbva.soa.envioSMS.controller;

import ch.qos.logback.classic.Logger;
import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;
import org.slf4j.LoggerFactory;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;

public abstract class BaseController
{
  Logger logger = (Logger)LoggerFactory.getLogger(getClass());
  
  public EnviarSMSResponse enviar(EnviarSMSDto filtro)
    throws ServiceExceptionBBVA
  {
    this.logger.debug("EnviarSMSResponse: Inicio");
    EnviarSMSResponse response = ejecutar(filtro);
    this.logger.debug("EnviarSMSResponse: Fin");
    
    return response;
  }
  
  abstract EnviarSMSResponse ejecutar(EnviarSMSDto paramEnviarSMSDto)
    throws ServiceExceptionBBVA;
}
