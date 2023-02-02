
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para otrosPagos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="otrosPagos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otroPago" type="{http://ws.broker.fact.praxis.com/}otroPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otrosPagos", propOrder = {
    "otroPago"
})
public class OtrosPagos {

    @XmlElement(nillable = true)
    protected List<OtroPago> otroPago;

    /**
     * Gets the value of the otroPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otroPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtroPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtroPago }
     * 
     * 
     */
    public List<OtroPago> getOtroPago() {
        if (otroPago == null) {
            otroPago = new ArrayList<OtroPago>();
        }
        return this.otroPago;
    }

}
