package pe.bbva.aso.servicios.session;

import java.util.HashMap;

public class SessionASO {
	public static java.util.HashMap<String, Object> session = initialized();
	
	private static HashMap<String, Object> initialized() {
		return new HashMap<String, Object>();
	}
	 
	 public static void clear() {
		 SessionASO.session.clear();
	 }
}
