package pe.bbva.aso.servicios.grantingticket.dao.impl;

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
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.grantingticket.dao.IGrantingTicketAPGRestClient;
import pe.bbva.aso.servicios.grantingticket.dto.RequestGrantingTicket;

@Repository
@Scope("prototype")
public class GrantingTicketAPGRestClientImpl implements IGrantingTicketAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	@Override
	public String grantingTicket(RequestGrantingTicket filtro) {
		logger.debug("grantingTicket :inicio");
		String pathServicio = env.getProperty("paas.servicio.rest.grantingticket.url");
		
	   	    
		HttpHeaders headers = new HttpHeaders();
		headers.set("tsec", null);
		headers.setContentType(MediaType.APPLICATION_JSON);
				
		HttpEntity<RequestGrantingTicket> httpEntity = new HttpEntity<RequestGrantingTicket>(filtro,headers);
		logger.debug("grantingTicket :request object --");	
		ParameterizedTypeReference<String> typeRef = new ParameterizedTypeReference<String>() {
		};
		
		ResponseEntity<String> respuesta = this.restTemplateAutenticado
				.exchange(pathServicio, HttpMethod.POST,httpEntity, typeRef);
		
		logger.debug("grantingTicket :fin");	
		return respuesta.getHeaders().get("tsec").get(0);
	}
}