
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contabilidadIne11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contabilidadIne11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idContabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contabilidadIne11", propOrder = {
    "idContabilidad"
})
public class ContabilidadIne11 {

    protected String idContabilidad;

    /**
     * Obtiene el valor de la propiedad idContabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContabilidad() {
        return idContabilidad;
    }

    /**
     * Define el valor de la propiedad idContabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContabilidad(String value) {
        this.idContabilidad = value;
    }

}
