
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresosOEntradas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresosOEntradas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="integracIngresos" type="{http://ws.broker.fact.praxis.com/}integracIngresos" minOccurs="0"/>
 *         &lt;element name="montTotEntradasPeriodo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="partPropAcumDelFideicom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "ingresosOEntradas", propOrder = {
    "integracIngresos",
    "montTotEntradasPeriodo",
    "partPropAcumDelFideicom",
    "propDelMontTot"
})
public class IngresosOEntradas {

    protected IntegracIngresos integracIngresos;
    protected BigDecimal montTotEntradasPeriodo;
    protected BigDecimal partPropAcumDelFideicom;
    protected BigDecimal propDelMontTot;

    /**
     * Obtiene el valor de la propiedad integracIngresos.
     * 
     * @return
     *     possible object is
     *     {@link IntegracIngresos }
     *     
     */
    public IntegracIngresos getIntegracIngresos() {
        return integracIngresos;
    }

    /**
     * Define el valor de la propiedad integracIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegracIngresos }
     *     
     */
    public void setIntegracIngresos(IntegracIngresos value) {
        this.integracIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad montTotEntradasPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontTotEntradasPeriodo() {
        return montTotEntradasPeriodo;
    }

    /**
     * Define el valor de la propiedad montTotEntradasPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontTotEntradasPeriodo(BigDecimal value) {
        this.montTotEntradasPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad partPropAcumDelFideicom.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartPropAcumDelFideicom() {
        return partPropAcumDelFideicom;
    }

    /**
     * Define el valor de la propiedad partPropAcumDelFideicom.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartPropAcumDelFideicom(BigDecimal value) {
        this.partPropAcumDelFideicom = value;
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
