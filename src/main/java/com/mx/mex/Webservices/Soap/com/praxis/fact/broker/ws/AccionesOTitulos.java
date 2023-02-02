
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accionesOTitulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accionesOTitulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precioAlOtorgarse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valorMercado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accionesOTitulos", propOrder = {
    "precioAlOtorgarse",
    "valorMercado"
})
public class AccionesOTitulos {

    protected BigDecimal precioAlOtorgarse;
    protected BigDecimal valorMercado;

    /**
     * Obtiene el valor de la propiedad precioAlOtorgarse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecioAlOtorgarse() {
        return precioAlOtorgarse;
    }

    /**
     * Define el valor de la propiedad precioAlOtorgarse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecioAlOtorgarse(BigDecimal value) {
        this.precioAlOtorgarse = value;
    }

    /**
     * Obtiene el valor de la propiedad valorMercado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMercado() {
        return valorMercado;
    }

    /**
     * Define el valor de la propiedad valorMercado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMercado(BigDecimal value) {
        this.valorMercado = value;
    }

}
