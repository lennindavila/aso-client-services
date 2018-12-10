package pe.bbva.aso.servicios.cliente.base.resttemplate;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class CustomRestTemplate extends RestTemplate {

	public CustomRestTemplate(ClientHttpRequestFactory requestFactory) {
		super(requestFactory);		
	}
	
	public <T> ResponseEntity<T> exchangeWithoutEncode(String url, HttpMethod method, HttpEntity<?> requestEntity,
			ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) throws RestClientException {

		Type type = responseType.getType();
		RequestCallback requestCallback = httpEntityCallback(requestEntity, type);
		ResponseExtractor<ResponseEntity<T>> responseExtractor = responseEntityExtractor(type);
		return executeWithoutEncode(url, method, requestCallback, responseExtractor, uriVariables);
	}

	private <T> T executeWithoutEncode(String url, HttpMethod method, RequestCallback requestCallback,
			ResponseExtractor<T> responseExtractor, Map<String, ?> urlVariables) throws RestClientException {
		
		URI expanded = new CustomUriTemplate(url).expandWithoutEncode(urlVariables);		
		return doExecute(expanded, method, requestCallback, responseExtractor);
	}
}
