/**
 * EnviarSMSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.sms.service.message;

public class EnviarSMSServiceLocator extends org.apache.axis.client.Service implements com.grupobbva.pe.sms.service.message.EnviarSMSService {

    public EnviarSMSServiceLocator() {
    }


    public EnviarSMSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnviarSMSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnviarSMS
    private java.lang.String EnviarSMS_address = "http://118.180.14.20:7851/BBVASMS/services/EnviarSMS";  //Produccion
    //private java.lang.String EnviarSMS_address = "http://118.180.36.26:7851/BBVASMS/services/EnviarSMS"; //Desarrollo
    

    public java.lang.String getEnviarSMSAddress() {
        return EnviarSMS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnviarSMSWSDDServiceName = "EnviarSMS";

    public java.lang.String getEnviarSMSWSDDServiceName() {
        return EnviarSMSWSDDServiceName;
    }

    public void setEnviarSMSWSDDServiceName(java.lang.String name) {
        EnviarSMSWSDDServiceName = name;
    }

    public com.grupobbva.pe.sms.service.message.EnviarSMS getEnviarSMS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnviarSMS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnviarSMS(endpoint);
    }

    public com.grupobbva.pe.sms.service.message.EnviarSMS getEnviarSMS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.grupobbva.pe.sms.service.message.EnviarSMSSoapBindingStub _stub = new com.grupobbva.pe.sms.service.message.EnviarSMSSoapBindingStub(portAddress, this);
            _stub.setPortName(getEnviarSMSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnviarSMSEndpointAddress(java.lang.String address) {
        EnviarSMS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.grupobbva.pe.sms.service.message.EnviarSMS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.grupobbva.pe.sms.service.message.EnviarSMSSoapBindingStub _stub = new com.grupobbva.pe.sms.service.message.EnviarSMSSoapBindingStub(new java.net.URL(EnviarSMS_address), this);
                _stub.setPortName(getEnviarSMSWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EnviarSMS".equals(inputPortName)) {
            return getEnviarSMS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sms.pe.grupobbva.com", "EnviarSMSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sms.pe.grupobbva.com", "EnviarSMS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnviarSMS".equals(portName)) {
            setEnviarSMSEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
