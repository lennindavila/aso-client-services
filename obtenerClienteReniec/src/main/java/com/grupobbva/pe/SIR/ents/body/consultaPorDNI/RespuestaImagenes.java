/**
 * RespuestaImagenes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorDNI;

public class RespuestaImagenes  implements java.io.Serializable {
    private java.lang.String longitudFoto;

    private java.lang.String longitudFirma;

    private java.lang.String foto;

    private java.lang.String firma;

    public RespuestaImagenes() {
    }

    public RespuestaImagenes(
           java.lang.String longitudFoto,
           java.lang.String longitudFirma,
           java.lang.String foto,
           java.lang.String firma) {
           this.longitudFoto = longitudFoto;
           this.longitudFirma = longitudFirma;
           this.foto = foto;
           this.firma = firma;
    }


    /**
     * Gets the longitudFoto value for this RespuestaImagenes.
     * 
     * @return longitudFoto
     */
    public java.lang.String getLongitudFoto() {
        return longitudFoto;
    }


    /**
     * Sets the longitudFoto value for this RespuestaImagenes.
     * 
     * @param longitudFoto
     */
    public void setLongitudFoto(java.lang.String longitudFoto) {
        this.longitudFoto = longitudFoto;
    }


    /**
     * Gets the longitudFirma value for this RespuestaImagenes.
     * 
     * @return longitudFirma
     */
    public java.lang.String getLongitudFirma() {
        return longitudFirma;
    }


    /**
     * Sets the longitudFirma value for this RespuestaImagenes.
     * 
     * @param longitudFirma
     */
    public void setLongitudFirma(java.lang.String longitudFirma) {
        this.longitudFirma = longitudFirma;
    }


    /**
     * Gets the foto value for this RespuestaImagenes.
     * 
     * @return foto
     */
    public java.lang.String getFoto() {
        return foto;
    }


    /**
     * Sets the foto value for this RespuestaImagenes.
     * 
     * @param foto
     */
    public void setFoto(java.lang.String foto) {
        this.foto = foto;
    }


    /**
     * Gets the firma value for this RespuestaImagenes.
     * 
     * @return firma
     */
    public java.lang.String getFirma() {
        return firma;
    }


    /**
     * Sets the firma value for this RespuestaImagenes.
     * 
     * @param firma
     */
    public void setFirma(java.lang.String firma) {
        this.firma = firma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaImagenes)) return false;
        RespuestaImagenes other = (RespuestaImagenes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.longitudFoto==null && other.getLongitudFoto()==null) || 
             (this.longitudFoto!=null &&
              this.longitudFoto.equals(other.getLongitudFoto()))) &&
            ((this.longitudFirma==null && other.getLongitudFirma()==null) || 
             (this.longitudFirma!=null &&
              this.longitudFirma.equals(other.getLongitudFirma()))) &&
            ((this.foto==null && other.getFoto()==null) || 
             (this.foto!=null &&
              this.foto.equals(other.getFoto()))) &&
            ((this.firma==null && other.getFirma()==null) || 
             (this.firma!=null &&
              this.firma.equals(other.getFirma())));
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
        if (getLongitudFoto() != null) {
            _hashCode += getLongitudFoto().hashCode();
        }
        if (getLongitudFirma() != null) {
            _hashCode += getLongitudFirma().hashCode();
        }
        if (getFoto() != null) {
            _hashCode += getFoto().hashCode();
        }
        if (getFirma() != null) {
            _hashCode += getFirma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaImagenes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorDNI", "RespuestaImagenes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudFoto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitudFoto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitudFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitudFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
