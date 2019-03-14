package pe.bbva.aso.servicios.listcatalogs.dao.impl;

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
import pe.bbva.aso.servicios.listcatalogs.dao.IListCatalogsAPGRestClient;
import pe.bbva.aso.servicios.listcatalogs.dto.RequestListCatalogs;
import pe.bbva.aso.servicios.listcatalogs.dto.ResponseListCatalogs;

@Repository
@Scope("prototype")
public class ListCatalogsAPGRestClientImpl implements IListCatalogsAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseListCatalogs listCatalogs(RequestListCatalogs filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListCatalogsAPGRestClientImpl listCatalogs :inicio");
		logger.debug("ListCatalogsAPGRestClientImpl listCatalogs: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.listcatalogs.url");
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("catalogId", filtro.getCatalogId());
		parametrosUrl.put("values.description.language", filtro.getValues().getDescription().getLanguage());
		parametrosUrl.put("paginationKey", filtro.getPaginationKey());
		parametrosUrl.put("pageSize", filtro.getPageSize());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseListCatalogs> typeRef = new ParameterizedTypeReference<ResponseListCatalogs>() {
		};		
		
		ResponseEntity<ResponseListCatalogs> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.GET,
							httpEntity, typeRef, parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.LISTCATALOGS,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("ListCatalogsAPGRestClientImpl listCatalogs: parameters response: " + json.toJson(respuesta));
		logger.debug("ListCatalogsAPGRestClientImpl listCatalogs :fin");
		return respuesta.getBody();
	}	
}
