package pe.bbva.aso.servicios.cliente.base.interceptor;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import javax.net.ssl.SSLException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
@Component
public class RestClientInterceptor extends LoggerServiciosASO implements ClientHttpRequestInterceptor {
	final static Logger logger = (Logger) LoggerFactory.getLogger(RestClientInterceptor.class);

	@Autowired
	protected Environment env;
	//@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
	
		traceRequest(request, body);
		ClientHttpResponse response = null;
		try {
			response = execution.execute(request, body);
			logger.info("Código de status del response:" +response.getStatusCode());
			
			HttpStatus httpCode = response.getStatusCode();
			
			 switch (httpCode) {
	            case OK:case BAD_REQUEST:case UNAUTHORIZED:case FORBIDDEN:case CONFLICT:case CREATED: case NO_CONTENT:     
	                break;
	            default:
	            	throw new ServiceExceptionBBVA(httpCode + "", response.getStatusText());
	        }
			
			 /*if(response.getStatusCode()==HttpStatus.OK){
				logger.info("Paso ok respuesta:");
			}else {
				throw new ServiceExceptionBBVA(response.getStatusCode()+ "", response.getStatusText());
			}*/
			
		} catch (Exception e) {
			 if (e instanceof SocketTimeoutException) {
					logger.error("SocketTimeoutException", e);
					throw new ConnectionExceptionBBVA(e,"999","Error de conexión: ConnectionExceptionBBVA");
				}else if (e instanceof SSLException) {
					logger.error("SSLException", e);
					throw new ConnectionExceptionBBVA(e,"999","Error de conexión: SSLException");
				}else if (e instanceof ConnectException) {
					logger.error("ConnectException", e);
					throw new ConnectionExceptionBBVA(e,"999","Error de conexión: ConnectException");
				}else if(e instanceof org.apache.http.conn.ConnectTimeoutException) {
					logger.error("ConnectTimeoutException", e);
					throw new ConnectionExceptionBBVA(e,"999", "Error de conexión: ConnectTimeoutException");
				}else if (e instanceof UnknownHostException){
					logger.error("ConnectTimeoutException", e);
					throw new ConnectionExceptionBBVA(e,"999", "Error de conexión: UnknownHostException");
				}else {
					logger.error("Exception general", e);
					throw new ConnectionExceptionBBVA(e,"900", "Error de conexión: Error general al ejecutar servicio");
				}

		}
		response = traceResponse(response);
		return response;
	}
}
