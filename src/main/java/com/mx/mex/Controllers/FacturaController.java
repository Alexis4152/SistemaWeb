package com.mx.mex.Controllers;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.mex.Webservices.Soap.Client.ServicioEfactura;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.ComprobanteCFDIv40;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.ConceptoCFDIv40;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.Credenciales;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.EfacturaService;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.ImpuestoCFDIv40;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.ImpuestoConcepto2;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.ReceptorCFDIv40;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.TrasladoConcepto2;

@Controller
@RequestMapping("Factura")
public class FacturaController {
	
	//DecimalFormat df = new DecimalFormat("0.00");
    
    //@RequestBody String factura
	@ResponseBody
	@RequestMapping(value="/generarFactura", method = RequestMethod.GET, 
	produces = "application/json") //= select * from Aspirantes
	String generarFactura() {
        //ResponseDto response = new ResponseDto();
        //ContribuyentesView contribuyente = new ContribuyentesView();

        //UsuariosComercioDto filterDto = new UsuariosComercioDto();

        ComprobanteCFDIv40 comprobante = new ComprobanteCFDIv40();
        
        ConceptoCFDIv40 conceptos = new ConceptoCFDIv40(); 
        
        ImpuestoConcepto2 impuestosConceptos=null;
        
        TrasladoConcepto2 trasladados;
        
        ImpuestoCFDIv40 impuestoComprobante=null;
        
        TrasladoConcepto2 traslados;
        
        ReceptorCFDIv40 receptor = new ReceptorCFDIv40();
        
        Credenciales credenciales = new Credenciales();
        
        // FacturaDto usuarioCodigo = new FacturaDto();

        // FacturaDto montoTraIdTipoPago = new FacturaDto();

        //df.setRoundingMode(RoundingMode.HALF_UP);
        
        /*Double valorPorPieza=0.0,importePorIva=0.0,totalImpuestosTrasladados=0.0,total=0.0;

        boolean saveResponse=false,existeTasa=false,existeCuota=false;

        Map<String, Double> bases= new HashMap<String, Double>();
    
        Map<String, Double> importes =new HashMap<String, Double>();
    
        List<String> combinacionesImpuestos = new ArrayList<>();*/
        
        String respuestaFactura ="";
        //LOGGER.info("INICIA FACTURA ELECTRONICA");
         /*TASA CON IVA OLO SON VALORES FIJOS
                     TASA CON IEPS SOLO SON VALORES FIJOS
                     CUOTA NO VA CON IVA
                     CUOTA CON IEPS CON RANGO DE 0.000000 A 59.144900 
                     EXENTO CON IVA
                     EXENTO CON IEPS

                     MARCAR ESTAS VALIDACIONES A LA HORA DE AGREGAR PRODUCTOS*/
        try {
              //VALIDAR QUE EL TICKET AÚN SEA VIGENTE, ES DECIR, LA FECHA DEL TICKET NO DEBE SER MAYOR A 30 DÍAS
              //SINO ES VIGENTE NO LE PERMITE FACTURA, 
             
                //String respuestaTicket = facturaElectronicaService.ticketValido(factura.getIdTicket());
                //if(respuestaTicket.equals("Ticket vencido, no se puede facturar")){
                  //  response.setCode(-1);
                  //  response.setMessage("El ticket ha vencido, no se puede facturar");
                //}
                //else{ //SI ES VIGENTE,  
                    //LOGGER.info("El ticket: "+factura.getIdTicket()+" es vigente");
                    
                    //if(contribuyenteValido(contribuyente)){//ACTUALIZA O AGREGA EL RFC Y GENERA LA FACTURA
                        //saveResponse= facturaElectronicaService.saveContribuyente(contribuyente);
                        //LOGGER.info("Se guarda el contribuyente");
                        EfacturaService soap =ServicioEfactura.getIntance().getProxy();
                        
                        //SE OBTIENE USUARIO Y CODIGO POSTAL DEL TICKET
                        //usuarioCodigo=facturaElectronicaService.getUsuarioFromTicket(factura.getIdTicket()); //OBTIENE EL USUARIO DEL TICKET
                        //filterDto.setUsuUsuario(Integer.parseInt(usuarioCodigo.getUsuario()));
                        //SE OBTIENE EL COMERCIO AL CUAL PERTENECE EL USUARIO
                        //List<UsuariosComercio> lstUserComerce = usuariosComercioBo.findByFilter(filterDto); //SE MANDA EL USUARIO PARA OBTENER EL COMERCIO
                        //Long comercioId =lstUserComerce.get(0).getComercios().getId().getComId();
                        /*if(!lstUserComerce.isEmpty()){
                            comprobante.setLugarExpedicion(usuarioCodigo.getCodigo());
                        }
                        else*/
                        comprobante.setLugarExpedicion("76803"); // ASIGNA EL CODIGO POSTAL DE DONDE SE FACTURA
                        //LOGGER.info("LugarExpedicion: "+comprobante.getLugarExpedicion());
                        //SE OBTIENE EL TIPO DE PAGO, MONTO SUBTOTAL Y LA TRANSACCIÓN
                        //montoTraIdTipoPago = facturaElectronicaService.getTipoPagoMontoTraid(factura.getIdTicket()); 
                        comprobante.setFolio("1001"); //SE MANDA NUMERO DE TICKET
                        //LOGGER.info("Folio: "+comprobante.getFolio());
                        comprobante.setSerie("F");
                        //LOGGER.info("Serie: "+comprobante.getSerie());
                        comprobante.setMetodoDePago("PUE"); //PAGO EN UNA SOLA EXHIBICIÓN
                        //LOGGER.info("MetodoDePago: "+comprobante.getMetodoDePago());
                        comprobante.setMoneda("MXN"); //MONEDA MEXICANA
                        //LOGGER.info("Moneda: "+comprobante.getMoneda());
                        comprobante.setExportacion("01"); //NO HAY EXPORTACIÓN
                        //LOGGER.info("Exportacion: "+comprobante.getExportacion());
                        comprobante.setFormaDePago("01");//CON QUERY 1
                        //LOGGER.info("FormaDePago: "+comprobante.getFormaDePago());
                        //DETERMINAR POR EL VALOR DEL TIPO FACTOR SI APLICA PARA IMPUESTOS
                        //DETALLE DE LA COMPRA

                        //(01) No objeto de impuesto: La partida no refleja ningún tipo de impuesto, un ejemplo según la ley del IVA sería por actos o actividades en las que el contribuyente no las realiza en territorio nacional. 
                        //(02) Sí objeto del impuesto: La partida si refleja el/los impuestos, es el más común y según la ley del IVA sería por actos o actividades que el contribuyente realiza en territorio nacional como:
                        /*Enajenación de bienes.
                          Prestación de servicios independientes.
                          Importación de bienes o servicios.
                          Prestación de bienes para su uso o gozo temporal. */
                        //(03) Sí objeto del impuesto y no obligado al desglose: La partida no refleja ningún tipo de impuesto, se utiliza cuando la actividad si puede llevar impuestos, pero según algunos decretos fiscales se tiene la
                        //posibilidad de no desglosar el impuesto, un ejemplo sería la facilidad que tienen los contribuyentes en el régimen RIF para no desglosar IVA en operaciones al público en general. 
                        //Lo decide el comercio que va a factura
                        //List<ConceptosView> conceptosDto=facturaElectronicaService.getConceptos(montoTraIdTipoPago.getTraId(), new BigDecimal(comercioId));
                        //LOGGER.info("Se obtuvieron: "+conceptosDto.size()+" conceptos");
                        //for(ConceptosView concep : conceptosDto){//INICIO DEL FOR CONCEPTOS
                            //LOGGER.info("STRING: "+concep.toString());
                            conceptos.setObjetoImp("02"); //APLICA PARA IMPUESTOS CON QUERY 2
                            //LOGGER.info("ObjetoImp: "+conceptos.getObjetoImp());

                            //SINO APLICA PARA IMPUESTOS: 01 O 03, NO DEBE MOSTRAR LA PARTE DE LOS IMPUESTOS
                            //Y NO SERÁ CONSIDERADO PARA EL TOTAL DE IMPUESTOS TRASLADADOS
                            //ADICIONAL SI ES EXENTO, ESTE NO SERA CONSIDERADO ALGÚN IMPUESTO, SIMPLEMENTE SE TOMA EL VALOR DEL IMPORTE PARA LA FACTURA MÁS NO SUS IMPUESTOS
                            //UNICAMENTE TASA Y CUOTA DONDE CUOTA SIEMPRE VA CON IEPS,
                            //TASA PUEDE IR CON IVA E IEPS
                            conceptos.setDescripcion("Miguelito");//NOMBRE DEL PRODUCTO
                            //LOGGER.info("Descripcion: "+conceptos.getDescripcion());
                            conceptos.setCantidad("10");
                            //LOGGER.info("Cantidad: "+conceptos.getCantidad());
                            conceptos.setValorUnitario("100");
                            //LOGGER.info("ValorUnitario: "+conceptos.getValorUnitario());
                            //valorPorPieza=Double.parseDouble(conceptos.getCantidad())*Double.parseDouble(conceptos.getValorUnitario()); 
                            conceptos.setImporte("1000");
                            //LOGGER.info("Importe: "+conceptos.getImporte());
                            conceptos.setClaveProdServ("01010101");
                            //LOGGER.info("ClaveProdServ: "+conceptos.getClaveProdServ());
                            conceptos.setClaveUnidad("H87");
                            //LOGGER.info("ClaveUnidad: "+conceptos.getClaveUnidad());
                           
                            //SE AGREGAN LOS IMPUESTOS A NIVEL CONCEPTO
                            //if(conceptos.getObjetoImp().equals("02")){
                                //LOGGER.info("Si aplica a impuestos");
                                impuestosConceptos = new ImpuestoConcepto2();

                                //List<String> ivaOIeps = new ArrayList<>();

                                /*ivaOIeps.add((concep.getTipoFactorIva()!=null ? "IVA": "NI")+"|"+concep.getTipoFactorIva()+"|"+concep.getIva());
                                ivaOIeps.add((concep.getTipoFactorIeps()!=null ? "IEPS": "NIE")+"|"+concep.getTipoFactorIeps()+"|"+concep.getIeps());
                             */
                                //for(String IvaIeps : ivaOIeps){
                                    //String[] ivaIepsString=IvaIeps.split("\\|");
                                    trasladados = new TrasladoConcepto2();

                                    trasladados.setBase("1000");
                                    
                                    //if(ivaIepsString[0].equals("IVA")){//if(concep.getTipoFactorIva()!=null){
                                    trasladados.setImpuesto("002"); //IVA, ISR NO APLICA
                                    //LOGGER.info("IVA, se asigna 002");
                                    trasladados.setTipoFactor("Tasa");//trasladados.setTipoFactor(concep.getTipoFactorIva());
                                    //LOGGER.info("Tipo Factor: "+trasladados.getTipoFactor());
                                    //String llave = trasladados.getImpuesto()+"|"+trasladados.getTipoFactor();
                                    trasladados.setTasaOCuota("0.160000");//concep.getIva())); //AÑADIR 0s DESPUES DEL PUNTO, HASTA COMPLETAR 6 POSICIONES
                                    
                                    //LOGGER.info("TasaOCuota: "+trasladados.getTasaOCuota());
                                    
                                    trasladados.setImporte("160");// IMPORTE MULTIPLICADO POR EL VALOR DE IVA O IEPS
                                    
                                    //LOGGER.info("Llave antes del switch: "+llave);
                            
                                    impuestosConceptos.getTrasladados().add(trasladados);
                            //} //FIN DE IVA
                                    
                          //}// FIN DEL FOR DE IVA O IEPS
                         //} //FIN DEL IF SI APLICA IMPUESTO 02
                        //} //FIN DEL FOR DE CONCEPTOS

                     conceptos.setImpuestos(impuestosConceptos);
                     comprobante.getConceptos().add(conceptos);

                     //puede HABER DOS TRASLADOS:

                     /*TASA CON IVA OLO SON VALORES FIJOS
                     TASA CON IEPS SOLO SON VALORES FIJOS
                     CUOTA NO VA CON IVA
                     CUOTA CON IEPS CON RANGO DE 0.000000 A 59.144900 
                     EXENTO CON IVA
                     EXENTO CON IEPS

                     MARCAR ESTAS VALIDACIONES A LA HORA DE AGREGAR PRODUCTOS*/
                     //LOGGER.info("combinacionesImpuestos: "+combinacionesImpuestos.size());

                     //if(combinacionesImpuestos.size()>0&&!combinacionesImpuestos.isEmpty()){
                        impuestoComprobante = new ImpuestoCFDIv40();
                        //if(existeTasa==true||existeCuota==true){
                            
                            //LOGGER.info("TotalImpuestosTrasladados before df: "+totalImpuestosTrasladados);
                            impuestoComprobante.setTotalImpuestosTrasladados("160");
                            //LOGGER.info("TotalImpuestosTrasladados after df: "+impuestoComprobante.getTotalImpuestosTrasladados());
                        //}
                        //for(String combinacion :combinacionesImpuestos){
                           
                            traslados = new TrasladoConcepto2();
                            //LOGGER.info("Combinación: "+combinacion);
                            //String[] llaveExtraida=combinacion.split("\\|");
                            //for(int a=0; a<llaveExtraida.length-1; a++){
                             //LOGGER.info("R Combinacion: "+llaveExtraida[a]);
                            //}
                            traslados.setBase("1000");
                            //LOGGER.info("Base: "+traslados.getBase());
                            traslados.setImpuesto("002");
                            //LOGGER.info("Impuesto: "+traslados.getImpuesto());
                            traslados.setTipoFactor("Tasa");
                            //LOGGER.info("TipoFactor: "+traslados.getTipoFactor());
                            //if(!llaveExtraida[1].equals("Exento")){
                                //LOGGER.info("No existe exento");
                                traslados.setTasaOCuota("0.160000");
                                //LOGGER.info("TasaOCuota: "+traslados.getTasaOCuota());
                                traslados.setImporte("160");
                                //LOGGER.info("Importe: "+traslados.getImporte());
                            //}
                            impuestoComprobante.getTraslados().add(traslados);//SE AGREGAN LOS TRASLADOS A LOS IMPUESTOS QUE SON A NIVEL COMPROBANTE
                        //}
                     //}
                     comprobante.setImpuesto(impuestoComprobante);//SE AGREGAN LOS IMPUESTOS A NIVEL COMPROBANTE
                        //LOGGER.info("subtotal before df: "+montoTraIdTipoPago.getMonto());
                        comprobante.setSubTotal("1000"); //SUMA DE TODOS LOS IMPORTES O SUBTOTAL
                        //LOGGER.info("subtotal after df: "+comprobante.getSubTotal());
                        //total=Double.parseDouble(comprobante.getSubTotal())+totalImpuestosTrasladados;
                        //LOGGER.info("total before df: "+totalImpuestosTrasladados);
                        comprobante.setTotal("1160"); //EL SUBTOTAL MÁS LOS TOTALES DE IVA Y IEPS (UNICAMENTE TASA Y CUOTA) CUANDO ESTEN OBLIGADOS A DECLARAR IMPUESTOS (OBJETO IMP 02)
                        //LOGGER.info("total after df: "+comprobante.getTotal());
                        //DATOS DE QUIEN FACTURA
                        

                       
                
                        
                        receptor.setCalle("ARTICULO TERCERO");
                        //LOGGER.info("Calle: "+receptor.getCalle());
                        receptor.setNoExterior("61");
                        //LOGGER.info("NoExterior: "+receptor.getNoExterior());
                        receptor.setNoInterior("H 101");
                        //LOGGER.info("NoInterior: "+receptor.getNoInterior());
                        receptor.setColonia("centri");
                        //LOGGER.info("Colonia: "+receptor.getColonia());
                        receptor.setLocalidad("santiago tianguistengo");
                        //LOGGER.info("Localidad: "+receptor.getLocalidad());
                        receptor.setMunicipio("tianguistengo");
                        //LOGGER.info("Municipio: "+receptor.getMunicipio());
                        receptor.setEstado("Aguascalientes");
                        //LOGGER.info("Estado: "+receptor.getEstado());
                        receptor.setPais("MEX");
                        //LOGGER.info("Pais: "+receptor.getPais());
                        receptor.setRfc("LUGA9512151X9");
                        //LOGGER.info("Rfc: "+receptor.getRfc());
                        receptor.setNombre("ALEXIS CUAUHTEMOC LUNA GUTIERREZ");
                        //LOGGER.info("Nombre: "+receptor.getNombre());
                        receptor.setDomicilioFiscalReceptor("76803");
                        //LOGGER.info("DomicilioFiscalReceptor: "+receptor.getDomicilioFiscalReceptor());
                        receptor.setCodigoPostal("76803");
                        //LOGGER.info("CodigoPostal: "+receptor.getCodigoPostal());
                        receptor.setEmailContacto("gutierrez.alexisluna@gmail.com");
                        //LOGGER.info("EmailContacto: "+receptor.getEmailContacto());
                        receptor.setRegimenFiscalReceptor("605");
                        //LOGGER.info("RegimenFiscalReceptor: "+receptor.getRegimenFiscalReceptor());
                        receptor.setUsoCFDI("D01");
                        //LOGGER.info("UsoCFDI: "+receptor.getUsoCFDI());
                        receptor.setEnvioPDF("1");
                        //LOGGER.info("EnvioPDF: "+receptor.getEnvioPDF());
                        receptor.setEnvioXML("1");                
                        //LOGGER.info("EnvioXML: "+receptor.getEnvioXML());
                        
                        comprobante.setReceptor(receptor);
                     
                
                        
                        credenciales.setIdReceptor(0L);
                        credenciales.setUsuario("cobromovilpruebas@bisnet.com.mx");
                        credenciales.setPassword("12345678");
                        credenciales.setRfc("CACX7605101P8");
                        
                         respuestaFactura =soap.emitirCFDIv40(comprobante, credenciales);
                        
                        System.out.println(respuestaFactura);
                        //LOGGER.info("Respuesta factura: "+respuestaFactura);
                        /*0|La invocación se realizó correctamente.
                        1008|El folio del comprobante se ha enviado anteriormente.*/
                        //(saveResponse==true ? "Contribuyente guardado" : "Contribuyente no guardado" 
                        /*response.setCode(0);
                        response.setMessage(
                            (
                            respuestaFactura.contains("correctamente") ? 
                            "La factura se generó correctamente y fue enviada al correo "+contribuyente.getCorreoElectronico() : 
                            (respuestaFactura.contains("anteriormente") ? 
                            "El comprobante se envió anteriormente": respuestaFactura)
                            )
                            );*/
                       // response.setContent( null);

                        /*if(respuestaFactura.contains("correctamente")){
                            facturaElectronicaService.updateTicketFacturado(factura.getIdTicket());
                        }*/
 
                        //EXPORTACIÓN = 01 siempre
                        //MOENDA = MXN
                        //CODIGO POSTAL DE 5 DIGITOS DE QUIEN EXPIDE LA FACTURA 

                    /* }else{
                      response.setCode(-1);
                      response.setMessage("Los datos del contribuyente no se informan correctamente, verifique.");
                    }*/
                //}   
        } 
        catch(Exception es){
            //response.setCode(-1);
            //response.setMessage("No se genero la factura Exception" + es.getMessage());
        }
        return respuestaFactura;
    }
}

