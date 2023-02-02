
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seguros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aseguraCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aseguraMedAmbiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aseguraRespCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polizaCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polizaMedAmbiente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polizaRespCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaSeguro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguros", propOrder = {
    "aseguraCarga",
    "aseguraMedAmbiente",
    "aseguraRespCivil",
    "polizaCarga",
    "polizaMedAmbiente",
    "polizaRespCivil",
    "primaSeguro"
})
public class Seguros {

    protected String aseguraCarga;
    protected String aseguraMedAmbiente;
    protected String aseguraRespCivil;
    protected String polizaCarga;
    protected String polizaMedAmbiente;
    protected String polizaRespCivil;
    protected BigDecimal primaSeguro;

    /**
     * Obtiene el valor de la propiedad aseguraCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraCarga() {
        return aseguraCarga;
    }

    /**
     * Define el valor de la propiedad aseguraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraCarga(String value) {
        this.aseguraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguraMedAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraMedAmbiente() {
        return aseguraMedAmbiente;
    }

    /**
     * Define el valor de la propiedad aseguraMedAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraMedAmbiente(String value) {
        this.aseguraMedAmbiente = value;
    }

    /**
     * Obtiene el valor de la propiedad aseguraRespCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAseguraRespCivil() {
        return aseguraRespCivil;
    }

    /**
     * Define el valor de la propiedad aseguraRespCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAseguraRespCivil(String value) {
        this.aseguraRespCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaCarga() {
        return polizaCarga;
    }

    /**
     * Define el valor de la propiedad polizaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaCarga(String value) {
        this.polizaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaMedAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaMedAmbiente() {
        return polizaMedAmbiente;
    }

    /**
     * Define el valor de la propiedad polizaMedAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaMedAmbiente(String value) {
        this.polizaMedAmbiente = value;
    }

    /**
     * Obtiene el valor de la propiedad polizaRespCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolizaRespCivil() {
        return polizaRespCivil;
    }

    /**
     * Define el valor de la propiedad polizaRespCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolizaRespCivil(String value) {
        this.polizaRespCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad primaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaSeguro() {
        return primaSeguro;
    }

    /**
     * Define el valor de la propiedad primaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaSeguro(BigDecimal value) {
        this.primaSeguro = value;
    }

}
