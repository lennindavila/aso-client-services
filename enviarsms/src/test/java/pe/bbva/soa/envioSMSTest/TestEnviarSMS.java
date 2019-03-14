package pe.bbva.soa.envioSMSTest;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;

import ch.qos.logback.classic.Logger;
import pe.bbva.soa.envioSMS.config.EnvioSMSConfig;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;

public class TestEnviarSMS {
	
	@Test
	public void enviar() {
		
		Logger logger = (Logger) LoggerFactory.getLogger(getClass());
		EnvioSMSConfig listarSmsConfig = new EnvioSMSConfig();
		EnviarSMSDto filtro = new EnviarSMSDto();
		
		//filtro.getNumeroOperacion(), filtro.getMensaje(), filtro.getTelefono(), filtro.getOperador()
		filtro.setNumeroOperacion("11111");
		filtro.setMensaje("Eclipse - Apertura de cuenta desde EnvioSMSTest");
		filtro.setTelefono("51953500295");
		filtro.setOperador("595.claro.pe");
		
		EnviarSMSResponse respuesta = listarSmsConfig.enviar(filtro);
		String msg = respuesta.getRefResponseBody().getEnviarReturn();
		
		logger.info("Mensaje desde ws TestEnviarSMS: " + msg);
	}
}
