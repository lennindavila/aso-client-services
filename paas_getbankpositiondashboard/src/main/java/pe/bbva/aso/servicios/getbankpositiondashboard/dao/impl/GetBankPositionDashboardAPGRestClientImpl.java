package pe.bbva.aso.servicios.getbankpositiondashboard.dao.impl;

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
import pe.bbva.aso.servicios.getbankpositiondashboard.dao.IGetBankPositionDashboardAPGRestClient;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.RequestGetBankPositionDashboard;
import pe.bbva.aso.servicios.getbankpositiondashboard.dto.ResponseGetBankPositionDashboard;

@Repository
@Scope("prototype")
public class GetBankPositionDashboardAPGRestClientImpl implements IGetBankPositionDashboardAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;

	private Gson json = new Gson();
	
	@Override
	public ResponseGetBankPositionDashboard getBankPositionDashboard(RequestGetBankPositionDashboard filtro, String tsec) throws ServiceExceptionBBVA {
		logger.debug("GetBankPositionDashboardAPGRestClientImpl getBankPositionDashboard :inicio");
		logger.debug("GetBankPositionDashboardAPGRestClientImpl getBankPositionDashboard: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.bankpositiondashboard.url");
		pathServicio = pathServicio.replace("{customerId}", filtro.getCustomerId());
		//pathServicio = pathServicio.replace("{documentId}", documentId);
		//pathServicio = pathServicio.replace("{documentType}", documentType);
		
		Map<String, String> parametros = new HashMap<String, String>();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("tsec", tsec);
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(headers);
		ParameterizedTypeReference<ResponseGetBankPositionDashboard> typeRef = new ParameterizedTypeReference<ResponseGetBankPositionDashboard>() {
		};
		
		ResponseEntity<ResponseGetBankPositionDashboard> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchangeWithoutEncode(pathServicio, HttpMethod.GET,
							httpEntity, typeRef, parametros);	
		/*	Gson json = new Gson();
			logger.info("JsonPrueba: " + json.toJson(respuesta.getBody()));*/
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.GETBANKPOSITIONDASHBOARD,e,e.getCodigo(),e.getMessage());
		}
		
		logger.debug("GetBankPositionDashboardAPGRestClientImpl getBankPositionDashboard: parameters response: " + json.toJson(respuesta));
		logger.debug("GetBankPositionDashboardAPGRestClientImpl getBankPositionDashboard: fin");
		return respuesta.getBody();
	}	
}
