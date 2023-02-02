
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iedu complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iedu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autRVOE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelEducativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iedu", propOrder = {
    "autRVOE",
    "curp",
    "nivelEducativo",
    "nombreAlumno",
    "rfcPago"
})
public class Iedu {

    protected String autRVOE;
    @XmlElement(name = "CURP")
    protected String curp;
    protected String nivelEducativo;
    protected String nombreAlumno;
    protected String rfcPago;

    /**
     * Obtiene el valor de la propiedad autRVOE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutRVOE() {
        return autRVOE;
    }

    /**
     * Define el valor de la propiedad autRVOE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutRVOE(String value) {
        this.autRVOE = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEducativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelEducativo() {
        return nivelEducativo;
    }

    /**
     * Define el valor de la propiedad nivelEducativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelEducativo(String value) {
        this.nivelEducativo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Define el valor de la propiedad nombreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPago() {
        return rfcPago;
    }

    /**
     * Define el valor de la propiedad rfcPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPago(String value) {
        this.rfcPago = value;
    }

}
