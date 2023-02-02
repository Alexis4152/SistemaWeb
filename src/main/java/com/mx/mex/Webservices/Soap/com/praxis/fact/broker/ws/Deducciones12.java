
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deducciones12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deducciones12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deduccion" type="{http://ws.broker.fact.praxis.com/}deduccion12" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalImpuestosRetenidos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalOtrasDeducciones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deducciones12", propOrder = {
    "deduccion",
    "totalImpuestosRetenidos",
    "totalOtrasDeducciones"
})
public class Deducciones12 {

    @XmlElement(nillable = true)
    protected List<Deduccion12> deduccion;
    protected BigDecimal totalImpuestosRetenidos;
    protected BigDecimal totalOtrasDeducciones;

    /**
     * Gets the value of the deduccion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deduccion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeduccion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deduccion12 }
     * 
     * 
     */
    public List<Deduccion12> getDeduccion() {
        if (deduccion == null) {
            deduccion = new ArrayList<Deduccion12>();
        }
        return this.deduccion;
    }

    /**
     * Obtiene el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalImpuestosRetenidos() {
        return totalImpuestosRetenidos;
    }

    /**
     * Define el valor de la propiedad totalImpuestosRetenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalImpuestosRetenidos(BigDecimal value) {
        this.totalImpuestosRetenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOtrasDeducciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOtrasDeducciones() {
        return totalOtrasDeducciones;
    }

    /**
     * Define el valor de la propiedad totalOtrasDeducciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOtrasDeducciones(BigDecimal value) {
        this.totalOtrasDeducciones = value;
    }

}
