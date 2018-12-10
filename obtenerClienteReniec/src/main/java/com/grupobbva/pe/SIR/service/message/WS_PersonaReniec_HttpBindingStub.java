/**
 * WS_PersonaReniec_HttpBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class WS_PersonaReniec_HttpBindingStub extends org.apache.axis.client.Stub implements com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaPorNombres");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresRequest"), com.grupobbva.pe.SIR.service.message.ConsultaPorNombresRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresResponse"));
        oper.setReturnClass(com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultaPorDNI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIRequest"), com.grupobbva.pe.SIR.service.message.ConsultaPorDNIRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIResponse"));
        oper.setReturnClass(com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public WS_PersonaReniec_HttpBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WS_PersonaReniec_HttpBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WS_PersonaReniec_HttpBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "ConsultaPorDNIRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "ConsultaPorDNIResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosDNI");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDNI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosDomicilio");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosDomicilio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosNacimiento");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosNacimiento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "DatosPersona");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.DatosPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDatos");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDatos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaDNI");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaDNI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaImagenes");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorDNI.RespuestaImagenes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ConsultaPorNombresRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ConsultaPorNombresResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "DatosPersona");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ListaDatosPersona");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.body.consultaPorNombres.DatosPersona[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "DatosPersona");
            qName2 = new javax.xml.namespace.QName("", "datosPersona");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "RequestHeader");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.header.RequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "ResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.ents.header.ResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.service.message.ConsultaPorDNIRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresRequest");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.service.message.ConsultaPorNombresRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresResponse");
            cachedSerQNames.add(qName);
            cls = com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse consultaPorNombres(com.grupobbva.pe.SIR.service.message.ConsultaPorNombresRequest consultaPorNombresRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://pe.grupobbva.com/SIR/service/message");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaPorNombres"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaPorNombresRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.grupobbva.pe.SIR.service.message.ConsultaPorNombresResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse consultaPorDNI(com.grupobbva.pe.SIR.service.message.ConsultaPorDNIRequest consultaPorDNIRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://pe.grupobbva.com/SIR/service/message");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultaPorDNI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {consultaPorDNIRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.grupobbva.pe.SIR.service.message.ConsultaPorDNIResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
