
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para entidadSNCF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidadSNCF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montoRecursoPropio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="origenRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidadSNCF", propOrder = {
    "montoRecursoPropio",
    "origenRecurso"
})
public class EntidadSNCF {

    protected BigDecimal montoRecursoPropio;
    protected String origenRecurso;

    /**
     * Obtiene el valor de la propiedad montoRecursoPropio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoRecursoPropio() {
        return montoRecursoPropio;
    }

    /**
     * Define el valor de la propiedad montoRecursoPropio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoRecursoPropio(BigDecimal value) {
        this.montoRecursoPropio = value;
    }

    /**
     * Obtiene el valor de la propiedad origenRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenRecurso() {
        return origenRecurso;
    }

    /**
     * Define el valor de la propiedad origenRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenRecurso(String value) {
        this.origenRecurso = value;
    }

}
