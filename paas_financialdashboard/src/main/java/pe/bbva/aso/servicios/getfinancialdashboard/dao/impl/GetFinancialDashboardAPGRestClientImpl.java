package pe.bbva.aso.servicios.getfinancialdashboard.dao.impl;

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
import pe.bbva.aso.servicios.getfinancialdashboard.dao.IGetFinancialDashboardAPGRestClient;
import pe.bbva.aso.servicios.getfinancialdashboard.dto.ResponseGetFinancialDashboard;

@Repository
@Scope("prototype")
public class GetFinancialDashboardAPGRestClientImpl implements IGetFinancialDashboardAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseGetFinancialDashboard getFinancialDashboard(String customerId, String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetFinancialDashboardAPGRestClientImpl getFinancialDashboard: inicio");
		logger.debug("GetFinancialDashboardAPGRestClientImpl getFinancialDashboard: parameters request: customerId=" + customerId);
		String pathServicio = env.getProperty("paas.servicio.rest.getfinancialdashboard.url");
		
		Map<String, String> parametrosUrl = new HashMap<String, String>();
		parametrosUrl.put("customer-id", customerId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseGetFinancialDashboard> typeRef = new ParameterizedTypeReference<ResponseGetFinancialDashboard>() {
		};		

		ResponseEntity<ResponseGetFinancialDashboard> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.GET,
							httpEntity, typeRef, parametrosUrl);		
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.GETFINANCIALDASHBOARD,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("GetFinancialDashboardAPGRestClientImpl getFinancialDashboard: parameters response: " + json.toJson(respuesta));
		logger.debug("GetFinancialDashboardAPGRestClientImpl getFinancialDashboard: fin");
		return respuesta.getBody();
	}	
}
