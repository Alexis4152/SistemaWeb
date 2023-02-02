
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementosNomina12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementosNomina12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complementoNomina12" type="{http://ws.broker.fact.praxis.com/}complementoNomina12" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementosNomina12", propOrder = {
    "complementoNomina12"
})
public class ComplementosNomina12 {

    @XmlElement(nillable = true)
    protected List<ComplementoNomina12> complementoNomina12;

    /**
     * Gets the value of the complementoNomina12 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementoNomina12 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementoNomina12().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplementoNomina12 }
     * 
     * 
     */
    public List<ComplementoNomina12> getComplementoNomina12() {
        if (complementoNomina12 == null) {
            complementoNomina12 = new ArrayList<ComplementoNomina12>();
        }
        return this.complementoNomina12;
    }

}
