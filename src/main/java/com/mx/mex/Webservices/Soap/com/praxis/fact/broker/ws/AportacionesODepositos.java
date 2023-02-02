
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aportacionesODepositos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aportacionesODepositos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montAportODep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFCFiduciaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAportacionODeposito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aportacionesODepositos", propOrder = {
    "montAportODep",
    "rfcFiduciaria",
    "tipoAportacionODeposito"
})
public class AportacionesODepositos {

    protected String montAportODep;
    @XmlElement(name = "RFCFiduciaria")
    protected String rfcFiduciaria;
    protected String tipoAportacionODeposito;

    /**
     * Obtiene el valor de la propiedad montAportODep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontAportODep() {
        return montAportODep;
    }

    /**
     * Define el valor de la propiedad montAportODep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontAportODep(String value) {
        this.montAportODep = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcFiduciaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFCFiduciaria() {
        return rfcFiduciaria;
    }

    /**
     * Define el valor de la propiedad rfcFiduciaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFCFiduciaria(String value) {
        this.rfcFiduciaria = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAportacionODeposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAportacionODeposito() {
        return tipoAportacionODeposito;
    }

    /**
     * Define el valor de la propiedad tipoAportacionODeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAportacionODeposito(String value) {
        this.tipoAportacionODeposito = value;
    }

}
