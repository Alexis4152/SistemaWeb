
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trasladosDR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trasladosDR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trasladoDR" type="{http://ws.broker.fact.praxis.com/}trasladoDR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trasladosDR", propOrder = {
    "trasladoDR"
})
public class TrasladosDR {

    @XmlElement(nillable = true)
    protected List<TrasladoDR> trasladoDR;

    /**
     * Gets the value of the trasladoDR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trasladoDR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrasladoDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrasladoDR }
     * 
     * 
     */
    public List<TrasladoDR> getTrasladoDR() {
        if (trasladoDR == null) {
            trasladoDR = new ArrayList<TrasladoDR>();
        }
        return this.trasladoDR;
    }

}
