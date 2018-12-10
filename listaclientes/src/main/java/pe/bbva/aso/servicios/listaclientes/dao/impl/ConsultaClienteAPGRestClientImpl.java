package pe.bbva.aso.servicios.listaclientes.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.listaclientes.dao.IConsultaClienteAPGRestClient;
import pe.bbva.aso.servicios.listaclientes.dto.RequestListCustomers;
import pe.bbva.aso.servicios.listaclientes.dto.ResponseListCustomers;


@Repository
@Scope("prototype")
public class ConsultaClienteAPGRestClientImpl implements IConsultaClienteAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
	
	@Autowired
	protected Environment env;
	

	@Override
	public ResponseListCustomers consultarCliente(RequestListCustomers filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("consultarCliente :inicio ");
		
		String pathServicio = env.getProperty("paas.servicio.rest.listcustomers.url");		
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();	
		parametrosUrl.put("identityDocument.documentNumber", filtro.getDocumentNumber());
		parametrosUrl.put("identityDocument.documentType.id", filtro.getDocumentTypeId());
		parametrosUrl.put("expand", filtro.getExpand());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseListCustomers> typeRef = new ParameterizedTypeReference<ResponseListCustomers>() {
		};
		ResponseEntity<ResponseListCustomers> respuesta = null;
		
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.GET,
							httpEntity, typeRef, parametrosUrl);			
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(e,"Error al intentar Conectar con Servicios ASO");
		}
		logger.debug("consultarCliente :fin");
		return respuesta.getBody();
	}
	
}
