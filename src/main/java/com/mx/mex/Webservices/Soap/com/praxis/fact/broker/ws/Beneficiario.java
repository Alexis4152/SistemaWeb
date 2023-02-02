
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beneficiario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CURP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomDenRazSocB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiario", propOrder = {
    "curp",
    "conceptoPago",
    "descripcionConcepto",
    "nomDenRazSocB",
    "rfc"
})
public class Beneficiario {

    @XmlElement(name = "CURP")
    protected String curp;
    protected String conceptoPago;
    protected String descripcionConcepto;
    protected String nomDenRazSocB;
    @XmlElement(name = "RFC")
    protected String rfc;

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
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
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptoPago() {
        return conceptoPago;
    }

    /**
     * Define el valor de la propiedad conceptoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptoPago(String value) {
        this.conceptoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionConcepto() {
        return descripcionConcepto;
    }

    /**
     * Define el valor de la propiedad descripcionConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionConcepto(String value) {
        this.descripcionConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDenRazSocB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDenRazSocB() {
        return nomDenRazSocB;
    }

    /**
     * Define el valor de la propiedad nomDenRazSocB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDenRazSocB(String value) {
        this.nomDenRazSocB = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

}
