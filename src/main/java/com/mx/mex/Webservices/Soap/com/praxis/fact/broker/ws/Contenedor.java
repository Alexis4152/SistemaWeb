
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contenedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contenedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matriculaContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPrecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoContenedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contenedor", propOrder = {
    "matriculaContenedor",
    "numPrecinto",
    "tipoContenedor"
})
public class Contenedor {

    protected String matriculaContenedor;
    protected String numPrecinto;
    protected String tipoContenedor;

    /**
     * Obtiene el valor de la propiedad matriculaContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaContenedor() {
        return matriculaContenedor;
    }

    /**
     * Define el valor de la propiedad matriculaContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaContenedor(String value) {
        this.matriculaContenedor = value;
    }

    /**
     * Obtiene el valor de la propiedad numPrecinto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrecinto() {
        return numPrecinto;
    }

    /**
     * Define el valor de la propiedad numPrecinto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrecinto(String value) {
        this.numPrecinto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContenedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContenedor() {
        return tipoContenedor;
    }

    /**
     * Define el valor de la propiedad tipoContenedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContenedor(String value) {
        this.tipoContenedor = value;
    }

}
