
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleMercancia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleMercancia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numPiezas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pesoNeto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pesoTara" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unidadPesoMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleMercancia", propOrder = {
    "numPiezas",
    "pesoBruto",
    "pesoNeto",
    "pesoTara",
    "unidadPesoMerc"
})
public class DetalleMercancia {

    protected Integer numPiezas;
    protected BigDecimal pesoBruto;
    protected BigDecimal pesoNeto;
    protected BigDecimal pesoTara;
    protected String unidadPesoMerc;

    /**
     * Obtiene el valor de la propiedad numPiezas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPiezas() {
        return numPiezas;
    }

    /**
     * Define el valor de la propiedad numPiezas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPiezas(Integer value) {
        this.numPiezas = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoBruto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    /**
     * Define el valor de la propiedad pesoBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBruto(BigDecimal value) {
        this.pesoBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoNeto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoNeto() {
        return pesoNeto;
    }

    /**
     * Define el valor de la propiedad pesoNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoNeto(BigDecimal value) {
        this.pesoNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad pesoTara.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoTara() {
        return pesoTara;
    }

    /**
     * Define el valor de la propiedad pesoTara.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoTara(BigDecimal value) {
        this.pesoTara = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPesoMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPesoMerc() {
        return unidadPesoMerc;
    }

    /**
     * Define el valor de la propiedad unidadPesoMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPesoMerc(String value) {
        this.unidadPesoMerc = value;
    }

}
