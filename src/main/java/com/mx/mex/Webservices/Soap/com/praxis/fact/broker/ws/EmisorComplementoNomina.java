
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emisorComplementoNomina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emisorComplementoNomina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadSNCF" type="{http://ws.broker.fact.praxis.com/}entidadSNCF" minOccurs="0"/>
 *         &lt;element name="registroPatronal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcPatronOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emisorComplementoNomina", propOrder = {
    "curp",
    "entidadSNCF",
    "registroPatronal",
    "rfcPatronOrigen"
})
public class EmisorComplementoNomina {

    protected String curp;
    protected EntidadSNCF entidadSNCF;
    protected String registroPatronal;
    protected String rfcPatronOrigen;

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadSNCF.
     * 
     * @return
     *     possible object is
     *     {@link EntidadSNCF }
     *     
     */
    public EntidadSNCF getEntidadSNCF() {
        return entidadSNCF;
    }

    /**
     * Define el valor de la propiedad entidadSNCF.
     * 
     * @param value
     *     allowed object is
     *     {@link EntidadSNCF }
     *     
     */
    public void setEntidadSNCF(EntidadSNCF value) {
        this.entidadSNCF = value;
    }

    /**
     * Obtiene el valor de la propiedad registroPatronal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroPatronal() {
        return registroPatronal;
    }

    /**
     * Define el valor de la propiedad registroPatronal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroPatronal(String value) {
        this.registroPatronal = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcPatronOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcPatronOrigen() {
        return rfcPatronOrigen;
    }

    /**
     * Define el valor de la propiedad rfcPatronOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcPatronOrigen(String value) {
        this.rfcPatronOrigen = value;
    }

}
