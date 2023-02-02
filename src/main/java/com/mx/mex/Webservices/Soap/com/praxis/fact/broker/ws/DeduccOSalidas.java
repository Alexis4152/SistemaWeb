
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deduccOSalidas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deduccOSalidas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integracEgresos" type="{http://ws.broker.fact.praxis.com/}integracEgresos" minOccurs="0"/>
 *         &lt;element name="montTotEgresPeriodo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="partPropDelFideicom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="propDelMontTot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deduccOSalidas", propOrder = {
    "integracEgresos",
    "montTotEgresPeriodo",
    "partPropDelFideicom",
    "propDelMontTot"
})
public class DeduccOSalidas {

    protected IntegracEgresos integracEgresos;
    protected BigDecimal montTotEgresPeriodo;
    protected BigDecimal partPropDelFideicom;
    protected BigDecimal propDelMontTot;

    /**
     * Obtiene el valor de la propiedad integracEgresos.
     * 
     * @return
     *     possible object is
     *     {@link IntegracEgresos }
     *     
     */
    public IntegracEgresos getIntegracEgresos() {
        return integracEgresos;
    }

    /**
     * Define el valor de la propiedad integracEgresos.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegracEgresos }
     *     
     */
    public void setIntegracEgresos(IntegracEgresos value) {
        this.integracEgresos = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotEgresPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontTotEgresPeriodo() {
        return montTotEgresPeriodo;
    }

    /**
     * Define el valor de la propiedad montTotEgresPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontTotEgresPeriodo(BigDecimal value) {
        this.montTotEgresPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad partPropDelFideicom.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartPropDelFideicom() {
        return partPropDelFideicom;
    }

    /**
     * Define el valor de la propiedad partPropDelFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartPropDelFideicom(BigDecimal value) {
        this.partPropDelFideicom = value;
    }

    /**
     * Obtiene el valor de la propiedad propDelMontTot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropDelMontTot() {
        return propDelMontTot;
    }

    /**
     * Define el valor de la propiedad propDelMontTot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropDelMontTot(BigDecimal value) {
        this.propDelMontTot = value;
    }

}
