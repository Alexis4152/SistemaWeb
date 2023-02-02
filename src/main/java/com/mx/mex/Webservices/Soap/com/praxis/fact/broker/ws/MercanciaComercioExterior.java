
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mercanciaComercioExterior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mercanciaComercioExterior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraccionArancelaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listDescripcionesEspecificas" type="{http://ws.broker.fact.praxis.com/}descripcionesEspecificas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDolares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorUnitarioAduana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mercanciaComercioExterior", propOrder = {
    "cantidadAduana",
    "fraccionArancelaria",
    "listDescripcionesEspecificas",
    "noIdentificacion",
    "unidadAduana",
    "valorDolares",
    "valorUnitarioAduana"
})
public class MercanciaComercioExterior {

    protected String cantidadAduana;
    protected String fraccionArancelaria;
    @XmlElement(nillable = true)
    protected List<DescripcionesEspecificas> listDescripcionesEspecificas;
    protected String noIdentificacion;
    protected String unidadAduana;
    protected String valorDolares;
    protected String valorUnitarioAduana;

    /**
     * Obtiene el valor de la propiedad cantidadAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadAduana() {
        return cantidadAduana;
    }

    /**
     * Define el valor de la propiedad cantidadAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadAduana(String value) {
        this.cantidadAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad fraccionArancelaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraccionArancelaria() {
        return fraccionArancelaria;
    }

    /**
     * Define el valor de la propiedad fraccionArancelaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraccionArancelaria(String value) {
        this.fraccionArancelaria = value;
    }

    /**
     * Gets the value of the listDescripcionesEspecificas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDescripcionesEspecificas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDescripcionesEspecificas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescripcionesEspecificas }
     * 
     * 
     */
    public List<DescripcionesEspecificas> getListDescripcionesEspecificas() {
        if (listDescripcionesEspecificas == null) {
            listDescripcionesEspecificas = new ArrayList<DescripcionesEspecificas>();
        }
        return this.listDescripcionesEspecificas;
    }

    /**
     * Obtiene el valor de la propiedad noIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    /**
     * Define el valor de la propiedad noIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoIdentificacion(String value) {
        this.noIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadAduana() {
        return unidadAduana;
    }

    /**
     * Define el valor de la propiedad unidadAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadAduana(String value) {
        this.unidadAduana = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDolares.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDolares() {
        return valorDolares;
    }

    /**
     * Define el valor de la propiedad valorDolares.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDolares(String value) {
        this.valorDolares = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitarioAduana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorUnitarioAduana() {
        return valorUnitarioAduana;
    }

    /**
     * Define el valor de la propiedad valorUnitarioAduana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorUnitarioAduana(String value) {
        this.valorUnitarioAduana = value;
    }

}
