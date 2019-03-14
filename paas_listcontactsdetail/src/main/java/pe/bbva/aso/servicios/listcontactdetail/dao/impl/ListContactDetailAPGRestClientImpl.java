package pe.bbva.aso.servicios.listcontactdetail.dao.impl;

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
import pe.bbva.aso.servicios.listcontactdetail.dao.IListContactDetailAPGRestClient;
import pe.bbva.aso.servicios.listcontactdetail.dto.RequestListContactDetailDTO;
import pe.bbva.aso.servicios.listcontactdetail.dto.ResponseContactDetailDTO;

@Repository
@Scope("prototype")
public class ListContactDetailAPGRestClientImpl implements IListContactDetailAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();
	
	@Override
	public ResponseContactDetailDTO listContactDetail(RequestListContactDetailDTO filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ListContactDetailAPGRestClientImpl listContactDetail :inicio");
		logger.debug("ListContactDetailAPGRestClientImpl listContactDetail: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.listcontactdetail.url");
				
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer-id", filtro.getCustomerId());
		parametrosUrl.put("unmasked", filtro.getUnmasked());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseContactDetailDTO> typeRef = new ParameterizedTypeReference<ResponseContactDetailDTO>() {
		};
		
		ResponseEntity<ResponseContactDetailDTO> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.GET,httpEntity, typeRef, parametrosUrl);
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.LISTCONTACTDETAIL,e,e.getCodigo(),e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}
		logger.debug("ListContactDetailAPGRestClientImpl listContactDetail: parameters response: " + json.toJson(respuesta));
		logger.debug("ListContactDetailAPGRestClientImpl listContactDetail :fin");
		return respuesta.getBody();
	}
	
}
