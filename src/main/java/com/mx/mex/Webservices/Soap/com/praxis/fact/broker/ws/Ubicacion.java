
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ubicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ubicacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distanciaRecorrida" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="domicilio" type="{http://ws.broker.fact.praxis.com/}domicilioCartaPorte" minOccurs="0"/>
 *         &lt;element name="fechaHoraSalidaLlegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="navegacionTrafico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEstacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreRemitenteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEstacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegIdTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residenciaFiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfcRemitenteDestinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEstacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubicacion", propOrder = {
    "distanciaRecorrida",
    "domicilio",
    "fechaHoraSalidaLlegada",
    "idUbicacion",
    "navegacionTrafico",
    "nombreEstacion",
    "nombreRemitenteDestinatario",
    "numEstacion",
    "numRegIdTrib",
    "residenciaFiscal",
    "rfcRemitenteDestinatario",
    "tipoEstacion",
    "tipoUbicacion"
})
public class Ubicacion {

    protected BigDecimal distanciaRecorrida;
    protected DomicilioCartaPorte domicilio;
    protected String fechaHoraSalidaLlegada;
    protected String idUbicacion;
    protected String navegacionTrafico;
    protected String nombreEstacion;
    protected String nombreRemitenteDestinatario;
    protected String numEstacion;
    protected String numRegIdTrib;
    protected String residenciaFiscal;
    protected String rfcRemitenteDestinatario;
    protected String tipoEstacion;
    protected String tipoUbicacion;

    /**
     * Obtiene el valor de la propiedad distanciaRecorrida.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    /**
     * Define el valor de la propiedad distanciaRecorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanciaRecorrida(BigDecimal value) {
        this.distanciaRecorrida = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link DomicilioCartaPorte }
     *     
     */
    public DomicilioCartaPorte getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link DomicilioCartaPorte }
     *     
     */
    public void setDomicilio(DomicilioCartaPorte value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraSalidaLlegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraSalidaLlegada() {
        return fechaHoraSalidaLlegada;
    }

    /**
     * Define el valor de la propiedad fechaHoraSalidaLlegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraSalidaLlegada(String value) {
        this.fechaHoraSalidaLlegada = value;
    }

    /**
     * Obtiene el valor de la propiedad idUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUbicacion() {
        return idUbicacion;
    }

    /**
     * Define el valor de la propiedad idUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUbicacion(String value) {
        this.idUbicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad navegacionTrafico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavegacionTrafico() {
        return navegacionTrafico;
    }

    /**
     * Define el valor de la propiedad navegacionTrafico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavegacionTrafico(String value) {
        this.navegacionTrafico = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    /**
     * Define el valor de la propiedad nombreEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstacion(String value) {
        this.nombreEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRemitenteDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRemitenteDestinatario() {
        return nombreRemitenteDestinatario;
    }

    /**
     * Define el valor de la propiedad nombreRemitenteDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRemitenteDestinatario(String value) {
        this.nombreRemitenteDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad numEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEstacion() {
        return numEstacion;
    }

    /**
     * Define el valor de la propiedad numEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEstacion(String value) {
        this.numEstacion = value;
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
     * Obtiene el valor de la propiedad rfcRemitenteDestinatario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcRemitenteDestinatario() {
        return rfcRemitenteDestinatario;
    }

    /**
     * Define el valor de la propiedad rfcRemitenteDestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcRemitenteDestinatario(String value) {
        this.rfcRemitenteDestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEstacion() {
        return tipoEstacion;
    }

    /**
     * Define el valor de la propiedad tipoEstacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEstacion(String value) {
        this.tipoEstacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoUbicacion() {
        return tipoUbicacion;
    }

    /**
     * Define el valor de la propiedad tipoUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoUbicacion(String value) {
        this.tipoUbicacion = value;
    }

}
