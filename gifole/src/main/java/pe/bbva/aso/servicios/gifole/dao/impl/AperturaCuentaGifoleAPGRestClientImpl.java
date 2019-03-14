package pe.bbva.aso.servicios.gifole.dao.impl;

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
import pe.bbva.aso.servicios.gifole.dao.IAperturaCuentaGifoleAPGRestClient;
import pe.bbva.aso.servicios.gifole.dto.RequestAperturaCuentaGifole;
import pe.bbva.aso.servicios.gifole.dto.ResponseAperturaCuentaGifole;

@Repository
@Scope("prototype")
public class AperturaCuentaGifoleAPGRestClientImpl implements IAperturaCuentaGifoleAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
		
	@Autowired
	protected Environment env;
	
	private Gson json = new Gson();

	@Override
	public ResponseAperturaCuentaGifole aperturaCuentaGifole(RequestAperturaCuentaGifole filtro) throws ServiceExceptionBBVA {
		logger.debug("AperturaCuentaGifoleAPGRestClientImpl aperturaCuentaGifole: inicio");
		logger.debug("AperturaCuentaGifoleAPGRestClientImpl aperturaCuentaGifole: parameters request: " + json.toJson(filtro));
		
		String pathServicio = env.getProperty("paas.servicio.rest.gifole.url");		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);		
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(filtro,headers);
		ParameterizedTypeReference<ResponseAperturaCuentaGifole> typeRef = new ParameterizedTypeReference<ResponseAperturaCuentaGifole>() {
		};
		
		ResponseEntity<ResponseAperturaCuentaGifole> respuesta = null;
		try {
			respuesta = this.restTemplateAutenticado
					.exchange(pathServicio, HttpMethod.POST,
							httpEntity, typeRef);		
		}catch(ConnectionExceptionBBVA e) {
			throw new ServiceExceptionBBVA(ServiceNameEnum.APERTURACUENTAGIFOLE,e,e.getCodigo(),e.getMessage());
		}
		logger.debug("AperturaCuentaGifoleAPGRestClientImpl aperturaCuentaGifole: parameters response: " + json.toJson(respuesta));
		logger.debug("AperturaCuentaGifoleAPGRestClientImpl aperturaCuentaGifole: fin");
		return respuesta.getBody();
	}	
}
