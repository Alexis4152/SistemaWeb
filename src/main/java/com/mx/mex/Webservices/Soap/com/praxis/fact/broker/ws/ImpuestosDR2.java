
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para impuestosDR2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="impuestosDR2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retencionesDR" type="{http://ws.broker.fact.praxis.com/}retencionDR2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trasladosDR" type="{http://ws.broker.fact.praxis.com/}trasladoDR2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impuestosDR2", propOrder = {
    "retencionesDR",
    "trasladosDR"
})
public class ImpuestosDR2 {

    @XmlElement(nillable = true)
    protected List<RetencionDR2> retencionesDR;
    @XmlElement(nillable = true)
    protected List<TrasladoDR2> trasladosDR;

    /**
     * Gets the value of the retencionesDR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionesDR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionesDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencionDR2 }
     * 
     * 
     */
    public List<RetencionDR2> getRetencionesDR() {
        if (retencionesDR == null) {
            retencionesDR = new ArrayList<RetencionDR2>();
        }
        return this.retencionesDR;
    }

    /**
     * Gets the value of the trasladosDR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasladosDR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasladosDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasladoDR2 }
     * 
     * 
     */
    public List<TrasladoDR2> getTrasladosDR() {
        if (trasladosDR == null) {
            trasladosDR = new ArrayList<TrasladoDR2>();
        }
        return this.trasladosDR;
    }

}
