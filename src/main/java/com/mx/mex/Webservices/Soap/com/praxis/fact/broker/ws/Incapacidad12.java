
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para incapacidad12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="incapacidad12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diasIncapacidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="importeMonetario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoIncapacidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incapacidad12", propOrder = {
    "diasIncapacidad",
    "importeMonetario",
    "tipoIncapacidad"
})
public class Incapacidad12 {

    protected Integer diasIncapacidad;
    protected BigDecimal importeMonetario;
    protected String tipoIncapacidad;

    /**
     * Obtiene el valor de la propiedad diasIncapacidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasIncapacidad() {
        return diasIncapacidad;
    }

    /**
     * Define el valor de la propiedad diasIncapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasIncapacidad(Integer value) {
        this.diasIncapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad importeMonetario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteMonetario() {
        return importeMonetario;
    }

    /**
     * Define el valor de la propiedad importeMonetario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteMonetario(BigDecimal value) {
        this.importeMonetario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIncapacidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIncapacidad() {
        return tipoIncapacidad;
    }

    /**
     * Define el valor de la propiedad tipoIncapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIncapacidad(String value) {
        this.tipoIncapacidad = value;
    }

}
