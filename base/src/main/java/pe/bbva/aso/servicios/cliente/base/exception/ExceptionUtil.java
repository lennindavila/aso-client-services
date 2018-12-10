package pe.bbva.aso.servicios.cliente.base.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {

	public static String getStackTrace(Exception e) {
		StringWriter stack = new StringWriter();
		e.printStackTrace(new PrintWriter(stack));
		return stack.toString();
	}
	
	public static String getStackTrace(Throwable t) {
		StringWriter stack = new StringWriter();
		t.printStackTrace(new PrintWriter(stack));
		return stack.toString();
	}
}
