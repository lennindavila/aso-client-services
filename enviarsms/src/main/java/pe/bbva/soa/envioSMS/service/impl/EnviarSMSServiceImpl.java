package pe.bbva.soa.envioSMS.service.impl;

import ch.qos.logback.classic.Logger;
import com.grupobbva.pe.sms.ent.body.enviar.EnviarRequest;
import com.grupobbva.pe.sms.ent.body.enviar.EnviarResponse;
import com.grupobbva.pe.sms.service.message.EnviarSMS;
import com.grupobbva.pe.sms.service.message.EnviarSMSRequest;
import com.grupobbva.pe.sms.service.message.EnviarSMSResponse;
import com.grupobbva.pe.sms.service.message.EnviarSMSServiceLocator;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.envioSMS.dto.EnviarSMSDto;
import pe.bbva.soa.envioSMS.service.IEnviarSMSService;

@Service
@Scope("prototype")
public class EnviarSMSServiceImpl implements IEnviarSMSService {
  
	final Logger logger = (Logger)LoggerFactory.getLogger(getClass());
	
	@Autowired
	protected Environment env;
	public EnviarSMSResponse obtenerSMS(EnviarSMSDto filtro) throws ServiceExceptionBBVA{
	    EnviarSMSServiceLocator locator = new EnviarSMSServiceLocator();
	    
	    EnviarSMSRequest enviarSMSRequest = new EnviarSMSRequest();
	    
	    EnviarRequest refEnviarRequest = new EnviarRequest();
	    refEnviarRequest.setNumeroOperacion(filtro.getNumeroOperacion());
	    refEnviarRequest.setMensaje(filtro.getMensaje());
	    refEnviarRequest.setTelefono(filtro.getTelefono());
	    refEnviarRequest.setOperador(filtro.getOperador());
	    
	    enviarSMSRequest.setRefRequestBody(refEnviarRequest);
	    EnviarResponse refResponseBody = new EnviarResponse();
	    EnviarSMSResponse resp = new EnviarSMSResponse();
    
	    try{
			EnviarSMS enviarsmsService = locator.getEnviarSMS();
			  
			String ws_enviar = enviarsmsService.enviar(filtro.getNumeroOperacion(), filtro.getMensaje(), filtro.getTelefono(), filtro.getOperador());
			  
			//JOptionPane.showMessageDialog(null, "El resultado del envio del sms es: " + ws_enviar);
			this.logger.debug("Se ha envio el sms  : " + ws_enviar );  
			//resp.getRefResponseBody().setEnviarReturn(ws_enviar);
			refResponseBody.setEnviarReturn("Mensaje Ok");
			resp.setRefResponseBody(refResponseBody);
			this.logger.debug("Se ha envio el sms fin : " + ws_enviar );
		} catch (RemoteException e){			
			throw new ConnectionExceptionBBVA(e);
			
		} catch (ServiceException e){
			try{
				throw new ServiceException(e);
			}catch (ServiceException e1){
				e1.printStackTrace();
			}
		}
	    
	    return resp;
	}
}
