package pe.bbva.aso.servicios.listcards.dao.impl;

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

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.enumerators.ServiceNameEnum;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.listcards.dao.IListCardsAPGRestClient;
import pe.bbva.aso.servicios.listcards.dto.RequestListCards;
import pe.bbva.aso.servicios.listcards.dto.ResponseListCards;

@Repository
@Scope("prototype")
public class ListCardsAPGRestClientImpl implements IListCardsAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());
	
	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseListCards listCards(RequestListCards filtro, String tsec)throws ServiceExceptionBBVA {
		logger.debug("ListCardsAPGRestClientImpl listCards :inicio");
		logger.debug("ListCardsAPGRestClientImpl listCards: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.listcards.url");		
		logger.debug("listCards :inicio new url " + pathServicio);
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer.id", filtro.getCustomer()!=null?filtro.getCustomer().getId():"");
		parametrosUrl.put("cardType.id", filtro.getCardType()!=null?filtro.getCardType().getId():"");
		parametrosUrl.put("physicalSupport.id", filtro.getPhysicalSupport()!=null?filtro.getPhysicalSupport().getId():"");
		parametrosUrl.put("status.id",  filtro.getStatus()!=null?filtro.getStatus().getId():"");
		parametrosUrl.put("paginationKey", filtro.getPaginationKey()!=null?filtro.getPaginationKey():"");
		parametrosUrl.put("pageSize", filtro.getPaginationKey()!=null?filtro.getPageSize():"");		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseListCards> typeRef = new ParameterizedTypeReference<ResponseListCards>() {
		};
		
		ResponseEntity<ResponseListCards> respuesta = null;
		
		try {
			respuesta = this.restTemplateAutenticado.exchange(pathServicio, 
																HttpMethod.GET,
																httpEntity, 
																typeRef, 
																parametrosUrl);			
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.LISTCARDS,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("ListCardsAPGRestClientImpl listCards: parameters response: " + json.toJson(respuesta));
		logger.debug("ListCardsAPGRestClientImpl listCards :fin");
		return respuesta.getBody();
	}	
}
