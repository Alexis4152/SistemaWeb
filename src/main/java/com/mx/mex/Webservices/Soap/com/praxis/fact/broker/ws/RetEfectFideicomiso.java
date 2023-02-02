
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retEfectFideicomiso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retEfectFideicomiso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descRetRelPagFideic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montRetRelPagFideic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retEfectFideicomiso", propOrder = {
    "descRetRelPagFideic",
    "montRetRelPagFideic"
})
public class RetEfectFideicomiso {

    protected String descRetRelPagFideic;
    protected BigDecimal montRetRelPagFideic;

    /**
     * Obtiene el valor de la propiedad descRetRelPagFideic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRetRelPagFideic() {
        return descRetRelPagFideic;
    }

    /**
     * Define el valor de la propiedad descRetRelPagFideic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRetRelPagFideic(String value) {
        this.descRetRelPagFideic = value;
    }

    /**
     * Obtiene el valor de la propiedad montRetRelPagFideic.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontRetRelPagFideic() {
        return montRetRelPagFideic;
    }

    /**
     * Define el valor de la propiedad montRetRelPagFideic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontRetRelPagFideic(BigDecimal value) {
        this.montRetRelPagFideic = value;
    }

}
