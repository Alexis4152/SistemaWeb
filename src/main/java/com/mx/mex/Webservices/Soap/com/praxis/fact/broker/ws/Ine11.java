
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ine11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ine11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidadIne11" type="{http://ws.broker.fact.praxis.com/}entidadIne11" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idContabilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoComite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ine11", propOrder = {
    "entidadIne11",
    "idContabilidad",
    "tipoComite",
    "tipoProceso"
})
public class Ine11 {

    @XmlElement(nillable = true)
    protected List<EntidadIne11> entidadIne11;
    protected String idContabilidad;
    protected String tipoComite;
    protected String tipoProceso;

    /**
     * Gets the value of the entidadIne11 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entidadIne11 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntidadIne11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntidadIne11 }
     * 
     * 
     */
    public List<EntidadIne11> getEntidadIne11() {
        if (entidadIne11 == null) {
            entidadIne11 = new ArrayList<EntidadIne11>();
        }
        return this.entidadIne11;
    }

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

    /**
     * Obtiene el valor de la propiedad tipoComite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoComite() {
        return tipoComite;
    }

    /**
     * Define el valor de la propiedad tipoComite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoComite(String value) {
        this.tipoComite = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProceso(String value) {
        this.tipoProceso = value;
    }

}
