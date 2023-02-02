package com.mx.mex.Webservices.Soap.Client;

import java.net.URL;

import javax.xml.namespace.QName;


import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.EfacturaService;
import com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws.EfacturaServiceEndpointService;


public final class ServicioEfactura {

	

	
	/**
     * Ubicación del WSDL
     */
    private String ENDPOINT_SERVICE ="http://189.254.87.203:8080/efacturaws/EfacturaService?wsdl";//CmCoreUtil.getCmCoreProperties().getProperty("factura.endpoint").trim();
	
    /**
     * Nombre del servicio
     */
    private String LOCALPART = "EfacturaServiceEndpointService";//CmCoreUtil.getCmCoreProperties().getProperty("factura.service").trim();

    /**
     * Espacio de nombres objetivo
     */
    private String URI = "http://ws.broker.fact.praxis.com/";//CmCoreUtil.getCmCoreProperties().getProperty("factura.uri").trim();
    
	public ServicioEfactura() {
        super();
    }
	
	private static ServicioEfactura instance = null;
	
	public static ServicioEfactura getIntance() {
        if (instance == null) {
            instance = new ServicioEfactura();
        }
        return instance;
    }
	
	public EfacturaService getProxy() {
		EfacturaServiceEndpointService service = null;
		EfacturaService resp = null;
		try {
			service = new EfacturaServiceEndpointService(new URL(ENDPOINT_SERVICE), new QName(URI, LOCALPART));
			resp=service.getEfacturaServiceEndpointPort();
		}catch( Exception e ) {
			//LOGGER.info("Excepción WS EfacturaService::"+ e.getMessage());
			throw (RuntimeException)new RuntimeException().initCause(e);
		}
		return resp;
	}
}