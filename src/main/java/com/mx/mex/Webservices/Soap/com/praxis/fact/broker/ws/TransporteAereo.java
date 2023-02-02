
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transporteAereo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transporteAereo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTransportista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaAeronave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAseg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPermisoSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPolizaSeguro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegIdTribEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroGuia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permSCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residenciaFiscalEmbarc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcEmbarcador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transporteAereo", propOrder = {
    "codigoTransportista",
    "lugarContrato",
    "matriculaAeronave",
    "nombreAseg",
    "nombreEmbarcador",
    "numPermisoSCT",
    "numPolizaSeguro",
    "numRegIdTribEmbarc",
    "numeroGuia",
    "permSCT",
    "residenciaFiscalEmbarc",
    "rfcEmbarcador"
})
public class TransporteAereo {

    protected String codigoTransportista;
    protected String lugarContrato;
    protected String matriculaAeronave;
    protected String nombreAseg;
    protected String nombreEmbarcador;
    protected String numPermisoSCT;
    protected String numPolizaSeguro;
    protected String numRegIdTribEmbarc;
    protected String numeroGuia;
    protected String permSCT;
    protected String residenciaFiscalEmbarc;
    protected String rfcEmbarcador;

    /**
     * Obtiene el valor de la propiedad codigoTransportista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTransportista() {
        return codigoTransportista;
    }

    /**
     * Define el valor de la propiedad codigoTransportista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTransportista(String value) {
        this.codigoTransportista = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarContrato() {
        return lugarContrato;
    }

    /**
     * Define el valor de la propiedad lugarContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarContrato(String value) {
        this.lugarContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculaAeronave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAeronave() {
        return matriculaAeronave;
    }

    /**
     * Define el valor de la propiedad matriculaAeronave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAeronave(String value) {
        this.matriculaAeronave = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAseg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAseg() {
        return nombreAseg;
    }

    /**
     * Define el valor de la propiedad nombreAseg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAseg(String value) {
        this.nombreAseg = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmbarcador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmbarcador() {
        return nombreEmbarcador;
    }

    /**
     * Define el valor de la propiedad nombreEmbarcador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmbarcador(String value) {
        this.nombreEmbarcador = value;
    }

    /**
     * Obtiene el valor de la propiedad numPermisoSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * Define el valor de la propiedad numPermisoSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPermisoSCT(String value) {
        this.numPermisoSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad numPolizaSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPolizaSeguro() {
        return numPolizaSeguro;
    }

    /**
     * Define el valor de la propiedad numPolizaSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPolizaSeguro(String value) {
        this.numPolizaSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTribEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTribEmbarc() {
        return numRegIdTribEmbarc;
    }

    /**
     * Define el valor de la propiedad numRegIdTribEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTribEmbarc(String value) {
        this.numRegIdTribEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuia() {
        return numeroGuia;
    }

    /**
     * Define el valor de la propiedad numeroGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuia(String value) {
        this.numeroGuia = value;
    }

    /**
     * Obtiene el valor de la propiedad permSCT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * Define el valor de la propiedad permSCT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermSCT(String value) {
        this.permSCT = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscalEmbarc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscalEmbarc() {
        return residenciaFiscalEmbarc;
    }

    /**
     * Define el valor de la propiedad residenciaFiscalEmbarc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscalEmbarc(String value) {
        this.residenciaFiscalEmbarc = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmbarcador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmbarcador() {
        return rfcEmbarcador;
    }

    /**
     * Define el valor de la propiedad rfcEmbarcador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmbarcador(String value) {
        this.rfcEmbarcador = value;
    }

}
