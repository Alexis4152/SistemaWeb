
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para figuraTransporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="figuraTransporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposFigura" type="{http://ws.broker.fact.praxis.com/}tiposFigura" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "figuraTransporte", propOrder = {
    "tiposFigura"
})
public class FiguraTransporte {

    @XmlElement(nillable = true)
    protected List<TiposFigura> tiposFigura;

    /**
     * Gets the value of the tiposFigura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposFigura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposFigura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposFigura }
     * 
     * 
     */
    public List<TiposFigura> getTiposFigura() {
        if (tiposFigura == null) {
            tiposFigura = new ArrayList<TiposFigura>();
        }
        return this.tiposFigura;
    }

}
