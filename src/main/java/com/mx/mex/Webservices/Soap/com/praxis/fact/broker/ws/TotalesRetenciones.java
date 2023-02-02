
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para totalesRetenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="totalesRetenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impRetenidosRetenciones" type="{http://ws.broker.fact.praxis.com/}impRetenidosRetenciones" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="montoTotExent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTotGrav" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTotOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoTotRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalesRetenciones", propOrder = {
    "id",
    "impRetenidosRetenciones",
    "montoTotExent",
    "montoTotGrav",
    "montoTotOperacion",
    "montoTotRet"
})
public class TotalesRetenciones {

    protected Long id;
    @XmlElement(nillable = true)
    protected List<ImpRetenidosRetenciones> impRetenidosRetenciones;
    protected String montoTotExent;
    protected String montoTotGrav;
    protected String montoTotOperacion;
    protected String montoTotRet;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the impRetenidosRetenciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impRetenidosRetenciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpRetenidosRetenciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpRetenidosRetenciones }
     * 
     * 
     */
    public List<ImpRetenidosRetenciones> getImpRetenidosRetenciones() {
        if (impRetenidosRetenciones == null) {
            impRetenidosRetenciones = new ArrayList<ImpRetenidosRetenciones>();
        }
        return this.impRetenidosRetenciones;
    }

    /**
     * Obtiene el valor de la propiedad montoTotExent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotExent() {
        return montoTotExent;
    }

    /**
     * Define el valor de la propiedad montoTotExent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotExent(String value) {
        this.montoTotExent = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotGrav.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotGrav() {
        return montoTotGrav;
    }

    /**
     * Define el valor de la propiedad montoTotGrav.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotGrav(String value) {
        this.montoTotGrav = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotOperacion() {
        return montoTotOperacion;
    }

    /**
     * Define el valor de la propiedad montoTotOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotOperacion(String value) {
        this.montoTotOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoTotRet() {
        return montoTotRet;
    }

    /**
     * Define el valor de la propiedad montoTotRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoTotRet(String value) {
        this.montoTotRet = value;
    }

}
