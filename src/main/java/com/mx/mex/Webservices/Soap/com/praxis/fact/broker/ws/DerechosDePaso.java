
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para derechosDePaso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="derechosDePaso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kilometrajePagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoDerechoDePaso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "derechosDePaso", propOrder = {
    "kilometrajePagado",
    "tipoDerechoDePaso"
})
public class DerechosDePaso {

    protected BigDecimal kilometrajePagado;
    protected String tipoDerechoDePaso;

    /**
     * Obtiene el valor de la propiedad kilometrajePagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKilometrajePagado() {
        return kilometrajePagado;
    }

    /**
     * Define el valor de la propiedad kilometrajePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKilometrajePagado(BigDecimal value) {
        this.kilometrajePagado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDerechoDePaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDerechoDePaso() {
        return tipoDerechoDePaso;
    }

    /**
     * Define el valor de la propiedad tipoDerechoDePaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDerechoDePaso(String value) {
        this.tipoDerechoDePaso = value;
    }

}
