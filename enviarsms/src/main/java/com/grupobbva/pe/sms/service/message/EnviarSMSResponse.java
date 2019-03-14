package com.grupobbva.pe.sms.service.message;

import com.grupobbva.pe.sms.ent.body.enviar.EnviarResponse;

public class EnviarSMSResponse
{
  private EnviarResponse refResponseBody;
  
  public EnviarSMSResponse() {}
  
  public EnviarSMSResponse(EnviarResponse refResponseBody)
  {
    this.refResponseBody = refResponseBody;
  }
  
  public EnviarResponse getRefResponseBody()
  {
    return this.refResponseBody;
  }
  
  public void setRefResponseBody(EnviarResponse refResponseBody)
  {
    this.refResponseBody = refResponseBody;
  }
}
