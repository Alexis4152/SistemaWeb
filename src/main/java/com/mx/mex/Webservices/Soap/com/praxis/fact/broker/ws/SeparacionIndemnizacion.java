
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para separacionIndemnizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="separacionIndemnizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingresoAcumulable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ingresoNoAcumulable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numAnosServicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ultimoSueldoMensOrd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "separacionIndemnizacion", propOrder = {
    "ingresoAcumulable",
    "ingresoNoAcumulable",
    "numAnosServicio",
    "totalPagado",
    "ultimoSueldoMensOrd"
})
public class SeparacionIndemnizacion {

    protected BigDecimal ingresoAcumulable;
    protected BigDecimal ingresoNoAcumulable;
    protected Integer numAnosServicio;
    protected BigDecimal totalPagado;
    protected BigDecimal ultimoSueldoMensOrd;

    /**
     * Obtiene el valor de la propiedad ingresoAcumulable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoAcumulable() {
        return ingresoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoAcumulable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoAcumulable(BigDecimal value) {
        this.ingresoAcumulable = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoNoAcumulable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoNoAcumulable() {
        return ingresoNoAcumulable;
    }

    /**
     * Define el valor de la propiedad ingresoNoAcumulable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoNoAcumulable(BigDecimal value) {
        this.ingresoNoAcumulable = value;
    }

    /**
     * Obtiene el valor de la propiedad numAnosServicio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAnosServicio() {
        return numAnosServicio;
    }

    /**
     * Define el valor de la propiedad numAnosServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAnosServicio(Integer value) {
        this.numAnosServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    /**
     * Define el valor de la propiedad totalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPagado(BigDecimal value) {
        this.totalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoSueldoMensOrd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUltimoSueldoMensOrd() {
        return ultimoSueldoMensOrd;
    }

    /**
     * Define el valor de la propiedad ultimoSueldoMensOrd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUltimoSueldoMensOrd(BigDecimal value) {
        this.ultimoSueldoMensOrd = value;
    }

}
