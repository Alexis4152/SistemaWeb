
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para timbreFiscalDigital complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="timbreFiscalDigital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaTimbre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noCertificadoSAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selloCFD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selloSat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timbreFiscalDigital", propOrder = {
    "fechaTimbre",
    "noCertificadoSAT",
    "selloCFD",
    "selloSat",
    "uuid"
})
public class TimbreFiscalDigital {

    protected String fechaTimbre;
    protected String noCertificadoSAT;
    protected String selloCFD;
    protected String selloSat;
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad fechaTimbre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaTimbre() {
        return fechaTimbre;
    }

    /**
     * Define el valor de la propiedad fechaTimbre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaTimbre(String value) {
        this.fechaTimbre = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificadoSAT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificadoSAT() {
        return noCertificadoSAT;
    }

    /**
     * Define el valor de la propiedad noCertificadoSAT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificadoSAT(String value) {
        this.noCertificadoSAT = value;
    }

    /**
     * Obtiene el valor de la propiedad selloCFD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloCFD() {
        return selloCFD;
    }

    /**
     * Define el valor de la propiedad selloCFD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloCFD(String value) {
        this.selloCFD = value;
    }

    /**
     * Obtiene el valor de la propiedad selloSat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloSat() {
        return selloSat;
    }

    /**
     * Define el valor de la propiedad selloSat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloSat(String value) {
        this.selloSat = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
