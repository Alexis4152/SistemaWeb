
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guiasIdentificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guiasIdentificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pesoGuiaIdentificacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiasIdentificacion", propOrder = {
    "descripGuiaIdentificacion",
    "numeroGuiaIdentificacion",
    "pesoGuiaIdentificacion"
})
public class GuiasIdentificacion {

    protected String descripGuiaIdentificacion;
    protected String numeroGuiaIdentificacion;
    protected BigDecimal pesoGuiaIdentificacion;

    /**
     * Obtiene el valor de la propiedad descripGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripGuiaIdentificacion() {
        return descripGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad descripGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripGuiaIdentificacion(String value) {
        this.descripGuiaIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaIdentificacion() {
        return numeroGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaIdentificacion(String value) {
        this.numeroGuiaIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoGuiaIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoGuiaIdentificacion() {
        return pesoGuiaIdentificacion;
    }

    /**
     * Define el valor de la propiedad pesoGuiaIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoGuiaIdentificacion(BigDecimal value) {
        this.pesoGuiaIdentificacion = value;
    }

}
