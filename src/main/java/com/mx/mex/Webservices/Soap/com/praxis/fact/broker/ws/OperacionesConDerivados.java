
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operacionesConDerivados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operacionesConDerivados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montGanAcum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montPerdDed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacionesConDerivados", propOrder = {
    "montGanAcum",
    "montPerdDed"
})
public class OperacionesConDerivados {

    protected String montGanAcum;
    protected String montPerdDed;

    /**
     * Obtiene el valor de la propiedad montGanAcum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontGanAcum() {
        return montGanAcum;
    }

    /**
     * Define el valor de la propiedad montGanAcum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontGanAcum(String value) {
        this.montGanAcum = value;
    }

    /**
     * Obtiene el valor de la propiedad montPerdDed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontPerdDed() {
        return montPerdDed;
    }

    /**
     * Define el valor de la propiedad montPerdDed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontPerdDed(String value) {
        this.montPerdDed = value;
    }

}
