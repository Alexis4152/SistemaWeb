
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para percepciones12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="percepciones12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jubilacionPensionRetiro" type="{http://ws.broker.fact.praxis.com/}jubilacionPensionRetiro" minOccurs="0"/>
 *         &lt;element name="percepcion" type="{http://ws.broker.fact.praxis.com/}percepcion12" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="separacionIndemnizacion" type="{http://ws.broker.fact.praxis.com/}separacionIndemnizacion" minOccurs="0"/>
 *         &lt;element name="totalExento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalGravado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalJubilacionPensionRetiro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalSeparacionIndemnizacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalSueldos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percepciones12", propOrder = {
    "jubilacionPensionRetiro",
    "percepcion",
    "separacionIndemnizacion",
    "totalExento",
    "totalGravado",
    "totalJubilacionPensionRetiro",
    "totalSeparacionIndemnizacion",
    "totalSueldos"
})
public class Percepciones12 {

    protected JubilacionPensionRetiro jubilacionPensionRetiro;
    @XmlElement(nillable = true)
    protected List<Percepcion12> percepcion;
    protected SeparacionIndemnizacion separacionIndemnizacion;
    protected BigDecimal totalExento;
    protected BigDecimal totalGravado;
    protected BigDecimal totalJubilacionPensionRetiro;
    protected BigDecimal totalSeparacionIndemnizacion;
    protected BigDecimal totalSueldos;

    /**
     * Obtiene el valor de la propiedad jubilacionPensionRetiro.
     * 
     * @return
     *     possible object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public JubilacionPensionRetiro getJubilacionPensionRetiro() {
        return jubilacionPensionRetiro;
    }

    /**
     * Define el valor de la propiedad jubilacionPensionRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JubilacionPensionRetiro }
     *     
     */
    public void setJubilacionPensionRetiro(JubilacionPensionRetiro value) {
        this.jubilacionPensionRetiro = value;
    }

    /**
     * Gets the value of the percepcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percepcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercepcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Percepcion12 }
     * 
     * 
     */
    public List<Percepcion12> getPercepcion() {
        if (percepcion == null) {
            percepcion = new ArrayList<Percepcion12>();
        }
        return this.percepcion;
    }

    /**
     * Obtiene el valor de la propiedad separacionIndemnizacion.
     * 
     * @return
     *     possible object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public SeparacionIndemnizacion getSeparacionIndemnizacion() {
        return separacionIndemnizacion;
    }

    /**
     * Define el valor de la propiedad separacionIndemnizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link SeparacionIndemnizacion }
     *     
     */
    public void setSeparacionIndemnizacion(SeparacionIndemnizacion value) {
        this.separacionIndemnizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExento() {
        return totalExento;
    }

    /**
     * Define el valor de la propiedad totalExento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExento(BigDecimal value) {
        this.totalExento = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGravado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGravado() {
        return totalGravado;
    }

    /**
     * Define el valor de la propiedad totalGravado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGravado(BigDecimal value) {
        this.totalGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalJubilacionPensionRetiro() {
        return totalJubilacionPensionRetiro;
    }

    /**
     * Define el valor de la propiedad totalJubilacionPensionRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalJubilacionPensionRetiro(BigDecimal value) {
        this.totalJubilacionPensionRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSeparacionIndemnizacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSeparacionIndemnizacion() {
        return totalSeparacionIndemnizacion;
    }

    /**
     * Define el valor de la propiedad totalSeparacionIndemnizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSeparacionIndemnizacion(BigDecimal value) {
        this.totalSeparacionIndemnizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSueldos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSueldos() {
        return totalSueldos;
    }

    /**
     * Define el valor de la propiedad totalSueldos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSueldos(BigDecimal value) {
        this.totalSueldos = value;
    }

}
