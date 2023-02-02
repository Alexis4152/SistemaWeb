
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retencionesDR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retencionesDR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retencionDR" type="{http://ws.broker.fact.praxis.com/}retencionDR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retencionesDR", propOrder = {
    "retencionDR"
})
public class RetencionesDR {

    @XmlElement(nillable = true)
    protected List<RetencionDR> retencionDR;

    /**
     * Gets the value of the retencionDR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retencionDR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetencionDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetencionDR }
     * 
     * 
     */
    public List<RetencionDR> getRetencionDR() {
        if (retencionDR == null) {
            retencionDR = new ArrayList<RetencionDR>();
        }
        return this.retencionDR;
    }

}
