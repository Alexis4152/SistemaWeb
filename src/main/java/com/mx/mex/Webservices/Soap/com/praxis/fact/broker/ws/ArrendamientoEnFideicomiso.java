
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrendamientoEnFideicomiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrendamientoEnFideicomiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deduccCorresp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrMontOtrosConceptDistr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montOtrosConceptDistr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montResFiscDistFibras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagProvEfecPorFiduc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rendimFideicom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrendamientoEnFideicomiso", propOrder = {
    "deduccCorresp",
    "descrMontOtrosConceptDistr",
    "montOtrosConceptDistr",
    "montResFiscDistFibras",
    "montTotRet",
    "pagProvEfecPorFiduc",
    "rendimFideicom"
})
public class ArrendamientoEnFideicomiso {

    protected String deduccCorresp;
    protected String descrMontOtrosConceptDistr;
    protected String montOtrosConceptDistr;
    protected String montResFiscDistFibras;
    protected String montTotRet;
    protected String pagProvEfecPorFiduc;
    protected String rendimFideicom;

    /**
     * Obtiene el valor de la propiedad deduccCorresp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduccCorresp() {
        return deduccCorresp;
    }

    /**
     * Define el valor de la propiedad deduccCorresp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduccCorresp(String value) {
        this.deduccCorresp = value;
    }

    /**
     * Obtiene el valor de la propiedad descrMontOtrosConceptDistr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrMontOtrosConceptDistr() {
        return descrMontOtrosConceptDistr;
    }

    /**
     * Define el valor de la propiedad descrMontOtrosConceptDistr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrMontOtrosConceptDistr(String value) {
        this.descrMontOtrosConceptDistr = value;
    }

    /**
     * Obtiene el valor de la propiedad montOtrosConceptDistr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontOtrosConceptDistr() {
        return montOtrosConceptDistr;
    }

    /**
     * Define el valor de la propiedad montOtrosConceptDistr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontOtrosConceptDistr(String value) {
        this.montOtrosConceptDistr = value;
    }

    /**
     * Obtiene el valor de la propiedad montResFiscDistFibras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontResFiscDistFibras() {
        return montResFiscDistFibras;
    }

    /**
     * Define el valor de la propiedad montResFiscDistFibras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontResFiscDistFibras(String value) {
        this.montResFiscDistFibras = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotRet() {
        return montTotRet;
    }

    /**
     * Define el valor de la propiedad montTotRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotRet(String value) {
        this.montTotRet = value;
    }

    /**
     * Obtiene el valor de la propiedad pagProvEfecPorFiduc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagProvEfecPorFiduc() {
        return pagProvEfecPorFiduc;
    }

    /**
     * Define el valor de la propiedad pagProvEfecPorFiduc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagProvEfecPorFiduc(String value) {
        this.pagProvEfecPorFiduc = value;
    }

    /**
     * Obtiene el valor de la propiedad rendimFideicom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRendimFideicom() {
        return rendimFideicom;
    }

    /**
     * Define el valor de la propiedad rendimFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRendimFideicom(String value) {
        this.rendimFideicom = value;
    }

}
