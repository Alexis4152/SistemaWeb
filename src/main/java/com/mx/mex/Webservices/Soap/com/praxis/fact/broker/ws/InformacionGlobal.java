
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionGlobal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionGlobal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionGlobal", propOrder = {
    "anio",
    "meses",
    "periodicidad"
})
public class InformacionGlobal {

    protected String anio;
    protected String meses;
    protected String periodicidad;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

    /**
     * Obtiene el valor de la propiedad meses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeses() {
        return meses;
    }

    /**
     * Define el valor de la propiedad meses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeses(String value) {
        this.meses = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Define el valor de la propiedad periodicidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidad(String value) {
        this.periodicidad = value;
    }

}
