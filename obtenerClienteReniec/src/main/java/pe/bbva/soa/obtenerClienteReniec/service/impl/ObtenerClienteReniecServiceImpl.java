package pe.bbva.soa.obtenerClienteReniec.service.impl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.grupobbva.pe.SIR.ents.header.RequestHeader;
import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIRequest;
import com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse;
import com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_ServiceLocator;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.soa.obtenerClienteReniec.dto.ConsultaPorDNIDTO;
import pe.bbva.soa.obtenerClienteReniec.service.IObtenerClienteReniecService;

@Service
@Scope("prototype")
public class ObtenerClienteReniecServiceImpl  implements IObtenerClienteReniecService{
	final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

	@Autowired
	protected Environment env;	

	@Override
	public ConsultaPorDNIResponse obtenerClienteDNI(ConsultaPorDNIDTO filtro) throws ServiceExceptionBBVA {
		WS_PersonaReniec_ServiceLocator loc = new WS_PersonaReniec_ServiceLocator();
				
		ConsultaPorDNIRequest consultaPorDNIRequest = new ConsultaPorDNIRequest();
		RequestHeader refRequestHeader = new RequestHeader();
		refRequestHeader.setCanal(filtro.getCanal());
		refRequestHeader.setCodigoAplicacion(filtro.getCodigoAplicacion());
		refRequestHeader.setIdEmpresa(filtro.getIdEmpresa());
		refRequestHeader.setUsuario(filtro.getUsuario());
		refRequestHeader.setFechaHoraEnvio(filtro.getFechaHoraEnvio());
		refRequestHeader.setIdTransaccion(filtro.getIdTransaccion());
		refRequestHeader.setCodigoInterfaz(filtro.getCodigoInterfaz());
		
		com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest refConsultaPorDNIRequest = new com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest();
		refConsultaPorDNIRequest.setCentroCostos(filtro.getCentroCostos());
		refConsultaPorDNIRequest.setHostSolicitante(filtro.getHostSolicitante());
		refConsultaPorDNIRequest.setTipoAplicacion(filtro.getTipoAplicacion());
		refConsultaPorDNIRequest.setNumeroDNISolicitante(filtro.getNumeroDNISolicitante());
		refConsultaPorDNIRequest.setRegistroCodUsuario(filtro.getRegistroCodUsuario());
		refConsultaPorDNIRequest.setNumeroDNIConsultado(filtro.getNumeroDNIConsultado());
		refConsultaPorDNIRequest.setIndConsultaDatos(filtro.getIndConsultaDatos());
		refConsultaPorDNIRequest.setIndConsultaFoto(filtro.getIndConsultaFoto());
		refConsultaPorDNIRequest.setIndConsultaFirma(filtro.getIndConsultaFirma());
		refConsultaPorDNIRequest.setFormatoFirma(filtro.getFormatoFirma());
		
		consultaPorDNIRequest.setRefRequestHeader(refRequestHeader );				
		consultaPorDNIRequest.setRefConsultaPorDNIRequest(refConsultaPorDNIRequest);
		
		ConsultaPorDNIResponse resp = null;
		try {
			String url = env.getProperty("reniec.servicio.url");
			loc.setWS_PersonaReniecAddress(url);
			resp = loc.getWS_PersonaReniec().consultaPorDNI(consultaPorDNIRequest);
		} catch (RemoteException e) {
			throw new ConnectionExceptionBBVA(e);
		} catch (ServiceException e) {
			throw new ServiceExceptionBBVA(e);
		}
		
		return resp;
	}

	
}
