
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planesDeRetiro11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planesDeRetiro11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aportacionesODepositos" type="{http://ws.broker.fact.praxis.com/}aportacionesODepositos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="huboRetirosAnioInmAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huboRetirosAnioInmAntPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montIntRealesDevengAniooInmAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotAportAnioInmAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotExedenteAnioInmAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotExentRetiradoAnioInmAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotRetiradoAnioInmAnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montTotRetiradoAnioInmAntPer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistemaFinanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planesDeRetiro11", propOrder = {
    "aportacionesODepositos",
    "huboRetirosAnioInmAnt",
    "huboRetirosAnioInmAntPer",
    "montIntRealesDevengAniooInmAnt",
    "montTotAportAnioInmAnterior",
    "montTotExedenteAnioInmAnt",
    "montTotExentRetiradoAnioInmAnt",
    "montTotRetiradoAnioInmAnt",
    "montTotRetiradoAnioInmAntPer",
    "numReferencia",
    "sistemaFinanc"
})
public class PlanesDeRetiro11 {

    @XmlElement(nillable = true)
    protected List<AportacionesODepositos> aportacionesODepositos;
    protected String huboRetirosAnioInmAnt;
    protected String huboRetirosAnioInmAntPer;
    protected String montIntRealesDevengAniooInmAnt;
    protected String montTotAportAnioInmAnterior;
    protected String montTotExedenteAnioInmAnt;
    protected String montTotExentRetiradoAnioInmAnt;
    protected String montTotRetiradoAnioInmAnt;
    protected String montTotRetiradoAnioInmAntPer;
    protected String numReferencia;
    protected String sistemaFinanc;

    /**
     * Gets the value of the aportacionesODepositos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aportacionesODepositos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAportacionesODepositos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AportacionesODepositos }
     * 
     * 
     */
    public List<AportacionesODepositos> getAportacionesODepositos() {
        if (aportacionesODepositos == null) {
            aportacionesODepositos = new ArrayList<AportacionesODepositos>();
        }
        return this.aportacionesODepositos;
    }

    /**
     * Obtiene el valor de la propiedad huboRetirosAnioInmAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuboRetirosAnioInmAnt() {
        return huboRetirosAnioInmAnt;
    }

    /**
     * Define el valor de la propiedad huboRetirosAnioInmAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuboRetirosAnioInmAnt(String value) {
        this.huboRetirosAnioInmAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad huboRetirosAnioInmAntPer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuboRetirosAnioInmAntPer() {
        return huboRetirosAnioInmAntPer;
    }

    /**
     * Define el valor de la propiedad huboRetirosAnioInmAntPer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuboRetirosAnioInmAntPer(String value) {
        this.huboRetirosAnioInmAntPer = value;
    }

    /**
     * Obtiene el valor de la propiedad montIntRealesDevengAniooInmAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontIntRealesDevengAniooInmAnt() {
        return montIntRealesDevengAniooInmAnt;
    }

    /**
     * Define el valor de la propiedad montIntRealesDevengAniooInmAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontIntRealesDevengAniooInmAnt(String value) {
        this.montIntRealesDevengAniooInmAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotAportAnioInmAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotAportAnioInmAnterior() {
        return montTotAportAnioInmAnterior;
    }

    /**
     * Define el valor de la propiedad montTotAportAnioInmAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotAportAnioInmAnterior(String value) {
        this.montTotAportAnioInmAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotExedenteAnioInmAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotExedenteAnioInmAnt() {
        return montTotExedenteAnioInmAnt;
    }

    /**
     * Define el valor de la propiedad montTotExedenteAnioInmAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotExedenteAnioInmAnt(String value) {
        this.montTotExedenteAnioInmAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotExentRetiradoAnioInmAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotExentRetiradoAnioInmAnt() {
        return montTotExentRetiradoAnioInmAnt;
    }

    /**
     * Define el valor de la propiedad montTotExentRetiradoAnioInmAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotExentRetiradoAnioInmAnt(String value) {
        this.montTotExentRetiradoAnioInmAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotRetiradoAnioInmAnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotRetiradoAnioInmAnt() {
        return montTotRetiradoAnioInmAnt;
    }

    /**
     * Define el valor de la propiedad montTotRetiradoAnioInmAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotRetiradoAnioInmAnt(String value) {
        this.montTotRetiradoAnioInmAnt = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotRetiradoAnioInmAntPer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontTotRetiradoAnioInmAntPer() {
        return montTotRetiradoAnioInmAntPer;
    }

    /**
     * Define el valor de la propiedad montTotRetiradoAnioInmAntPer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontTotRetiradoAnioInmAntPer(String value) {
        this.montTotRetiradoAnioInmAntPer = value;
    }

    /**
     * Obtiene el valor de la propiedad numReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumReferencia() {
        return numReferencia;
    }

    /**
     * Define el valor de la propiedad numReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumReferencia(String value) {
        this.numReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad sistemaFinanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaFinanc() {
        return sistemaFinanc;
    }

    /**
     * Define el valor de la propiedad sistemaFinanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaFinanc(String value) {
        this.sistemaFinanc = value;
    }

}
