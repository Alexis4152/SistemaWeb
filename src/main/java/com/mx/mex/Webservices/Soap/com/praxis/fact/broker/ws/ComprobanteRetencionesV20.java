
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comprobanteRetencionesV20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comprobanteRetencionesV20">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.broker.fact.praxis.com/}comprobanteRetenciones">
 *       &lt;sequence>
 *         &lt;element name="cfdiCompRelacionados" type="{http://ws.broker.fact.praxis.com/}cfdiComprobantesRelacionados" minOccurs="0"/>
 *         &lt;element name="lugarExpRetenc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalesRetenciones20" type="{http://ws.broker.fact.praxis.com/}totalesRetenciones20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comprobanteRetencionesV20", propOrder = {
    "cfdiCompRelacionados",
    "lugarExpRetenc",
    "totalesRetenciones20"
})
public class ComprobanteRetencionesV20
    extends ComprobanteRetenciones
{

    protected CfdiComprobantesRelacionados cfdiCompRelacionados;
    protected String lugarExpRetenc;
    protected TotalesRetenciones20 totalesRetenciones20;

    /**
     * Obtiene el valor de la propiedad cfdiCompRelacionados.
     * 
     * @return
     *     possible object is
     *     {@link CfdiComprobantesRelacionados }
     *     
     */
    public CfdiComprobantesRelacionados getCfdiCompRelacionados() {
        return cfdiCompRelacionados;
    }

    /**
     * Define el valor de la propiedad cfdiCompRelacionados.
     * 
     * @param value
     *     allowed object is
     *     {@link CfdiComprobantesRelacionados }
     *     
     */
    public void setCfdiCompRelacionados(CfdiComprobantesRelacionados value) {
        this.cfdiCompRelacionados = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpRetenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpRetenc() {
        return lugarExpRetenc;
    }

    /**
     * Define el valor de la propiedad lugarExpRetenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpRetenc(String value) {
        this.lugarExpRetenc = value;
    }

    /**
     * Obtiene el valor de la propiedad totalesRetenciones20.
     * 
     * @return
     *     possible object is
     *     {@link TotalesRetenciones20 }
     *     
     */
    public TotalesRetenciones20 getTotalesRetenciones20() {
        return totalesRetenciones20;
    }

    /**
     * Define el valor de la propiedad totalesRetenciones20.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalesRetenciones20 }
     *     
     */
    public void setTotalesRetenciones20(TotalesRetenciones20 value) {
        this.totalesRetenciones20 = value;
    }

}
