
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestosLocales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestosLocales">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retencionesLocales" type="{http://ws.broker.fact.praxis.com/}retencionLocal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRetenciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTraslados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trasladadosLocales" type="{http://ws.broker.fact.praxis.com/}traslado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosLocales", propOrder = {
    "retencionesLocales",
    "totalRetenciones",
    "totalTraslados",
    "trasladadosLocales"
})
public class ImpuestosLocales {

    @XmlElement(nillable = true)
    protected List<RetencionLocal> retencionesLocales;
    protected String totalRetenciones;
    protected String totalTraslados;
    @XmlElement(nillable = true)
    protected List<Traslado> trasladadosLocales;

    /**
     * Gets the value of the retencionesLocales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionesLocales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionesLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencionLocal }
     * 
     * 
     */
    public List<RetencionLocal> getRetencionesLocales() {
        if (retencionesLocales == null) {
            retencionesLocales = new ArrayList<RetencionLocal>();
        }
        return this.retencionesLocales;
    }

    /**
     * Obtiene el valor de la propiedad totalRetenciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRetenciones() {
        return totalRetenciones;
    }

    /**
     * Define el valor de la propiedad totalRetenciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRetenciones(String value) {
        this.totalRetenciones = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTraslados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTraslados() {
        return totalTraslados;
    }

    /**
     * Define el valor de la propiedad totalTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTraslados(String value) {
        this.totalTraslados = value;
    }

    /**
     * Gets the value of the trasladadosLocales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasladadosLocales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasladadosLocales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traslado }
     * 
     * 
     */
    public List<Traslado> getTrasladadosLocales() {
        if (trasladadosLocales == null) {
            trasladadosLocales = new ArrayList<Traslado>();
        }
        return this.trasladadosLocales;
    }

}
