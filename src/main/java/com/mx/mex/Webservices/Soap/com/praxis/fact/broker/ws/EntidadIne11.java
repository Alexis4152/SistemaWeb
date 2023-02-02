
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para entidadIne11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="entidadIne11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ambito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contabilidadIne11" type="{http://ws.broker.fact.praxis.com/}contabilidadIne11" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entidadIne11", propOrder = {
    "ambito",
    "claveEntidad",
    "contabilidadIne11"
})
public class EntidadIne11 {

    protected String ambito;
    protected String claveEntidad;
    @XmlElement(nillable = true)
    protected List<ContabilidadIne11> contabilidadIne11;

    /**
     * Obtiene el valor de la propiedad ambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbito() {
        return ambito;
    }

    /**
     * Define el valor de la propiedad ambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbito(String value) {
        this.ambito = value;
    }

    /**
     * Obtiene el valor de la propiedad claveEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveEntidad() {
        return claveEntidad;
    }

    /**
     * Define el valor de la propiedad claveEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveEntidad(String value) {
        this.claveEntidad = value;
    }

    /**
     * Gets the value of the contabilidadIne11 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contabilidadIne11 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContabilidadIne11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContabilidadIne11 }
     * 
     * 
     */
    public List<ContabilidadIne11> getContabilidadIne11() {
        if (contabilidadIne11 == null) {
            contabilidadIne11 = new ArrayList<ContabilidadIne11>();
        }
        return this.contabilidadIne11;
    }

}
