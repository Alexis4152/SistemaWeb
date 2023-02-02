
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para carro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="carro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contenedor" type="{http://ws.broker.fact.praxis.com/}contenedorCarro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guiaCarro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaCarro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCarro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toneladasNetasCarro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carro", propOrder = {
    "contenedor",
    "guiaCarro",
    "matriculaCarro",
    "tipoCarro",
    "toneladasNetasCarro"
})
public class Carro {

    @XmlElement(nillable = true)
    protected List<ContenedorCarro> contenedor;
    protected String guiaCarro;
    protected String matriculaCarro;
    protected String tipoCarro;
    protected BigDecimal toneladasNetasCarro;

    /**
     * Gets the value of the contenedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContenedorCarro }
     * 
     * 
     */
    public List<ContenedorCarro> getContenedor() {
        if (contenedor == null) {
            contenedor = new ArrayList<ContenedorCarro>();
        }
        return this.contenedor;
    }

    /**
     * Obtiene el valor de la propiedad guiaCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaCarro() {
        return guiaCarro;
    }

    /**
     * Define el valor de la propiedad guiaCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaCarro(String value) {
        this.guiaCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCarro() {
        return matriculaCarro;
    }

    /**
     * Define el valor de la propiedad matriculaCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCarro(String value) {
        this.matriculaCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarro() {
        return tipoCarro;
    }

    /**
     * Define el valor de la propiedad tipoCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarro(String value) {
        this.tipoCarro = value;
    }

    /**
     * Obtiene el valor de la propiedad toneladasNetasCarro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToneladasNetasCarro() {
        return toneladasNetasCarro;
    }

    /**
     * Define el valor de la propiedad toneladasNetasCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToneladasNetasCarro(BigDecimal value) {
        this.toneladasNetasCarro = value;
    }

}
