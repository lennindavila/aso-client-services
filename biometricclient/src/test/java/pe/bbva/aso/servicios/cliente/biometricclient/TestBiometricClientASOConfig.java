package pe.bbva.aso.servicios.cliente.biometricclient;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import ch.qos.logback.classic.Logger;
import pe.bbva.aso.servicios.cliente.base.exception.ExceptionUtil;
import pe.bbva.aso.servicios.cliente.base.exception.ServiceExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;
import pe.bbva.servicios.biometricclient.config.BiometricClientASOConfig;
import pe.bbva.servicios.biometricclient.dto.AuditRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateRequest;
import pe.bbva.servicios.biometricclient.dto.AuthenticateResponse;
import pe.bbva.servicios.biometricclient.dto.Parametros;
import pe.bbva.servicios.biometricclient.dto.Parametros.Parametro;

public class TestBiometricClientASOConfig {
	final static Logger logger = (Logger) LoggerFactory.getLogger(TestBiometricClientASOConfig.class);
	
	private AuthenticateResponse biometrico(String dni,String documentNumber)throws Exception {
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
			param_dni.setNombre(dni);//"dni"
			param_dni.setValor(documentNumber);//"21564655"
			parametros.getParametro().add(param_dni);
			
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
	
	@Test
	public void probar() {
		logger.info("TestBiometricClientASOConfig probar - inicio: ");
		AuthenticateResponse response = null;
		
		try {
			Gson gson = new Gson();
			response = biometrico("dni", "21564655");
			logger.info("response biometrico: " + gson.toJson(response));
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
}
