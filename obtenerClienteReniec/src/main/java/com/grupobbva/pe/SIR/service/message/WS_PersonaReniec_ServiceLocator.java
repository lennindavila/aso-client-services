/**
 * WS_PersonaReniec_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class WS_PersonaReniec_ServiceLocator extends org.apache.axis.client.Service implements com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_Service {

    public WS_PersonaReniec_ServiceLocator() {
    }


    public WS_PersonaReniec_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_PersonaReniec_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS_PersonaReniec
    private java.lang.String WS_PersonaReniec_address = "http://118.180.14.18:80/WSIntegracionRENIEC/services/WS_PersonaReniec";

    public java.lang.String getWS_PersonaReniecAddress() {
        return WS_PersonaReniec_address;
    }
    
    public java.lang.String setWS_PersonaReniecAddress() {
        return WS_PersonaReniec_address;
    }    
    
    public void setWS_PersonaReniecAddress(String WS_PersonaReniec_address) {
        this.WS_PersonaReniec_address = WS_PersonaReniec_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WS_PersonaReniecWSDDServiceName = "WS_PersonaReniec";

    public java.lang.String getWS_PersonaReniecWSDDServiceName() {
        return WS_PersonaReniecWSDDServiceName;
    }

    public void setWS_PersonaReniecWSDDServiceName(java.lang.String name) {
        WS_PersonaReniecWSDDServiceName = name;
    }

    public com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType getWS_PersonaReniec() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_PersonaReniec_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS_PersonaReniec(endpoint);
    }

    public com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType getWS_PersonaReniec(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_HttpBindingStub _stub = new com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_HttpBindingStub(portAddress, this);
            _stub.setPortName(getWS_PersonaReniecWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWS_PersonaReniecEndpointAddress(java.lang.String address) {
        WS_PersonaReniec_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_HttpBindingStub _stub = new com.grupobbva.pe.SIR.service.message.WS_PersonaReniec_HttpBindingStub(new java.net.URL(WS_PersonaReniec_address), this);
                _stub.setPortName(getWS_PersonaReniecWSDDServiceName());
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
        if ("WS_PersonaReniec".equals(inputPortName)) {
            return getWS_PersonaReniec();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "WS_PersonaReniec");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "WS_PersonaReniec"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WS_PersonaReniec".equals(portName)) {
            setWS_PersonaReniecEndpointAddress(address);
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
