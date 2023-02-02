
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetencionConcepto2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetencionConcepto2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaOCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetencionConcepto2", propOrder = {
    "base",
    "importe",
    "impuesto",
    "tasaOCuota",
    "tipoFactor"
})
public class RetencionConcepto2 {

    protected String base;
    protected String importe;
    protected String impuesto;
    protected String tasaOCuota;
    protected String tipoFactor;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasaOCuota() {
        return tasaOCuota;
    }

    /**
     * Define el valor de la propiedad tasaOCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasaOCuota(String value) {
        this.tasaOCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactor() {
        return tipoFactor;
    }

    /**
     * Define el valor de la propiedad tipoFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactor(String value) {
        this.tipoFactor = value;
    }

}
