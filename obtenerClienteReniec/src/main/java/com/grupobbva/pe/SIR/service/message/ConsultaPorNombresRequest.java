/**
 * ConsultaPorNombresRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class ConsultaPorNombresRequest  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader;

    private com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresRequest refConsultaPorNombresRequest;

    public ConsultaPorNombresRequest() {
    }

    public ConsultaPorNombresRequest(
           com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader,
           com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresRequest refConsultaPorNombresRequest) {
           this.refRequestHeader = refRequestHeader;
           this.refConsultaPorNombresRequest = refConsultaPorNombresRequest;
    }


    /**
     * Gets the refRequestHeader value for this ConsultaPorNombresRequest.
     * 
     * @return refRequestHeader
     */
    public com.grupobbva.pe.SIR.ents.header.RequestHeader getRefRequestHeader() {
        return refRequestHeader;
    }


    /**
     * Sets the refRequestHeader value for this ConsultaPorNombresRequest.
     * 
     * @param refRequestHeader
     */
    public void setRefRequestHeader(com.grupobbva.pe.SIR.ents.header.RequestHeader refRequestHeader) {
        this.refRequestHeader = refRequestHeader;
    }


    /**
     * Gets the refConsultaPorNombresRequest value for this ConsultaPorNombresRequest.
     * 
     * @return refConsultaPorNombresRequest
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresRequest getRefConsultaPorNombresRequest() {
        return refConsultaPorNombresRequest;
    }


    /**
     * Sets the refConsultaPorNombresRequest value for this ConsultaPorNombresRequest.
     * 
     * @param refConsultaPorNombresRequest
     */
    public void setRefConsultaPorNombresRequest(com.grupobbva.pe.SIR.ents.body.consultaPorNombres.ConsultaPorNombresRequest refConsultaPorNombresRequest) {
        this.refConsultaPorNombresRequest = refConsultaPorNombresRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorNombresRequest)) return false;
        ConsultaPorNombresRequest other = (ConsultaPorNombresRequest) obj;
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
            ((this.refConsultaPorNombresRequest==null && other.getRefConsultaPorNombresRequest()==null) || 
             (this.refConsultaPorNombresRequest!=null &&
              this.refConsultaPorNombresRequest.equals(other.getRefConsultaPorNombresRequest())));
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
        if (getRefConsultaPorNombresRequest() != null) {
            _hashCode += getRefConsultaPorNombresRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorNombresRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorNombresRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRequestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refRequestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "RequestHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaPorNombresRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaPorNombresRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "ConsultaPorNombresRequest"));
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
