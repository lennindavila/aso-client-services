package pe.bbva.encriptacion;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.bbva.sl.ar.core.libmcrypt.HostData;
import com.bbva.sl.ar.core.libmcrypt.LibMCrypt;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.java.libmcrypt.impl.LibMCryptJava;
import com.bbva.util.PinBlockEncryptionUtil;

public class Encrypt {
	public String encryptar(String pan, String pinNuevo) throws LibMCryptException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
		// String PAN = "4919119021974340";
		// String PIN_REAL = "1234";

		String pinBlockGenerate;
		HostData hostData = null;

		try {
			pinBlockGenerate = PinBlockEncryptionUtil.encryptPinBlock(pan, pinNuevo);
			

			LibMCrypt lib = new LibMCryptJava();
			
			String pinBlockClear = pinBlockGenerate.toUpperCase(); // ="041687E6FDDABD79";

			// System.out.println("PINBLOCK HEX: " + pinBlockClear.toUpperCase());
			//System.out.println("PINBLOCK HEX: " + pinBlockGenerate.toUpperCase());

			// String pinBlockHEX = "0412AC89ABCDEF67"; //corresponde al PIN :1234

			hostData = lib.encryptHostData(pinBlockClear, null, "rsa");

			//System.out.println("pin block clear encrypted:");
			//System.out.println("host data: " + hostData.getHostData());
			return hostData.getHostData();
		} catch (InvalidKeyException e) {			
			throw e;
		} catch (NoSuchAlgorithmException e) {			
			throw e;
		} catch (NoSuchPaddingException e) {			
			throw e;
		} catch (IllegalBlockSizeException e) {			
			throw e;
		} catch (BadPaddingException e) {			
			throw e;
		} catch (com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException e) {
			throw e;
		}		
	}
}
