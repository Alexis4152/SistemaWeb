
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cantidadTransporta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cantidadTransporta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cvesTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cantidadTransporta", propOrder = {
    "cantidad",
    "cvesTransporte",
    "idDestino",
    "idOrigen"
})
public class CantidadTransporta {

    protected BigDecimal cantidad;
    protected String cvesTransporte;
    protected String idDestino;
    protected String idOrigen;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cvesTransporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvesTransporte() {
        return cvesTransporte;
    }

    /**
     * Define el valor de la propiedad cvesTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvesTransporte(String value) {
        this.cvesTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad idDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDestino() {
        return idDestino;
    }

    /**
     * Define el valor de la propiedad idDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDestino(String value) {
        this.idDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrigen() {
        return idOrigen;
    }

    /**
     * Define el valor de la propiedad idOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrigen(String value) {
        this.idOrigen = value;
    }

}
