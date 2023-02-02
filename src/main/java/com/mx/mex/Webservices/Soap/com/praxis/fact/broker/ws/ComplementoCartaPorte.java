
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para complementoCartaPorte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="complementoCartaPorte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entradaSalidaMerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="figuraTransporte" type="{http://ws.broker.fact.praxis.com/}figuraTransporte" minOccurs="0"/>
 *         &lt;element name="mercancias" type="{http://ws.broker.fact.praxis.com/}mercanciasCartaPorte" minOccurs="0"/>
 *         &lt;element name="paisOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDistRec" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="transpInternac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicaciones" type="{http://ws.broker.fact.praxis.com/}ubicaciones" minOccurs="0"/>
 *         &lt;element name="viaEntradaSalida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complementoCartaPorte", propOrder = {
    "entradaSalidaMerc",
    "figuraTransporte",
    "mercancias",
    "paisOrigenDestino",
    "totalDistRec",
    "transpInternac",
    "ubicaciones",
    "viaEntradaSalida"
})
public class ComplementoCartaPorte {

    protected String entradaSalidaMerc;
    protected FiguraTransporte figuraTransporte;
    protected MercanciasCartaPorte mercancias;
    protected String paisOrigenDestino;
    protected BigDecimal totalDistRec;
    protected String transpInternac;
    protected Ubicaciones ubicaciones;
    protected String viaEntradaSalida;

    /**
     * Obtiene el valor de la propiedad entradaSalidaMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * Define el valor de la propiedad entradaSalidaMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntradaSalidaMerc(String value) {
        this.entradaSalidaMerc = value;
    }

    /**
     * Obtiene el valor de la propiedad figuraTransporte.
     * 
     * @return
     *     possible object is
     *     {@link FiguraTransporte }
     *     
     */
    public FiguraTransporte getFiguraTransporte() {
        return figuraTransporte;
    }

    /**
     * Define el valor de la propiedad figuraTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link FiguraTransporte }
     *     
     */
    public void setFiguraTransporte(FiguraTransporte value) {
        this.figuraTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad mercancias.
     * 
     * @return
     *     possible object is
     *     {@link MercanciasCartaPorte }
     *     
     */
    public MercanciasCartaPorte getMercancias() {
        return mercancias;
    }

    /**
     * Define el valor de la propiedad mercancias.
     * 
     * @param value
     *     allowed object is
     *     {@link MercanciasCartaPorte }
     *     
     */
    public void setMercancias(MercanciasCartaPorte value) {
        this.mercancias = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigenDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    /**
     * Define el valor de la propiedad paisOrigenDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigenDestino(String value) {
        this.paisOrigenDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDistRec.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * Define el valor de la propiedad totalDistRec.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDistRec(BigDecimal value) {
        this.totalDistRec = value;
    }

    /**
     * Obtiene el valor de la propiedad transpInternac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * Define el valor de la propiedad transpInternac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranspInternac(String value) {
        this.transpInternac = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicaciones.
     * 
     * @return
     *     possible object is
     *     {@link Ubicaciones }
     *     
     */
    public Ubicaciones getUbicaciones() {
        return ubicaciones;
    }

    /**
     * Define el valor de la propiedad ubicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicaciones }
     *     
     */
    public void setUbicaciones(Ubicaciones value) {
        this.ubicaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad viaEntradaSalida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * Define el valor de la propiedad viaEntradaSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaEntradaSalida(String value) {
        this.viaEntradaSalida = value;
    }

}
