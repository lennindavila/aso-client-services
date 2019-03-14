package com.grupobbva.pe.sms.service.message;

import com.grupobbva.pe.sms.ent.body.enviar.EnviarRequest;

public class EnviarSMSRequest
{
  private EnviarRequest refRequestBody;
  
  public EnviarSMSRequest() {}
  
  public EnviarSMSRequest(EnviarRequest refRequestBody)
  {
    this.refRequestBody = refRequestBody;
  }
  
  public EnviarRequest getRefRequestBody()
  {
    return this.refRequestBody;
  }
  
  public void setRefRequestBody(EnviarRequest refRequestBody)
  {
    this.refRequestBody = refRequestBody;
  }
}
