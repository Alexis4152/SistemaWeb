
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para totales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="totales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montoTotalPagos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRetencionesIEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRetencionesISR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRetencionesIVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosBaseIVA0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosBaseIVA16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosBaseIVA8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosBaseIVAExento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosImpuestoIVA0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosImpuestoIVA16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTrasladosImpuestoIVA8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totales", propOrder = {
    "montoTotalPagos",
    "totalRetencionesIEPS",
    "totalRetencionesISR",
    "totalRetencionesIVA",
    "totalTrasladosBaseIVA0",
    "totalTrasladosBaseIVA16",
    "totalTrasladosBaseIVA8",
    "totalTrasladosBaseIVAExento",
    "totalTrasladosImpuestoIVA0",
    "totalTrasladosImpuestoIVA16",
    "totalTrasladosImpuestoIVA8"
})
public class Totales {

    protected String montoTotalPagos;
    protected String totalRetencionesIEPS;
    protected String totalRetencionesISR;
    protected String totalRetencionesIVA;
    protected String totalTrasladosBaseIVA0;
    protected String totalTrasladosBaseIVA16;
    protected String totalTrasladosBaseIVA8;
    protected String totalTrasladosBaseIVAExento;
    protected String totalTrasladosImpuestoIVA0;
    protected String totalTrasladosImpuestoIVA16;
    protected String totalTrasladosImpuestoIVA8;

    /**
     * Obtiene el valor de la propiedad montoTotalPagos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotalPagos() {
        return montoTotalPagos;
    }

    /**
     * Define el valor de la propiedad montoTotalPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotalPagos(String value) {
        this.montoTotalPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesIEPS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRetencionesIEPS() {
        return totalRetencionesIEPS;
    }

    /**
     * Define el valor de la propiedad totalRetencionesIEPS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRetencionesIEPS(String value) {
        this.totalRetencionesIEPS = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesISR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRetencionesISR() {
        return totalRetencionesISR;
    }

    /**
     * Define el valor de la propiedad totalRetencionesISR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRetencionesISR(String value) {
        this.totalRetencionesISR = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRetencionesIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRetencionesIVA() {
        return totalRetencionesIVA;
    }

    /**
     * Define el valor de la propiedad totalRetencionesIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRetencionesIVA(String value) {
        this.totalRetencionesIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosBaseIVA0() {
        return totalTrasladosBaseIVA0;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosBaseIVA0(String value) {
        this.totalTrasladosBaseIVA0 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosBaseIVA16() {
        return totalTrasladosBaseIVA16;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosBaseIVA16(String value) {
        this.totalTrasladosBaseIVA16 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVA8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosBaseIVA8() {
        return totalTrasladosBaseIVA8;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVA8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosBaseIVA8(String value) {
        this.totalTrasladosBaseIVA8 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosBaseIVAExento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosBaseIVAExento() {
        return totalTrasladosBaseIVAExento;
    }

    /**
     * Define el valor de la propiedad totalTrasladosBaseIVAExento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosBaseIVAExento(String value) {
        this.totalTrasladosBaseIVAExento = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosImpuestoIVA0() {
        return totalTrasladosImpuestoIVA0;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosImpuestoIVA0(String value) {
        this.totalTrasladosImpuestoIVA0 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA16.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosImpuestoIVA16() {
        return totalTrasladosImpuestoIVA16;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA16.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosImpuestoIVA16(String value) {
        this.totalTrasladosImpuestoIVA16 = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTrasladosImpuestoIVA8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTrasladosImpuestoIVA8() {
        return totalTrasladosImpuestoIVA8;
    }

    /**
     * Define el valor de la propiedad totalTrasladosImpuestoIVA8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTrasladosImpuestoIVA8(String value) {
        this.totalTrasladosImpuestoIVA8 = value;
    }

}
