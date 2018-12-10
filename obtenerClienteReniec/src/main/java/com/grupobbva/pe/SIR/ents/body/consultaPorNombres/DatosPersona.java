/**
 * DatosPersona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.grupobbva.pe.SIR.ents.body.consultaPorNombres;

public class DatosPersona  implements java.io.Serializable {
    private java.lang.String numeroDNIConsultado;

    private java.lang.String caracterVerificacion;

    private java.lang.String tipoFichaRegistral;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String preNombres;

    private java.lang.String indDatos;

    private java.lang.String indImagen;

    public DatosPersona() {
    }

    public DatosPersona(
           java.lang.String numeroDNIConsultado,
           java.lang.String caracterVerificacion,
           java.lang.String tipoFichaRegistral,
           java.lang.String apellidoPaterno,
           java.lang.String apellidoMaterno,
           java.lang.String preNombres,
           java.lang.String indDatos,
           java.lang.String indImagen) {
           this.numeroDNIConsultado = numeroDNIConsultado;
           this.caracterVerificacion = caracterVerificacion;
           this.tipoFichaRegistral = tipoFichaRegistral;
           this.apellidoPaterno = apellidoPaterno;
           this.apellidoMaterno = apellidoMaterno;
           this.preNombres = preNombres;
           this.indDatos = indDatos;
           this.indImagen = indImagen;
    }


    /**
     * Gets the numeroDNIConsultado value for this DatosPersona.
     * 
     * @return numeroDNIConsultado
     */
    public java.lang.String getNumeroDNIConsultado() {
        return numeroDNIConsultado;
    }


    /**
     * Sets the numeroDNIConsultado value for this DatosPersona.
     * 
     * @param numeroDNIConsultado
     */
    public void setNumeroDNIConsultado(java.lang.String numeroDNIConsultado) {
        this.numeroDNIConsultado = numeroDNIConsultado;
    }


    /**
     * Gets the caracterVerificacion value for this DatosPersona.
     * 
     * @return caracterVerificacion
     */
    public java.lang.String getCaracterVerificacion() {
        return caracterVerificacion;
    }


    /**
     * Sets the caracterVerificacion value for this DatosPersona.
     * 
     * @param caracterVerificacion
     */
    public void setCaracterVerificacion(java.lang.String caracterVerificacion) {
        this.caracterVerificacion = caracterVerificacion;
    }


    /**
     * Gets the tipoFichaRegistral value for this DatosPersona.
     * 
     * @return tipoFichaRegistral
     */
    public java.lang.String getTipoFichaRegistral() {
        return tipoFichaRegistral;
    }


    /**
     * Sets the tipoFichaRegistral value for this DatosPersona.
     * 
     * @param tipoFichaRegistral
     */
    public void setTipoFichaRegistral(java.lang.String tipoFichaRegistral) {
        this.tipoFichaRegistral = tipoFichaRegistral;
    }


    /**
     * Gets the apellidoPaterno value for this DatosPersona.
     * 
     * @return apellidoPaterno
     */
    public java.lang.String getApellidoPaterno() {
        return apellidoPaterno;
    }


    /**
     * Sets the apellidoPaterno value for this DatosPersona.
     * 
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


    /**
     * Gets the apellidoMaterno value for this DatosPersona.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this DatosPersona.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the preNombres value for this DatosPersona.
     * 
     * @return preNombres
     */
    public java.lang.String getPreNombres() {
        return preNombres;
    }


    /**
     * Sets the preNombres value for this DatosPersona.
     * 
     * @param preNombres
     */
    public void setPreNombres(java.lang.String preNombres) {
        this.preNombres = preNombres;
    }


    /**
     * Gets the indDatos value for this DatosPersona.
     * 
     * @return indDatos
     */
    public java.lang.String getIndDatos() {
        return indDatos;
    }


    /**
     * Sets the indDatos value for this DatosPersona.
     * 
     * @param indDatos
     */
    public void setIndDatos(java.lang.String indDatos) {
        this.indDatos = indDatos;
    }


    /**
     * Gets the indImagen value for this DatosPersona.
     * 
     * @return indImagen
     */
    public java.lang.String getIndImagen() {
        return indImagen;
    }


    /**
     * Sets the indImagen value for this DatosPersona.
     * 
     * @param indImagen
     */
    public void setIndImagen(java.lang.String indImagen) {
        this.indImagen = indImagen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersona)) return false;
        DatosPersona other = (DatosPersona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroDNIConsultado==null && other.getNumeroDNIConsultado()==null) || 
             (this.numeroDNIConsultado!=null &&
              this.numeroDNIConsultado.equals(other.getNumeroDNIConsultado()))) &&
            ((this.caracterVerificacion==null && other.getCaracterVerificacion()==null) || 
             (this.caracterVerificacion!=null &&
              this.caracterVerificacion.equals(other.getCaracterVerificacion()))) &&
            ((this.tipoFichaRegistral==null && other.getTipoFichaRegistral()==null) || 
             (this.tipoFichaRegistral!=null &&
              this.tipoFichaRegistral.equals(other.getTipoFichaRegistral()))) &&
            ((this.apellidoPaterno==null && other.getApellidoPaterno()==null) || 
             (this.apellidoPaterno!=null &&
              this.apellidoPaterno.equals(other.getApellidoPaterno()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.preNombres==null && other.getPreNombres()==null) || 
             (this.preNombres!=null &&
              this.preNombres.equals(other.getPreNombres()))) &&
            ((this.indDatos==null && other.getIndDatos()==null) || 
             (this.indDatos!=null &&
              this.indDatos.equals(other.getIndDatos()))) &&
            ((this.indImagen==null && other.getIndImagen()==null) || 
             (this.indImagen!=null &&
              this.indImagen.equals(other.getIndImagen())));
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
        if (getNumeroDNIConsultado() != null) {
            _hashCode += getNumeroDNIConsultado().hashCode();
        }
        if (getCaracterVerificacion() != null) {
            _hashCode += getCaracterVerificacion().hashCode();
        }
        if (getTipoFichaRegistral() != null) {
            _hashCode += getTipoFichaRegistral().hashCode();
        }
        if (getApellidoPaterno() != null) {
            _hashCode += getApellidoPaterno().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getPreNombres() != null) {
            _hashCode += getPreNombres().hashCode();
        }
        if (getIndDatos() != null) {
            _hashCode += getIndDatos().hashCode();
        }
        if (getIndImagen() != null) {
            _hashCode += getIndImagen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pe.grupobbva.com/SIR/ents/body/consultaPorNombres", "DatosPersona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDNIConsultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDNIConsultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caracterVerificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caracterVerificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFichaRegistral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoFichaRegistral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellidoPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preNombres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preNombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indDatos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indDatos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indImagen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indImagen"));
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
