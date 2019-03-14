package pe.bbva.aso.servicios.modifycustomerterm.dao.impl;

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
import pe.bbva.aso.servicios.modifycustomerterm.dao.IModifyCustomerTermAPGRestClient;
import pe.bbva.aso.servicios.modifycustomerterm.dto.RequestModifyCustomerTerm;
import pe.bbva.aso.servicios.modifycustomerterm.dto.ResponseModifyCustomerTerm;

@Repository
@Scope("prototype")
public class ModifyCustomerTermAPGRestClientImpl implements IModifyCustomerTermAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseModifyCustomerTerm modifyCustomerTerm(RequestModifyCustomerTerm filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("ModifyCustomerTermAPGRestClientImpl modifyCustomerTerm :inicio");
		logger.debug("ModifyCustomerTermAPGRestClientImpl modifyCustomerTerm: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.modifycustomerterm.url");		
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer-id", filtro.getCustomerId());
		parametrosUrl.put("term-id", filtro.getTermId());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseModifyCustomerTerm> typeRef = new ParameterizedTypeReference<ResponseModifyCustomerTerm>() {
		};
		
		ResponseEntity<ResponseModifyCustomerTerm> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.PATCH,
							httpEntity, typeRef,parametrosUrl);		
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.MODIFYCUSTOMERTERM,e,e.getCodigo(),e.getMessage());
		}
		logger.debug("ModifyCustomerTermAPGRestClientImpl modifyCustomerTerm: parameters response: " + json.toJson(respuesta));
		logger.debug("ModifyCustomerTermAPGRestClientImpl modifyCustomerTerm :fin");
		return respuesta.getBody();
	}	
}
