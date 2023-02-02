
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para subContratacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subContratacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="porcentajeTiempo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rfcLabora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subContratacion", propOrder = {
    "porcentajeTiempo",
    "rfcLabora"
})
public class SubContratacion {

    protected BigDecimal porcentajeTiempo;
    protected String rfcLabora;

    /**
     * Obtiene el valor de la propiedad porcentajeTiempo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeTiempo() {
        return porcentajeTiempo;
    }

    /**
     * Define el valor de la propiedad porcentajeTiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeTiempo(BigDecimal value) {
        this.porcentajeTiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcLabora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcLabora() {
        return rfcLabora;
    }

    /**
     * Define el valor de la propiedad rfcLabora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcLabora(String value) {
        this.rfcLabora = value;
    }

}
