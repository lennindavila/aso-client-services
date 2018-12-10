package pe.bbva.aso.servicios.cliente.base.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;

import ch.qos.logback.classic.Logger;

public class LoggerServiciosASO {
	Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	protected void traceRequest(HttpRequest request, byte[] body) throws IOException {
		logger.info("===========================request begin================================================");
		logger.info("URI         : {}", request.getURI());
		logger.info("Method      : {}", request.getMethod());
		logger.info("Headers     : {}", request.getHeaders());
		logger.info("Request body: {}", new String(body, "UTF-8"));
		logger.info("==========================request end================================================");
	}

	protected ClientHttpResponse traceResponse(ClientHttpResponse response) throws IOException {
		final ClientHttpResponse responseCopy = new BufferingClientHttpResponseWrapper(response);
		logger.info("============================response begin==========================================");
		logger.info("Status code  : {}", response.getStatusCode());
		logger.info("Status text  : {}", response.getStatusText());
		logger.info("Headers      : {}", response.getHeaders());
		StringBuilder inputStringBuilder = new StringBuilder();
		
		if(response.getStatusCode()!=HttpStatus.NO_CONTENT) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseCopy.getBody(), "UTF-8"));
		String line = bufferedReader.readLine();
		while (line != null) {
			inputStringBuilder.append(line);
			inputStringBuilder.append('\n');
			line = bufferedReader.readLine();
		}
		logger.info("Response body: " + inputStringBuilder.toString());
		}
		logger.info("=======================response end=================================================");
		return responseCopy;
	}
}
