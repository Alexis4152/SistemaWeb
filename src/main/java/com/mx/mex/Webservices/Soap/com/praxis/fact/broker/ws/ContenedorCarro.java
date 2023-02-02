
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contenedorCarro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contenedorCarro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pesoContenedorVacio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pesoNetoMercancia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contenedorCarro", propOrder = {
    "pesoContenedorVacio",
    "pesoNetoMercancia",
    "tipoContenedor"
})
public class ContenedorCarro {

    protected BigDecimal pesoContenedorVacio;
    protected BigDecimal pesoNetoMercancia;
    protected String tipoContenedor;

    /**
     * Obtiene el valor de la propiedad pesoContenedorVacio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoContenedorVacio() {
        return pesoContenedorVacio;
    }

    /**
     * Define el valor de la propiedad pesoContenedorVacio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoContenedorVacio(BigDecimal value) {
        this.pesoContenedorVacio = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNetoMercancia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoNetoMercancia() {
        return pesoNetoMercancia;
    }

    /**
     * Define el valor de la propiedad pesoNetoMercancia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoNetoMercancia(BigDecimal value) {
        this.pesoNetoMercancia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContenedor() {
        return tipoContenedor;
    }

    /**
     * Define el valor de la propiedad tipoContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContenedor(String value) {
        this.tipoContenedor = value;
    }

}
