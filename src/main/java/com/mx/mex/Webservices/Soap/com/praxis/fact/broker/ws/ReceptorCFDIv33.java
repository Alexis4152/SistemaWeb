
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para receptorCFDIv33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="receptorCFDIv33">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="envioPDF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="envioXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receptorCFDIv33", propOrder = {
    "calle",
    "codigoPostal",
    "colonia",
    "emailContacto",
    "envioPDF",
    "envioXML",
    "estado",
    "localidad",
    "municipio",
    "noExterior",
    "noInterior",
    "nombre",
    "numRegIdTrib",
    "pais",
    "referencia",
    "residenciaFiscal",
    "rfc",
    "usoCFDI"
})
public class ReceptorCFDIv33 {

    protected String calle;
    protected String codigoPostal;
    protected String colonia;
    protected String emailContacto;
    protected String envioPDF;
    protected String envioXML;
    protected String estado;
    protected String localidad;
    protected String municipio;
    protected String noExterior;
    protected String noInterior;
    protected String nombre;
    protected String numRegIdTrib;
    protected String pais;
    protected String referencia;
    protected String residenciaFiscal;
    protected String rfc;
    protected String usoCFDI;

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad colonia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Define el valor de la propiedad colonia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColonia(String value) {
        this.colonia = value;
    }

    /**
     * Obtiene el valor de la propiedad emailContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContacto() {
        return emailContacto;
    }

    /**
     * Define el valor de la propiedad emailContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContacto(String value) {
        this.emailContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad envioPDF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvioPDF() {
        return envioPDF;
    }

    /**
     * Define el valor de la propiedad envioPDF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvioPDF(String value) {
        this.envioPDF = value;
    }

    /**
     * Obtiene el valor de la propiedad envioXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvioXML() {
        return envioXML;
    }

    /**
     * Define el valor de la propiedad envioXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvioXML(String value) {
        this.envioXML = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define el valor de la propiedad municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtiene el valor de la propiedad noExterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoExterior() {
        return noExterior;
    }

    /**
     * Define el valor de la propiedad noExterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExterior(String value) {
        this.noExterior = value;
    }

    /**
     * Obtiene el valor de la propiedad noInterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoInterior() {
        return noInterior;
    }

    /**
     * Define el valor de la propiedad noInterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoInterior(String value) {
        this.noInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegIdTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * Define el valor de la propiedad numRegIdTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegIdTrib(String value) {
        this.numRegIdTrib = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenciaFiscal() {
        return residenciaFiscal;
    }

    /**
     * Define el valor de la propiedad residenciaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenciaFiscal(String value) {
        this.residenciaFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad usoCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Define el valor de la propiedad usoCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

}
