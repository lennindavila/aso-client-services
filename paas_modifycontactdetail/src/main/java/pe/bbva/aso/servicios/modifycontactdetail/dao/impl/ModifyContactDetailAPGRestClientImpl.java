package pe.bbva.aso.servicios.modifycontactdetail.dao.impl;

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
import pe.bbva.aso.servicios.modifycontactdetail.dao.IModifyContactDetailAPGRestClient;
import pe.bbva.aso.servicios.modifycontactdetail.dto.RequestModifyContactDetail;
import pe.bbva.aso.servicios.modifycontactdetail.dto.ResponseModifyContactDetail;

@Repository
@Scope("prototype")
public class ModifyContactDetailAPGRestClientImpl implements IModifyContactDetailAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();
	
	@Override
	public ResponseModifyContactDetail modifyContactDetail(RequestModifyContactDetail filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyContactDetailAPGRestClientImpl modifyContactDetail :inicio");
		logger.debug("ModifyContactDetailAPGRestClientImpl modifyContactDetail: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.modifycontactdetail.url");

		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer-id", filtro.getCustomerId());
		parametrosUrl.put("contact-detail-id", filtro.getContactDetailId());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseModifyContactDetail> typeRef = new ParameterizedTypeReference<ResponseModifyContactDetail>() {
		};		
		
		ResponseEntity<ResponseModifyContactDetail> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.PATCH,
							httpEntity, typeRef,parametrosUrl);	
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.MODIFYCONTACTDETAIL,e,e.getCodigo(),e.getMessage());
		}
		logger.debug("ModifyContactDetailAPGRestClientImpl modifyContactDetail: parameters response: " + json.toJson(respuesta));
		logger.debug("ModifyContactDetailAPGRestClientImpl modifyContactDetail :fin");
		return respuesta.getBody();
	}	
}
