package pe.bbva.aso.servicios.cliente.base.resttemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.interceptor.RestClientInterceptor;

public class ServiciosASOAutenticadoConfig {
	//final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

	@Autowired
	protected Environment env;
	
	@Bean(name = "restTemplateAutenticado")
	public RestTemplate restTemplateAutenticado() throws Exception {
		//logger.debug("restTemplateAutenticado : inicio");
		try {			
			
			//String ambiente = env.getProperty("aso.servicios.ruta.ambiente");
			
			
			Integer connectTimeOutLigero = Integer.valueOf(env.getProperty("servicio.aso.autenticado.connect.timeout.milisegundos.ligero"));
			Integer socketTimeOutLigero = Integer.valueOf(env.getProperty("servicio.aso.autenticado.socket.timeout.milisegundos.ligero"));
			String certificado = env.getProperty("servidor.certificado.digital.aso.keystore.path");
			String claveCertificado = env.getProperty("servidor.certificado.digital.aso.keystore.password");
			
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			final FileInputStream trustStore = new FileInputStream(new File(certificado));
			keyStore.load(trustStore, claveCertificado.toCharArray());
			trustStore.close();
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(keyStore);
			TrustManager[] trustManagers = tmf.getTrustManagers();
			SSLContext ctx = SSLContext.getInstance("TLS");
			ctx.init(null, trustManagers, null);
			SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(ctx);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
			clientHttpRequestFactory.setReadTimeout(connectTimeOutLigero);
			clientHttpRequestFactory.setConnectTimeout(socketTimeOutLigero);
			clientHttpRequestFactory.setHttpClient(httpClient);			

			CustomRestTemplate restTemplate = new CustomRestTemplate(clientHttpRequestFactory);
			List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
			interceptors.add(new RestClientInterceptor());
			restTemplate.setInterceptors(interceptors);
			restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("iso-8859-1")));
			
			
		
			String conProxy = env.getProperty("aso.servicios.proxy"); 
			
	        if(conProxy.equals("SI")) {
	        	
	        	String proxyServer = env.getProperty("app.proxy.servidor");
				Integer proxyPuerto = Integer.parseInt(env.getProperty("app.proxy.puerto"));
				String proxyUser = env.getProperty("app.proxy.user");
				String proxyPassword = env.getProperty("app.proxy.password");
				
				final CredentialsProvider credsProvider = new BasicCredentialsProvider();
		        credsProvider.setCredentials(new AuthScope(proxyServer,proxyPuerto), new UsernamePasswordCredentials(proxyUser, proxyPassword));
		        final HttpClientBuilder clientBuilder = HttpClientBuilder.create();
		        clientBuilder.useSystemProperties();
		        clientBuilder.setProxy(new HttpHost(proxyServer,proxyPuerto));
		        clientBuilder.setDefaultCredentialsProvider(credsProvider);
		        final CloseableHttpClient client = clientBuilder.build();
		        final HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		        factory.setHttpClient(client);
		        
				restTemplate.setRequestFactory(factory);				
	       }			
			
			//Sobre escribir el metodo ErrorHandler
	        restTemplate.setErrorHandler(new DefaultResponseErrorHandler(){
			    protected boolean hasError(HttpStatus statusCode) {
			        return false;
			}});
			
			//logger.debug("restTemplateAutenticado : fin");
			return restTemplate;
		} catch (KeyStoreException e) {
			//logger.error("KeyStoreException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (NoSuchAlgorithmException e) {
			//logger.error("NoSuchAlgorithmException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (CertificateException e) {
			//logger.error("CertificateException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (FileNotFoundException e) {
			//logger.error("FileNotFoundException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (IOException e) {
			//logger.error("IOException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (KeyManagementException e) {
			//logger.error("KeyManagementException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (Exception e) {
			//logger.error("Exception", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));			
		}
	}
	
	@Bean(name = "restTemplateAutenticadoNoProxy")
	public RestTemplate restTemplateAutenticadoNoProxy() throws Exception {
		//logger.debug("restTemplateAutenticado : inicio");
		try {			
			
			//String ambiente = env.getProperty("aso.servicios.ruta.ambiente");
			
			
			Integer connectTimeOutLigero = Integer.valueOf(env.getProperty("servicio.aso.autenticado.connect.timeout.milisegundos.ligero"));
			Integer socketTimeOutLigero = Integer.valueOf(env.getProperty("servicio.aso.autenticado.socket.timeout.milisegundos.ligero"));
			String certificado = env.getProperty("servidor.certificado.digital.aso.keystore.path");
			String claveCertificado = env.getProperty("servidor.certificado.digital.aso.keystore.password");
			
			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
			final FileInputStream trustStore = new FileInputStream(new File(certificado));
			keyStore.load(trustStore, claveCertificado.toCharArray());
			trustStore.close();
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			tmf.init(keyStore);
			TrustManager[] trustManagers = tmf.getTrustManagers();
			SSLContext ctx = SSLContext.getInstance("TLS");
			ctx.init(null, trustManagers, null);
			SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(ctx);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
			clientHttpRequestFactory.setReadTimeout(connectTimeOutLigero);
			clientHttpRequestFactory.setConnectTimeout(socketTimeOutLigero);
			clientHttpRequestFactory.setHttpClient(httpClient);			

			CustomRestTemplate restTemplate = new CustomRestTemplate(clientHttpRequestFactory);
			List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
			interceptors.add(new RestClientInterceptor());
			restTemplate.setInterceptors(interceptors);
			restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("iso-8859-1")));
						
			//Sobre escribir el metodo ErrorHandler
			restTemplate.setErrorHandler(new DefaultResponseErrorHandler(){
			    protected boolean hasError(HttpStatus statusCode) {
			        return false;
			}});
			
			//logger.debug("restTemplateAutenticado : fin");
			return restTemplate;
		} catch (KeyStoreException e) {
			//logger.error("KeyStoreException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (NoSuchAlgorithmException e) {
			//logger.error("NoSuchAlgorithmException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (CertificateException e) {
			//logger.error("CertificateException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (FileNotFoundException e) {
			//logger.error("FileNotFoundException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (IOException e) {
			//logger.error("IOException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (KeyManagementException e) {
			//logger.error("KeyManagementException", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));
		} catch (Exception e) {
			//logger.error("Exception", e);
			e.printStackTrace();
			throw new ServiceExceptionBBVA(e, env.getProperty("ofdigital.respuesta.error.general.codigo"));			
		}
	}
}