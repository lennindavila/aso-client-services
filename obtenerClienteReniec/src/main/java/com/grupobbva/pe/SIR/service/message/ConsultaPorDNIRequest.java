/**
 * ConsultaPorDNIRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class ConsultaPorDNIRequest  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest refConsultaPorDNIRequest;

    public ConsultaPorDNIRequest() {
    }

    public ConsultaPorDNIRequest(
           com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest refConsultaPorDNIRequest) {
           this.refRequestHeader = refRequestHeader;
           this.refConsultaPorDNIRequest = refConsultaPorDNIRequest;
    }


    /**
     * Gets the refRequestHeader value for this ConsultaPorDNIRequest.
     * 
     * @return refRequestHeader
     */
    public com.grupobbva.pe.SIR.ents.header.RequestHeader getRefRequestHeader() {
        return refRequestHeader;
    }


    /**
     * Sets the refRequestHeader value for this ConsultaPorDNIRequest.
     * 
     * @param refRequestHeader
     */
    public void setRefRequestHeader(com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader) {
        this.refRequestHeader = refRequestHeader;
    }


    /**
     * Gets the refConsultaPorDNIRequest value for this ConsultaPorDNIRequest.
     * 
     * @return refConsultaPorDNIRequest
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest getRefConsultaPorDNIRequest() {
        return refConsultaPorDNIRequest;
    }


    /**
     * Sets the refConsultaPorDNIRequest value for this ConsultaPorDNIRequest.
     * 
     * @param refConsultaPorDNIRequest
     */
    public void setRefConsultaPorDNIRequest(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIRequest refConsultaPorDNIRequest) {
        this.refConsultaPorDNIRequest = refConsultaPorDNIRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorDNIRequest)) return false;
        ConsultaPorDNIRequest other = (ConsultaPorDNIRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refRequestHeader==null && other.getRefRequestHeader()==null) || 
             (this.refRequestHeader!=null &&
              this.refRequestHeader.equals(other.getRefRequestHeader()))) &&
            ((this.refConsultaPorDNIRequest==null && other.getRefConsultaPorDNIRequest()==null) || 
             (this.refConsultaPorDNIRequest!=null &&
              this.refConsultaPorDNIRequest.equals(other.getRefConsultaPorDNIRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRefRequestHeader() != null) {
            _hashCode += getRefRequestHeader().hashCode();
        }
        if (getRefConsultaPorDNIRequest() != null) {
            _hashCode += getRefConsultaPorDNIRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDNIRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRequestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refRequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaPorDNIRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaPorDNIRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "ConsultaPorDNIRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
