package pe.bbva.soa.rbaonline.service.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO;
import com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINELocator;
import com.bbva.krba.krbabusiness.online.service.WSBB_RBAONLINESoapBindingStub;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.soa.rbaonline.service.IRbaOnlineService;

@Service
@Scope("prototype")
public class RbaOnlineServiceImpl  implements IRbaOnlineService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	protected Environment env;

	@Override
	public SalidaOnlineDTO getConsultaOnline(EntradaOnlineDTO filtro) {
		WSBB_RBAONLINELocator wsrba = new WSBB_RBAONLINELocator();				
		SalidaOnlineDTO resp = null;
		
		try {
			String url = env.getProperty("rba.servicio.url");
			Boolean useProxy = Boolean.parseBoolean(env.getProperty("rba.servicio.useproxy"));
			String proxyhost = env.getProperty("rba.servicio.proxyhost");
			String proxyport = env.getProperty("rba.servicio.proxyport");
			String protocol = env.getProperty("rba.servicio.protocol");	
			
			if(useProxy) {
				System.getProperties().put(protocol + ".proxyHost", proxyhost);
				System.getProperties().put(protocol + ".proxyPort", proxyport);				
			}
			wsrba.setOnlineServiceImplPortAddress(url);
			resp = wsrba.getOnlineServiceImplPort().getConsultaOnline(filtro);
		} catch (RemoteException e) {
			throw new ConnectionExceptionBBVA(e);
		} /*catch (ServiceException e) {
			throw new ServiceExceptionBBVA(e);
		}*/ catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return resp;
	}

	
}
