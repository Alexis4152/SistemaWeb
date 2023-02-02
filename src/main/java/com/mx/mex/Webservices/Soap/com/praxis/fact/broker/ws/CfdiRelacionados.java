
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cfdiRelacionados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cfdiRelacionados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfdiRelacionado" type="{http://ws.broker.fact.praxis.com/}cfdiRelacionado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfdiRelacionados", propOrder = {
    "cfdiRelacionado",
    "tipoRelacion"
})
public class CfdiRelacionados {

    @XmlElement(nillable = true)
    protected List<CfdiRelacionado> cfdiRelacionado;
    protected String tipoRelacion;

    /**
     * Gets the value of the cfdiRelacionado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfdiRelacionado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfdiRelacionado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CfdiRelacionado }
     * 
     * 
     */
    public List<CfdiRelacionado> getCfdiRelacionado() {
        if (cfdiRelacionado == null) {
            cfdiRelacionado = new ArrayList<CfdiRelacionado>();
        }
        return this.cfdiRelacionado;
    }

    /**
     * Obtiene el valor de la propiedad tipoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRelacion() {
        return tipoRelacion;
    }

    /**
     * Define el valor de la propiedad tipoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRelacion(String value) {
        this.tipoRelacion = value;
    }

}
