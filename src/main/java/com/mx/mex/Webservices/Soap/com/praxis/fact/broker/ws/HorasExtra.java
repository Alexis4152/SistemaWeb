
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horasExtra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horasExtra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="horasExtra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="importePagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tipoHoras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horasExtra", propOrder = {
    "dias",
    "horasExtra",
    "importePagado",
    "tipoHoras"
})
@XmlSeeAlso({
    HorasExtra12 .class
})
public class HorasExtra {

    protected Integer dias;
    protected Integer horasExtra;
    protected BigDecimal importePagado;
    protected String tipoHoras;

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDias(Integer value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad horasExtra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorasExtra() {
        return horasExtra;
    }

    /**
     * Define el valor de la propiedad horasExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorasExtra(Integer value) {
        this.horasExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportePagado() {
        return importePagado;
    }

    /**
     * Define el valor de la propiedad importePagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportePagado(BigDecimal value) {
        this.importePagado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoHoras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoHoras() {
        return tipoHoras;
    }

    /**
     * Define el valor de la propiedad tipoHoras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoHoras(String value) {
        this.tipoHoras = value;
    }

}
