
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retencionDR2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retencionDR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionImpuestoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importeDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuestoDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaOCuotaDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFactorDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencionDR2", propOrder = {
    "baseDR",
    "descripcionImpuestoDR",
    "importeDR",
    "impuestoDR",
    "tasaOCuotaDR",
    "tipoFactorDR"
})
public class RetencionDR2 {

    protected String baseDR;
    protected String descripcionImpuestoDR;
    protected String importeDR;
    protected String impuestoDR;
    protected String tasaOCuotaDR;
    protected String tipoFactorDR;

    /**
     * Obtiene el valor de la propiedad baseDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDR() {
        return baseDR;
    }

    /**
     * Define el valor de la propiedad baseDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDR(String value) {
        this.baseDR = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionImpuestoDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionImpuestoDR() {
        return descripcionImpuestoDR;
    }

    /**
     * Define el valor de la propiedad descripcionImpuestoDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionImpuestoDR(String value) {
        this.descripcionImpuestoDR = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteDR() {
        return importeDR;
    }

    /**
     * Define el valor de la propiedad importeDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteDR(String value) {
        this.importeDR = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestoDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuestoDR() {
        return impuestoDR;
    }

    /**
     * Define el valor de la propiedad impuestoDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuestoDR(String value) {
        this.impuestoDR = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuotaDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaOCuotaDR() {
        return tasaOCuotaDR;
    }

    /**
     * Define el valor de la propiedad tasaOCuotaDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaOCuotaDR(String value) {
        this.tasaOCuotaDR = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactorDR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactorDR() {
        return tipoFactorDR;
    }

    /**
     * Define el valor de la propiedad tipoFactorDR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactorDR(String value) {
        this.tipoFactorDR = value;
    }

}
