package com.grupobbva.pe.sms.client;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.grupobbva.pe.sms.service.message.EnviarSMS;
import com.grupobbva.pe.sms.service.message.EnviarSMSServiceLocator;

import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class EnvioSMSClient {
		
	public static void main(String[] args) throws IOException {
		
		EnviarSMSServiceLocator locator = new EnviarSMSServiceLocator();
		String pais = "51";
		String operador = new String();
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("properties/enviarsms.properties");
		prop.load(file);
		
		String codOperacion = prop.getProperty("aso.servicios.cliente.enviarsms.numOperacion");
		
		String codClaro		= prop.getProperty("aso.servicios.cliente.enviarsms.codClaro");
		String codMovistar	= prop.getProperty("aso.servicios.cliente.enviarsms.codMovistar");
		String codEntel		= prop.getProperty("aso.servicios.cliente.enviarsms.codEntel");
		String codBitel		= prop.getProperty("aso.servicios.cliente.enviarsms.codBitel");
		
		String ipClaro		= prop.getProperty("aso.servicios.cliente.enviarsms.ipClaro");
		String ipMovistar	= prop.getProperty("aso.servicios.cliente.enviarsms.ipMovistar");
		String ipEntel		= prop.getProperty("aso.servicios.cliente.enviarsms.ipEntel");
		String ipBitel		= prop.getProperty("aso.servicios.cliente.enviarsms.ipBitel");
		
		int minimo 		= Integer.parseInt(prop.getProperty("aso.servicios.cliente.enviarsms.numMinimo"));
		int maximo 		= Integer.parseInt(prop.getProperty("aso.servicios.cliente.enviarsms.numMaximo"));
		
		int clave = ThreadLocalRandom.current().nextInt(minimo, maximo);
		
		String mensaje		= prop.getProperty("aso.servicios.cliente.enviarsms.mensaje");
		String claveEnvio	= String.valueOf(clave);
		String mensajeEnvio = mensaje + " " + claveEnvio;
		
		//System.out.println(prop.getProperty("aso.servicios.cliente.enviarsms.codClaro"));
		
		try {
			EnviarSMS enviarsmsService = locator.getEnviarSMS();
			
			String telefono = pais.concat(JOptionPane.showInputDialog("Ingresar el numero de celular"));
			String codOperador = JOptionPane.showInputDialog("Ingresar el operador celular");
			
			if(codClaro.equals(codOperador)) {
				operador = ipClaro;
			}else if(codMovistar.equals(codOperador)) {
				operador = ipMovistar;
			}else if(codEntel.equals(codOperador)) {
				operador = ipEntel;
			}else if(codBitel.equals(codOperador)) {
				operador = ipBitel;
			}
			
			//String ws_enviar = enviarsmsService.enviar("11111", "BBVA - Apertura tu cuenta", "51972711361", "595.claro.pe");
			String ws_enviar = enviarsmsService.enviar(codOperacion, mensajeEnvio, telefono, operador);
			
			//muestra el resultado
			JOptionPane.showMessageDialog(null, "El resultado del envio del sms es: " + ws_enviar);
			JOptionPane.showMessageDialog(null, "operacion: " + codOperacion + " - mensaje: " + mensajeEnvio + " - telefono: " + telefono + " - operador: " + operador);
			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se puede contactar con el servicio" + e.getMessage());
		}
		
	}
	
	
}
