
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deductivas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deductivas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impIdPk" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deductivas", propOrder = {
    "descripcion",
    "impIdPk",
    "importe",
    "tasa"
})
public class Deductivas {

    protected String descripcion;
    protected Long impIdPk;
    protected String importe;
    protected String tasa;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad impIdPk.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpIdPk() {
        return impIdPk;
    }

    /**
     * Define el valor de la propiedad impIdPk.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpIdPk(Long value) {
        this.impIdPk = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasa(String value) {
        this.tasa = value;
    }

}
