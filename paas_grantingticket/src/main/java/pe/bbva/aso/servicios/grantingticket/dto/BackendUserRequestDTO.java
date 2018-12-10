package pe.bbva.aso.servicios.grantingticket.dto;

import java.io.Serializable;

public class BackendUserRequestDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userID;
	private String accessCode;
	private String dialogId;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getDialogId() {
		return dialogId;
	}
	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}	
}
