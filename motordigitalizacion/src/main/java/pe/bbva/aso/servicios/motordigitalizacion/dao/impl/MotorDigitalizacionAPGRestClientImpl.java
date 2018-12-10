package pe.bbva.aso.servicios.motordigitalizacion.dao.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.resttemplate.CustomRestTemplate;
import pe.bbva.aso.servicios.motordigitalizacion.dao.IMotorDigitalizacionAPGRestClient;
import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnico;
import pe.bbva.aso.servicios.motordigitalizacion.dto.FileUnicoBase64;
import pe.bbva.aso.servicios.motordigitalizacion.dto.ZicResult;

@Repository
@Scope("prototype")
public class MotorDigitalizacionAPGRestClientImpl implements IMotorDigitalizacionAPGRestClient{
	final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("restTemplateAutenticado")
	private CustomRestTemplate restTemplateAutenticado;
	
	private static final String SLASH = "/";
	private static final String GENERAR_DOCUMENTOS = "generarDocumentos";
	private static final String ENVIO_CONTRARO = "envioContrato"; 
    
	@Autowired
	protected Environment env;

	@Override
	public ZicResult envioContrato(FileUnico fileUnico) {
		ZicResult resultService = null;
		resultService = new ZicResult();

		/*HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);*/
		
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(fileUnico);

		String pathServicio = env.getProperty("aso.servicio.rest.url.fileunico");
		StringBuilder url = new StringBuilder(pathServicio); 
		url.append(SLASH).append(ENVIO_CONTRARO);
		HttpMethod method = HttpMethod.POST;

		ResponseEntity<Integer> responseEntity = null;
		try {
			logger.debug("envioContrato url: " + url.toString());			
			responseEntity = restTemplateAutenticado.exchange(url.toString(), method, httpEntity, Integer.class);
			Integer response = responseEntity.getBody();
			resultService.setEntidad(response);
		} catch (Exception e) {
			
		}
		return resultService;
	}

	@Override
	public ZicResult generarDocumentos(FileUnico fileUnico) throws Exception {
		ZicResult resultService = null;
		resultService = new ZicResult();
		HttpEntity<Object> httpEntity = new HttpEntity<Object>(fileUnico);
		String pathServicio = env.getProperty("aso.servicio.rest.url.fileunico");
		
		StringBuilder url = new StringBuilder(pathServicio);
		url.append(SLASH).append(GENERAR_DOCUMENTOS);
		HttpMethod method = HttpMethod.POST;

		ResponseEntity<FileUnicoBase64> responseEntity = null;
		try { 
			logger.debug("generarDocumentos url: " + url.toString());	
			responseEntity = restTemplateAutenticado.exchange(url.toString(), method, httpEntity, FileUnicoBase64.class);
			FileUnicoBase64 responseFileUnicoBase64 = responseEntity.getBody();			
			resultService.setEntidad(responseFileUnicoBase64);
		} catch (Exception e) {
			throw e;
		}
		return resultService;
	}
}
