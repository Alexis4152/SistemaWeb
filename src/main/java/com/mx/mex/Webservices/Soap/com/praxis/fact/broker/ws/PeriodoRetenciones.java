
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para periodoRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="periodoRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ejerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mesFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mesIni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "periodoRetenciones", propOrder = {
    "ejerc",
    "mesFin",
    "mesIni"
})
public class PeriodoRetenciones {

    protected String ejerc;
    protected String mesFin;
    protected String mesIni;

    /**
     * Obtiene el valor de la propiedad ejerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjerc() {
        return ejerc;
    }

    /**
     * Define el valor de la propiedad ejerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjerc(String value) {
        this.ejerc = value;
    }

    /**
     * Obtiene el valor de la propiedad mesFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesFin() {
        return mesFin;
    }

    /**
     * Define el valor de la propiedad mesFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesFin(String value) {
        this.mesFin = value;
    }

    /**
     * Obtiene el valor de la propiedad mesIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesIni() {
        return mesIni;
    }

    /**
     * Define el valor de la propiedad mesIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesIni(String value) {
        this.mesIni = value;
    }

}
