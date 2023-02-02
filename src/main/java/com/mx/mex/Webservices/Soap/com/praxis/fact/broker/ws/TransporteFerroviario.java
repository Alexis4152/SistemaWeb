
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transporteFerroviario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transporteFerroviario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carro" type="{http://ws.broker.fact.praxis.com/}carro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="derechosDePaso" type="{http://ws.broker.fact.praxis.com/}derechosDePaso" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDeTrafico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transporteFerroviario", propOrder = {
    "carro",
    "derechosDePaso",
    "nombreAseg",
    "numPolizaSeguro",
    "tipoDeServicio",
    "tipoDeTrafico"
})
public class TransporteFerroviario {

    @XmlElement(nillable = true)
    protected List<Carro> carro;
    @XmlElement(nillable = true)
    protected List<DerechosDePaso> derechosDePaso;
    protected String nombreAseg;
    protected String numPolizaSeguro;
    protected String tipoDeServicio;
    protected String tipoDeTrafico;

    /**
     * Gets the value of the carro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carro }
     * 
     * 
     */
    public List<Carro> getCarro() {
        if (carro == null) {
            carro = new ArrayList<Carro>();
        }
        return this.carro;
    }

    /**
     * Gets the value of the derechosDePaso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derechosDePaso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerechosDePaso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerechosDePaso }
     * 
     * 
     */
    public List<DerechosDePaso> getDerechosDePaso() {
        if (derechosDePaso == null) {
            derechosDePaso = new ArrayList<DerechosDePaso>();
        }
        return this.derechosDePaso;
    }

    /**
     * Obtiene el valor de la propiedad nombreAseg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAseg() {
        return nombreAseg;
    }

    /**
     * Define el valor de la propiedad nombreAseg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAseg(String value) {
        this.nombreAseg = value;
    }

    /**
     * Obtiene el valor de la propiedad numPolizaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPolizaSeguro() {
        return numPolizaSeguro;
    }

    /**
     * Define el valor de la propiedad numPolizaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPolizaSeguro(String value) {
        this.numPolizaSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    /**
     * Define el valor de la propiedad tipoDeServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeServicio(String value) {
        this.tipoDeServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeTrafico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeTrafico() {
        return tipoDeTrafico;
    }

    /**
     * Define el valor de la propiedad tipoDeTrafico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeTrafico(String value) {
        this.tipoDeTrafico = value;
    }

}
