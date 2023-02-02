
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaFacturaDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaFacturaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivoPDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="archivoPDFNotaCredito" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="archivoXML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="archivoXMLNotaCredito" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="facturaGenerada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="folioPeticion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="respuestaDTO" type="{http://ws.broker.fact.praxis.com/}respuestaDTO" minOccurs="0"/>
 *         &lt;element name="serieFolioComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serieFolioNc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaFacturaDTO", propOrder = {
    "archivoPDF",
    "archivoPDFNotaCredito",
    "archivoXML",
    "archivoXMLNotaCredito",
    "facturaGenerada",
    "folioPeticion",
    "respuestaDTO",
    "serieFolioComp",
    "serieFolioNc"
})
public class RespuestaFacturaDTO {

    protected byte[] archivoPDF;
    protected byte[] archivoPDFNotaCredito;
    protected byte[] archivoXML;
    protected byte[] archivoXMLNotaCredito;
    protected boolean facturaGenerada;
    protected Integer folioPeticion;
    protected RespuestaDTO respuestaDTO;
    protected String serieFolioComp;
    protected String serieFolioNc;

    /**
     * Obtiene el valor de la propiedad archivoPDF.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoPDF() {
        return archivoPDF;
    }

    /**
     * Define el valor de la propiedad archivoPDF.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoPDF(byte[] value) {
        this.archivoPDF = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoPDFNotaCredito.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoPDFNotaCredito() {
        return archivoPDFNotaCredito;
    }

    /**
     * Define el valor de la propiedad archivoPDFNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoPDFNotaCredito(byte[] value) {
        this.archivoPDFNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoXML.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXML() {
        return archivoXML;
    }

    /**
     * Define el valor de la propiedad archivoXML.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXML(byte[] value) {
        this.archivoXML = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoXMLNotaCredito.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getArchivoXMLNotaCredito() {
        return archivoXMLNotaCredito;
    }

    /**
     * Define el valor de la propiedad archivoXMLNotaCredito.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setArchivoXMLNotaCredito(byte[] value) {
        this.archivoXMLNotaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaGenerada.
     * 
     */
    public boolean isFacturaGenerada() {
        return facturaGenerada;
    }

    /**
     * Define el valor de la propiedad facturaGenerada.
     * 
     */
    public void setFacturaGenerada(boolean value) {
        this.facturaGenerada = value;
    }

    /**
     * Obtiene el valor de la propiedad folioPeticion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolioPeticion() {
        return folioPeticion;
    }

    /**
     * Define el valor de la propiedad folioPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolioPeticion(Integer value) {
        this.folioPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaDTO.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTO }
     *     
     */
    public RespuestaDTO getRespuestaDTO() {
        return respuestaDTO;
    }

    /**
     * Define el valor de la propiedad respuestaDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTO }
     *     
     */
    public void setRespuestaDTO(RespuestaDTO value) {
        this.respuestaDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFolioComp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFolioComp() {
        return serieFolioComp;
    }

    /**
     * Define el valor de la propiedad serieFolioComp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFolioComp(String value) {
        this.serieFolioComp = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFolioNc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieFolioNc() {
        return serieFolioNc;
    }

    /**
     * Define el valor de la propiedad serieFolioNc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieFolioNc(String value) {
        this.serieFolioNc = value;
    }

}
