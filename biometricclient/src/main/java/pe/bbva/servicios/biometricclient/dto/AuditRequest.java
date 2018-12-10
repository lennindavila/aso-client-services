package pe.bbva.servicios.biometricclient.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuditRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuditRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTransaccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuarioAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="macAddressDispositivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditRequest", propOrder = {
    "idTransaccion",
    "ipAplicacion",
    "nombreAplicacion",
    "usuarioAplicacion",
    "macAddressDispositivo",
    "canal",
    "tipoOperacion"
})
public class AuditRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String idTransaccion;
    @XmlElement(required = true)
    protected String ipAplicacion;
    @XmlElement(required = true)
    protected String nombreAplicacion;
    @XmlElement(required = true)
    protected String usuarioAplicacion;
    @XmlElement(required = true)
    protected String macAddressDispositivo;
    @XmlElement(required = true)
    protected String canal;
    @XmlElement(required = true)
    protected String tipoOperacion;

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaccion(String value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAplicacion() {
        return ipAplicacion;
    }

    /**
     * Define el valor de la propiedad ipAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAplicacion(String value) {
        this.ipAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    /**
     * Define el valor de la propiedad nombreAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAplicacion(String value) {
        this.nombreAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAplicacion() {
        return usuarioAplicacion;
    }

    /**
     * Define el valor de la propiedad usuarioAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAplicacion(String value) {
        this.usuarioAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad macAddressDispositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddressDispositivo() {
        return macAddressDispositivo;
    }

    /**
     * Define el valor de la propiedad macAddressDispositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddressDispositivo(String value) {
        this.macAddressDispositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

}
