
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestoConcepto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestoConcepto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retenciones" type="{http://ws.broker.fact.praxis.com/}retencionConcepto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trasladados" type="{http://ws.broker.fact.praxis.com/}trasladoConcepto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestoConcepto", propOrder = {
    "retenciones",
    "trasladados"
})
public class ImpuestoConcepto {

    @XmlElement(nillable = true)
    protected List<RetencionConcepto> retenciones;
    @XmlElement(nillable = true)
    protected List<TrasladoConcepto> trasladados;

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
     * {@link RetencionConcepto }
     * 
     * 
     */
    public List<RetencionConcepto> getRetenciones() {
        if (retenciones == null) {
            retenciones = new ArrayList<RetencionConcepto>();
        }
        return this.retenciones;
    }

    /**
     * Gets the value of the trasladados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasladados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasladados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasladoConcepto }
     * 
     * 
     */
    public List<TrasladoConcepto> getTrasladados() {
        if (trasladados == null) {
            trasladados = new ArrayList<TrasladoConcepto>();
        }
        return this.trasladados;
    }

}
