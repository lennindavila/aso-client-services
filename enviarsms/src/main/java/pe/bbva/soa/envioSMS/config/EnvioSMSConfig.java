package pe.bbva.soa.envioSMS.config;

import ch.qos.logback.classic.Logger;
import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pe.bbva.aso.servicios.cliente.base.interceptor.SpringConfigurableMapper;
import pe.bbva.soa.envioSMS.controller.EnviarSMSController;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;

@Configuration
@ComponentScan(basePackages={"pe.bbva.soa.envioSMS.*"}, basePackageClasses={SpringConfigurableMapper.class})
@PropertySource({"classpath:properties/enviarsms.properties"})
public class EnvioSMSConfig
{
  static final Logger logger = (Logger)LoggerFactory.getLogger(EnvioSMSConfig.class);
  private static AnnotationConfigApplicationContext ctx;
  
  public EnviarSMSResponse enviar(EnviarSMSDto filtro)
  {
    logger.debug("enviar sms: inicio");
    EnviarSMSResponse listEnvioSMS = null;
    try
    {
      ctx = new AnnotationConfigApplicationContext(new Class[] { EnvioSMSConfig.class });
      EnviarSMSController listarSmsController = (EnviarSMSController)ctx.getBean(EnviarSMSController.class);
      logger.debug("enviar sms: fin");
      listEnvioSMS = listarSmsController.enviar(filtro);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return listEnvioSMS;
  }
}
