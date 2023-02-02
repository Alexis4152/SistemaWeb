
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoPagos20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoPagos20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pagos20" type="{http://ws.broker.fact.praxis.com/}Pago20" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totales" type="{http://ws.broker.fact.praxis.com/}totales" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoPagos20", propOrder = {
    "pagos20",
    "totales"
})
public class ComplementoPagos20 {

    @XmlElement(nillable = true)
    protected List<Pago20> pagos20;
    protected Totales totales;

    /**
     * Gets the value of the pagos20 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pagos20 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPagos20().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pago20 }
     * 
     * 
     */
    public List<Pago20> getPagos20() {
        if (pagos20 == null) {
            pagos20 = new ArrayList<Pago20>();
        }
        return this.pagos20;
    }

    /**
     * Obtiene el valor de la propiedad totales.
     * 
     * @return
     *     possible object is
     *     {@link Totales }
     *     
     */
    public Totales getTotales() {
        return totales;
    }

    /**
     * Define el valor de la propiedad totales.
     * 
     * @param value
     *     allowed object is
     *     {@link Totales }
     *     
     */
    public void setTotales(Totales value) {
        this.totales = value;
    }

}
