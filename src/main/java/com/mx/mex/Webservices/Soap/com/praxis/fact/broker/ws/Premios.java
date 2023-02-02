
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para premios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="premios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidadFederativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotPagoExent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotPagoGrav" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premios", propOrder = {
    "entidadFederativa",
    "montTotPago",
    "montTotPagoExent",
    "montTotPagoGrav"
})
public class Premios {

    protected String entidadFederativa;
    protected String montTotPago;
    protected String montTotPagoExent;
    protected String montTotPagoGrav;

    /**
     * Obtiene el valor de la propiedad entidadFederativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    /**
     * Define el valor de la propiedad entidadFederativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadFederativa(String value) {
        this.entidadFederativa = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotPago() {
        return montTotPago;
    }

    /**
     * Define el valor de la propiedad montTotPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotPago(String value) {
        this.montTotPago = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotPagoExent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotPagoExent() {
        return montTotPagoExent;
    }

    /**
     * Define el valor de la propiedad montTotPagoExent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotPagoExent(String value) {
        this.montTotPagoExent = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotPagoGrav.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotPagoGrav() {
        return montTotPagoGrav;
    }

    /**
     * Define el valor de la propiedad montTotPagoGrav.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotPagoGrav(String value) {
        this.montTotPagoGrav = value;
    }

}
