
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para jubilacionPensionRetiro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="jubilacionPensionRetiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingresoAcumulable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ingresoNoAcumulable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoDiario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalParcialidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalUnaExhibicion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jubilacionPensionRetiro", propOrder = {
    "ingresoAcumulable",
    "ingresoNoAcumulable",
    "montoDiario",
    "totalParcialidad",
    "totalUnaExhibicion"
})
public class JubilacionPensionRetiro {

    protected BigDecimal ingresoAcumulable;
    protected BigDecimal ingresoNoAcumulable;
    protected BigDecimal montoDiario;
    protected BigDecimal totalParcialidad;
    protected BigDecimal totalUnaExhibicion;

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
     * Obtiene el valor de la propiedad montoDiario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDiario() {
        return montoDiario;
    }

    /**
     * Define el valor de la propiedad montoDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDiario(BigDecimal value) {
        this.montoDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad totalParcialidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalParcialidad() {
        return totalParcialidad;
    }

    /**
     * Define el valor de la propiedad totalParcialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalParcialidad(BigDecimal value) {
        this.totalParcialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad totalUnaExhibicion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalUnaExhibicion() {
        return totalUnaExhibicion;
    }

    /**
     * Define el valor de la propiedad totalUnaExhibicion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalUnaExhibicion(BigDecimal value) {
        this.totalUnaExhibicion = value;
    }

}
