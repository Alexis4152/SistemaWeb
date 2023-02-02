
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fideicomisonoempresarial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fideicomisonoempresarial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deduccOSalidas" type="{http://ws.broker.fact.praxis.com/}deduccOSalidas" minOccurs="0"/>
 *         &lt;element name="ingresosOEntradas" type="{http://ws.broker.fact.praxis.com/}ingresosOEntradas" minOccurs="0"/>
 *         &lt;element name="retEfectFideicomiso" type="{http://ws.broker.fact.praxis.com/}retEfectFideicomiso" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fideicomisonoempresarial", propOrder = {
    "deduccOSalidas",
    "ingresosOEntradas",
    "retEfectFideicomiso",
    "version"
})
public class Fideicomisonoempresarial {

    protected DeduccOSalidas deduccOSalidas;
    protected IngresosOEntradas ingresosOEntradas;
    protected RetEfectFideicomiso retEfectFideicomiso;
    protected String version;

    /**
     * Obtiene el valor de la propiedad deduccOSalidas.
     * 
     * @return
     *     possible object is
     *     {@link DeduccOSalidas }
     *     
     */
    public DeduccOSalidas getDeduccOSalidas() {
        return deduccOSalidas;
    }

    /**
     * Define el valor de la propiedad deduccOSalidas.
     * 
     * @param value
     *     allowed object is
     *     {@link DeduccOSalidas }
     *     
     */
    public void setDeduccOSalidas(DeduccOSalidas value) {
        this.deduccOSalidas = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosOEntradas.
     * 
     * @return
     *     possible object is
     *     {@link IngresosOEntradas }
     *     
     */
    public IngresosOEntradas getIngresosOEntradas() {
        return ingresosOEntradas;
    }

    /**
     * Define el valor de la propiedad ingresosOEntradas.
     * 
     * @param value
     *     allowed object is
     *     {@link IngresosOEntradas }
     *     
     */
    public void setIngresosOEntradas(IngresosOEntradas value) {
        this.ingresosOEntradas = value;
    }

    /**
     * Obtiene el valor de la propiedad retEfectFideicomiso.
     * 
     * @return
     *     possible object is
     *     {@link RetEfectFideicomiso }
     *     
     */
    public RetEfectFideicomiso getRetEfectFideicomiso() {
        return retEfectFideicomiso;
    }

    /**
     * Define el valor de la propiedad retEfectFideicomiso.
     * 
     * @param value
     *     allowed object is
     *     {@link RetEfectFideicomiso }
     *     
     */
    public void setRetEfectFideicomiso(RetEfectFideicomiso value) {
        this.retEfectFideicomiso = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
