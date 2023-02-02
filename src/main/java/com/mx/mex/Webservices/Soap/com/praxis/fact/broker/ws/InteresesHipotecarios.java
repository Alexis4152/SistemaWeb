
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para interesesHipotecarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="interesesHipotecarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditoDeInstFinanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotIntNominalesDev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotIntNominalesDevYPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotIntRealPagDeduc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propDeducDelCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saldoInsoluto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interesesHipotecarios", propOrder = {
    "creditoDeInstFinanc",
    "montTotIntNominalesDev",
    "montTotIntNominalesDevYPag",
    "montTotIntRealPagDeduc",
    "numContrato",
    "propDeducDelCredit",
    "saldoInsoluto"
})
public class InteresesHipotecarios {

    protected String creditoDeInstFinanc;
    protected String montTotIntNominalesDev;
    protected String montTotIntNominalesDevYPag;
    protected String montTotIntRealPagDeduc;
    protected String numContrato;
    protected String propDeducDelCredit;
    protected String saldoInsoluto;

    /**
     * Obtiene el valor de la propiedad creditoDeInstFinanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditoDeInstFinanc() {
        return creditoDeInstFinanc;
    }

    /**
     * Define el valor de la propiedad creditoDeInstFinanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditoDeInstFinanc(String value) {
        this.creditoDeInstFinanc = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotIntNominalesDev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotIntNominalesDev() {
        return montTotIntNominalesDev;
    }

    /**
     * Define el valor de la propiedad montTotIntNominalesDev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotIntNominalesDev(String value) {
        this.montTotIntNominalesDev = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotIntNominalesDevYPag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotIntNominalesDevYPag() {
        return montTotIntNominalesDevYPag;
    }

    /**
     * Define el valor de la propiedad montTotIntNominalesDevYPag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotIntNominalesDevYPag(String value) {
        this.montTotIntNominalesDevYPag = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotIntRealPagDeduc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotIntRealPagDeduc() {
        return montTotIntRealPagDeduc;
    }

    /**
     * Define el valor de la propiedad montTotIntRealPagDeduc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotIntRealPagDeduc(String value) {
        this.montTotIntRealPagDeduc = value;
    }

    /**
     * Obtiene el valor de la propiedad numContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumContrato() {
        return numContrato;
    }

    /**
     * Define el valor de la propiedad numContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumContrato(String value) {
        this.numContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad propDeducDelCredit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropDeducDelCredit() {
        return propDeducDelCredit;
    }

    /**
     * Define el valor de la propiedad propDeducDelCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropDeducDelCredit(String value) {
        this.propDeducDelCredit = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoInsoluto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoInsoluto() {
        return saldoInsoluto;
    }

    /**
     * Define el valor de la propiedad saldoInsoluto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoInsoluto(String value) {
        this.saldoInsoluto = value;
    }

}
