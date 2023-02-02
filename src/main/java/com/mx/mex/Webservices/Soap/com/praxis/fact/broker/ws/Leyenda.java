
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para leyenda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="leyenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disposicionFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="norma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textoLeyenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leyenda", propOrder = {
    "disposicionFiscal",
    "norma",
    "textoLeyenda"
})
public class Leyenda {

    protected String disposicionFiscal;
    protected String norma;
    protected String textoLeyenda;

    /**
     * Obtiene el valor de la propiedad disposicionFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposicionFiscal() {
        return disposicionFiscal;
    }

    /**
     * Define el valor de la propiedad disposicionFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposicionFiscal(String value) {
        this.disposicionFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad norma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNorma() {
        return norma;
    }

    /**
     * Define el valor de la propiedad norma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorma(String value) {
        this.norma = value;
    }

    /**
     * Obtiene el valor de la propiedad textoLeyenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoLeyenda() {
        return textoLeyenda;
    }

    /**
     * Define el valor de la propiedad textoLeyenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoLeyenda(String value) {
        this.textoLeyenda = value;
    }

}
