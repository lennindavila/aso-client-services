package pe.bbva.soa.envioSMS.controller;

import ch.qos.logback.classic.Logger;
import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;
import pe.bbva.soa.envioSMS.service.IEnviarSMSService;

@Controller
@Scope("prototype")
public class EnviarSMSController extends BaseController {
  
	Logger logger = (Logger)LoggerFactory.getLogger(getClass());
  
  @Autowired
  private IEnviarSMSService enviarSMSService;
  @Override
  public EnviarSMSResponse ejecutar(EnviarSMSDto filtro)
    throws ServiceExceptionBBVA
  {
    this.logger.debug("ejecutar: Inicio");
    EnviarSMSResponse response = this.enviarSMSService.obtenerSMS(filtro);
    
    this.logger.debug("ejecutar: Fin");
    
    return response;
  }
}
