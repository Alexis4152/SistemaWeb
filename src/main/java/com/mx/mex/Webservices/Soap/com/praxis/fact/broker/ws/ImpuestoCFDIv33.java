
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestoCFDIv33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestoCFDIv33">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retenciones" type="{http://ws.broker.fact.praxis.com/}retencion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalImpuestosTrasladados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traslados" type="{http://ws.broker.fact.praxis.com/}trasladoCFDIv33" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestoCFDIv33", propOrder = {
    "retenciones",
    "totalImpuestosRetenidos",
    "totalImpuestosTrasladados",
    "traslados"
})
public class ImpuestoCFDIv33 {

    @XmlElement(nillable = true)
    protected List<Retencion> retenciones;
    protected String totalImpuestosRetenidos;
    protected String totalImpuestosTrasladados;
    @XmlElement(nillable = true)
    protected List<TrasladoCFDIv33> traslados;

    /**
     * Gets the value of the retenciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retenciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetenciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Retencion }
     * 
     * 
     */
    public List<Retencion> getRetenciones() {
        if (retenciones == null) {
            retenciones = new ArrayList<Retencion>();
        }
        return this.retenciones;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    /**
     * Define el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpuestosRetenidos(String value) {
        this.totalImpuestosRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosTrasladados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    /**
     * Define el valor de la propiedad totalImpuestosTrasladados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalImpuestosTrasladados(String value) {
        this.totalImpuestosTrasladados = value;
    }

    /**
     * Gets the value of the traslados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traslados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraslados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasladoCFDIv33 }
     * 
     * 
     */
    public List<TrasladoCFDIv33> getTraslados() {
        if (traslados == null) {
            traslados = new ArrayList<TrasladoCFDIv33>();
        }
        return this.traslados;
    }

}
