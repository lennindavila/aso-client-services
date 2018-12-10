/**
 * ConsultaPorDNIResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.service.message;

public class ConsultaPorDNIResponse  implements java.io.Serializable {
    private com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader;

    private com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIResponse refConsultaPorDNIResponse;

    public ConsultaPorDNIResponse() {
    }

    public ConsultaPorDNIResponse(
           com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader,
           com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIResponse refConsultaPorDNIResponse) {
           this.refResponseHeader = refResponseHeader;
           this.refConsultaPorDNIResponse = refConsultaPorDNIResponse;
    }


    /**
     * Gets the refResponseHeader value for this ConsultaPorDNIResponse.
     * 
     * @return refResponseHeader
     */
    public com.grupobbva.pe.SIR.ents.header.ResponseHeader getRefResponseHeader() {
        return refResponseHeader;
    }


    /**
     * Sets the refResponseHeader value for this ConsultaPorDNIResponse.
     * 
     * @param refResponseHeader
     */
    public void setRefResponseHeader(com.grupobbva.pe.SIR.ents.header.ResponseHeader refResponseHeader) {
        this.refResponseHeader = refResponseHeader;
    }


    /**
     * Gets the refConsultaPorDNIResponse value for this ConsultaPorDNIResponse.
     * 
     * @return refConsultaPorDNIResponse
     */
    public com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIResponse getRefConsultaPorDNIResponse() {
        return refConsultaPorDNIResponse;
    }


    /**
     * Sets the refConsultaPorDNIResponse value for this ConsultaPorDNIResponse.
     * 
     * @param refConsultaPorDNIResponse
     */
    public void setRefConsultaPorDNIResponse(com.grupobbva.pe.SIR.ents.body.consultaPorDNI.ConsultaPorDNIResponse refConsultaPorDNIResponse) {
        this.refConsultaPorDNIResponse = refConsultaPorDNIResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaPorDNIResponse)) return false;
        ConsultaPorDNIResponse other = (ConsultaPorDNIResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refResponseHeader==null && other.getRefResponseHeader()==null) || 
             (this.refResponseHeader!=null &&
              this.refResponseHeader.equals(other.getRefResponseHeader()))) &&
            ((this.refConsultaPorDNIResponse==null && other.getRefConsultaPorDNIResponse()==null) || 
             (this.refConsultaPorDNIResponse!=null &&
              this.refConsultaPorDNIResponse.equals(other.getRefConsultaPorDNIResponse())));
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
        if (getRefResponseHeader() != null) {
            _hashCode += getRefResponseHeader().hashCode();
        }
        if (getRefConsultaPorDNIResponse() != null) {
            _hashCode += getRefConsultaPorDNIResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaPorDNIResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/service/message", "consultaPorDNIResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refResponseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/header", "ResponseHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refConsultaPorDNIResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refConsultaPorDNIResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "ConsultaPorDNIResponse"));
        elemField.setMinOccurs(0);
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
