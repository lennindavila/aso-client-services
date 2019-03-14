package pe.bbva.servicios.biometricclient.config;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.JDialog;

import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ExceptionUtil;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.servicios.biometricclient.dto.AuditRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;
import pe.bbva.servicios.biometricclient.dto.Parametros;
import pe.bbva.servicios.biometricclient.dto.Parametros.Parametro;

public class Start {
	final static Logger logger = (Logger) LoggerFactory.getLogger(Start.class);
	
	public static void main(String[] args) {
		int cantidad = Integer.parseInt(args[0]);
		int segundos = Integer.parseInt(args[1]);
		
		logger.info("Parametros: cantidad " + cantidad);
		logger.info("Parametros: segundos " + segundos);
		
		for(int i=0;i<cantidad;i++) {			
			AuthenticateResponse response = new Start().ejecutar();
			logger.info("Número de Ejecución...: " + i);
			if(response==null) {
				logger.info("Se ha ejecutado correctamente la cantidad: " + i);
				logger.info("Se ha cayo en la ejecucion: " + (i + 1));
				return;
			}
			Start.pausar(segundos);		
		}
	}
		
	private AuthenticateResponse biometrico(String tipo_doc,String documentNumber)throws Exception {
			BiometricClientASOConfig cliente = new BiometricClientASOConfig();

			AuthenticateRequest request = new AuthenticateRequest();
			AuditRequest audit_request = new AuditRequest();
			audit_request.setIdTransaccion(new Date().getTime() + "");
			audit_request.setIpAplicacion(getLocalHostLANAddress().getHostAddress());
			audit_request.setMacAddressDispositivo(getMacAddress());

			final String CODIGO_CANAL = "OFIDIG";
			final String TIPO_OPERACION = "AUTENTICACION";

			audit_request.setCanal(CODIGO_CANAL);
			audit_request.setTipoOperacion(TIPO_OPERACION);

			Parametros parametros = new Parametros();
			
			Parametro param_dni = new Parametro();
			param_dni.setNombre("tipo_doc");//"dni"
			param_dni.setValor(tipo_doc);//"21564655"
			parametros.getParametro().add(param_dni);
			
			Parametro param_num_doc = new Parametro();
			param_num_doc.setNombre("num_doc");//"dni"
			param_num_doc.setValor(documentNumber);//"21564655"
			parametros.getParametro().add(param_num_doc);
	
			Parametro param_usuario = new Parametro();
			param_usuario.setNombre("usuario");
			param_usuario.setValor("ADMIN");
			parametros.getParametro().add(param_usuario);
			
			Parametro param_password = new Parametro();
			param_password.setNombre("password");
			param_password.setValor("ADMIN");
			parametros.getParametro().add(param_password);

			request.setListaParametrosRequest(parametros);
			request.setAuditRequest(audit_request);
			
			Gson gson = new Gson();
			
			logger.info("request: " + gson.toJson(request));			
			AuthenticateResponse response = cliente.obtenerBiometrico(request);
			logger.info("response: " + gson.toJson(response));
			return response;			
	}	
	
	public AuthenticateResponse ejecutar() {
		logger.info("TestBiometricClientASOConfig probar - inicio: ");
		AuthenticateResponse response = null;
		
		try {
			Gson gson = new Gson();
			response = biometrico("dni", "42713668");			
			logger.info("response biometrico: " + gson.toJson(response));
			return response;
		} catch (ServiceExceptionBBVA e) {
			if(e instanceof ValidacionExceptionBBVA) {
				ValidacionExceptionBBVA ev = (ValidacionExceptionBBVA) e;
				logger.error("Handling validation exception : " + ExceptionUtil.getStackTrace(ev));
				logger.error("Handling validation exception getCode : " + ev.getErrores().getFieldError().getCode());
				logger.error("Handling validation exception getField: " + ev.getErrores().getFieldError().getField());
				logger.error("Handling validation exception : " + ev.getErrores().getFieldError().getField() + " " + ev.getErrores().getFieldError().getCode());
			}else {
				logger.error("Handling validation exception : " + ExceptionUtil.getStackTrace(e));
			}		
			logger.error(ExceptionUtil.getStackTrace(e));
		} catch (Exception e) {
			logger.error(ExceptionUtil.getStackTrace(e));
		}
		return null;
	}
	
	public static InetAddress getLocalHostLANAddress() throws UnknownHostException {
		try {
			InetAddress IP = InetAddress.getLocalHost();
			return IP;
		}catch (Exception e) {
			UnknownHostException unknownHostException = new UnknownHostException("Failed to determine LAN address: " + e);
			unknownHostException.initCause(e);
			throw unknownHostException;
		}
	}
	
	public static String getMacAddress() {
		String macAddress = null;
		
		try {
			InetAddress ipAddress = InetAddress.getLocalHost();
			NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ipAddress);
			byte[] macAddressBytes = networkInterface.getHardwareAddress();
			StringBuilder macAddressBuilder = new StringBuilder();

			for (int macAddressByteIndex = 0; macAddressByteIndex < macAddressBytes.length; macAddressByteIndex++) {
				String macAddressHexByte = String.format("%02X", macAddressBytes[macAddressByteIndex]);
				macAddressBuilder.append(macAddressHexByte);

				if (macAddressByteIndex != macAddressBytes.length - 1) {
					macAddressBuilder.append(":");
				}
			}
			
			macAddress = macAddressBuilder.toString();
		}
		catch (Exception e) {			
			logger.error(ExceptionUtil.getStackTrace(e));
		}
		return macAddress;
	}
	
	public static void pausar(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			logger.error(ExceptionUtil.getStackTrace(e));
			Thread.currentThread().interrupt();			
		}
	}
}
