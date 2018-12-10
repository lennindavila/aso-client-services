/**
 * 
 */
/**
 * @author Lennin
 *
 */
package pe.bbva.encriptacion.test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.junit.Test;

import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;

import pe.bbva.encriptacion.Encrypt;

public class EncryptTest {

	/*
	 * Antes es necesario registrar las dependencias en el maven, para ello ir a la ruta 
	 * donde descargaste el proyecto
	 * ..\encriptacion\librerias
	 * y ejecutar el archivo install.bat
	 * */
	@Test
	public void probar() {
		String valor = "";
		try {
			valor = new Encrypt().encryptar("4919119021974340","1234");
		} catch (InvalidKeyException e) {			
			e.printStackTrace();
		} catch (BadPaddingException e) {			
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {			
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {			
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		} catch (LibMCryptException e) {			
			e.printStackTrace();
		}
		System.out.println("Valor Host Encriptado: " + valor); 
	}
}
