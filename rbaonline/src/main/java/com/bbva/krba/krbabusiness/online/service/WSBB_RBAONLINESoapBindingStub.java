/**
 * WSBB_RBAONLINESoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bbva.krba.krbabusiness.online.service;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

public class WSBB_RBAONLINESoapBindingStub extends org.apache.axis.client.Stub implements com.bbva.krba.krbabusiness.online.service.OnlineService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }
    
    public URL getcachedEndpoint() {
    	return super.cachedEndpoint;
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConsultaOnline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "entradaOnlineDTO"), com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "salidaOnlineDTO"));
        oper.setReturnClass(com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://bbva.com/spring/gce", "errorAplicacion"),
                      "com.bbva.spring.gce.ErrorAplicacion",
                      new javax.xml.namespace.QName("http://bbva.com/spring/gce", "errorAplicacion"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public WSBB_RBAONLINESoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSBB_RBAONLINESoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSBB_RBAONLINESoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://bbva.com/spring/gce", "errorAplicacion");
            cachedSerQNames.add(qName);
            cls = com.bbva.spring.gce.ErrorAplicacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://bbva.com/spring/gce", "Metainformacion");
            cachedSerQNames.add(qName);
            cls = com.bbva.spring.gce.Propiedad[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://bbva.com/spring/gce", "Propiedad");
            qName2 = new javax.xml.namespace.QName("", "propiedad");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://bbva.com/spring/gce", "Propiedad");
            cachedSerQNames.add(qName);
            cls = com.bbva.spring.gce.Propiedad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "codigoError");
            cachedSerQNames.add(qName);
            cls = com.bbva.krba.krbabusiness.online.service.CodigoError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "documentosOnlineDTO");
            cachedSerQNames.add(qName);
            cls = com.bbva.krba.krbabusiness.online.service.DocumentosOnlineDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "entradaOnlineDTO");
            cachedSerQNames.add(qName);
            cls = com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "salidaOnlineDTO");
            cachedSerQNames.add(qName);
            cls = com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "severidad");
            cachedSerQNames.add(qName);
            cls = com.bbva.krba.krbabusiness.online.service.Severidad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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
            	//Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("118.180.54.170", 8080));
            	//super.cachedEndpoint.openConnection(proxy);
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

    public com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO getConsultaOnline(com.bbva.krba.krbabusiness.online.service.EntradaOnlineDTO arg0) throws java.rmi.RemoteException, com.bbva.spring.gce.ErrorAplicacion {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        //_call.setProperty("http.proxyHost", "118.180.54.170");
        //_call.setProperty("http.proxyPort", "8080");
        _call.setOperationName(new javax.xml.namespace.QName("http://service.online.krbabusiness.krba.bbva.com/", "getConsultaOnline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO) org.apache.axis.utils.JavaUtils.convert(_resp, com.bbva.krba.krbabusiness.online.service.SalidaOnlineDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bbva.spring.gce.ErrorAplicacion) {
              throw (com.bbva.spring.gce.ErrorAplicacion) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
