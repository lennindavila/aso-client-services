package pe.bbva.aso.servicios.cliente.base.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import pe.bbva.aso.servicios.cliente.base.bean.ErrorBean;
import pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA;
import pe.bbva.aso.servicios.cliente.base.exception.ValidacionExceptionBBVA;

public class ErrorController {

	protected ErrorBean mapeoErrores(Exception e) {
		ErrorBean errorBean = new ErrorBean();
		if (e instanceof pe.bbva.aso.servicios.cliente.base.exception.ConnectionExceptionBBVA) {
			ConnectionExceptionBBVA error = (ConnectionExceptionBBVA) e;
			errorBean.setCodigoError(error.getCodigo());
			errorBean.setMensajeError(error.getMessage());
		} else if (e instanceof ValidacionExceptionBBVA) {
			ValidacionExceptionBBVA error = (ValidacionExceptionBBVA) e;
			errorBean.setCodigoError(error.getCodigo());
			errorBean.setMensajeError(error.getMessage());
		} else {
			errorBean.setCodigoError("900");
			errorBean.setMensajeError("Error general");
		}
		return errorBean;
	}

	protected String getStackTrace(Exception e) {
		StringWriter stack = new StringWriter();
		e.printStackTrace(new PrintWriter(stack));
		return stack.toString();
	}

}
