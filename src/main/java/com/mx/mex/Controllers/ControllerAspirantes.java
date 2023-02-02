package com.mx.mex.Controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.mex.Dto.Aspirantes;
import com.mx.mex.Dto.ResponseDto;
import com.mx.mex.Services.IAspirantes;




@Controller
@RequestMapping("Aspirantes")
public class ControllerAspirantes {

	
	@Autowired 
	private IAspirantes aspirantes;
	
	
	
	// UN METODO SE COMPONE POR
	// TIPO DE IDENTIFICADOR (PUBLIC, PRIVATE O PROTECTED)
	//
	
	//JSON LA REPRESENTACION DE UNA CLASE Y SUS VARIABLES
	/*{	
		alumno: "Alumno",
		edad: 12,
		nombre: "Jorge"		
	}*/
	 
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/getAspirantes", method = RequestMethod.GET, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <  List<Aspirantes> > getAspirantes(){
		final HttpHeaders httpHeaders = new HttpHeaders();
		List<Aspirantes> lista = aspirantes.getAspirantes();
		
//		for(Aspirantes run : lista) {
//			System.out.println("Nombre: "+run.getIdAlumno());
//	    	System.out.println("Edad: "+run.getNombreAlumno());
//	    	System.out.println("Direccion: "+run.getEdad());
//	    	System.out.println("Nombre: "+run.getFechaInscripcion());
//	    	System.out.println("Edad: "+run.getCurso());
//	    	System.out.println("Direccion: "+run.getMaestro());
//		}
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <List<Aspirantes>> (lista, httpHeaders, HttpStatus.OK);	
    } //202 = OK 
	// 200 = OK
	// 403 = NO PERMITIDO 
	// 404 = LA PAGINA O RUTA NO SE ENCUENTRA
	// 500 = ES UN EXCEPCIÓN INTERNA
	// ,503 = NO TE ENCUENTRAS AUTORIZADA
	// 

	@ResponseBody
	@RequestMapping(value="/insertAspirantes", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <ResponseDto> insertAspirantes(@RequestBody Aspirantes p){
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto obj = new ResponseDto();
		
		System.out.println("Nombre: "+p.getIdAlumno());
    	System.out.println("Edad: "+p.getNombreAlumno());
    	System.out.println("Direccion: "+p.getEdad());
    	System.out.println("Nombre: "+p.getFechaInscripcion());
    	System.out.println("Edad: "+p.getCurso());
    	System.out.println("Direccion: "+p.getMaestro());
    	
    	obj.setMessage(aspirantes.insertAspirantes(p));
		obj.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity <ResponseDto> (obj, httpHeaders, HttpStatus.OK);		
    }

	
//	@ResponseBody
//	@RequestMapping(value = "/ActualizarParametro", method = RequestMethod.POST, produces = "application/json")//produces=MediaType.APPLICATION_JSON_VALUE,method = { RequestMethod.POST})
//	public ResponseEntity<Integer> udpateparametro(@ModelAttribute Parametros p) {//public int udpateparametro(@ModelAttribute Parametros p) {
//		final HttpHeaders httpHeaders = new HttpHeaders();
//		int siactualizo=0;
//		if(!Herramientas.usuariologgeado().isEmpty()) {
//		    p.setUsuariomodificacion("901"); 
//		siactualizo=servicioParametros.updateparametro(p);
//		}
//			//return  actualizo;
//			//return ResponseEntity.ok(siactualizo);
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		return new ResponseEntity <Integer> (siactualizo, httpHeaders, HttpStatus.OK);
//	}
	
	@ResponseBody // NOS PERMITE MANDAR LA RESPUESTA COMO VALORES
	@RequestMapping(value="/updateAspirantes", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <ResponseDto> updateAspirantes(@RequestBody Aspirantes p){
		final HttpHeaders httpHeaders = new HttpHeaders();

		ResponseDto obj = new ResponseDto();
		
		System.out.println("Nombre: "+p.getIdAlumno());
    	System.out.println("Edad: "+p.getNombreAlumno());
    	System.out.println("Direccion: "+p.getEdad());
    	System.out.println("Nombre: "+p.getFechaInscripcion());
    	System.out.println("Edad: "+p.getCurso());
    	System.out.println("Direccion: "+p.getMaestro());
    	

		obj.setMessage(aspirantes.updateAspirantes(p));
		obj.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON); //NOS PERMITE RECIBIR UNICAMENTE DATOS EN FORMATO JSON
		return new ResponseEntity <ResponseDto> (obj, httpHeaders, HttpStatus.OK);		
    }
	
	@ResponseBody // NOS PERMITE MANDAR LA RESPUESTA COMO VALORES
	@RequestMapping(value="/deleteAspirantes", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <ResponseDto> deleteAspirantes(@RequestBody Aspirantes p){
		final HttpHeaders httpHeaders = new HttpHeaders();

		ResponseDto obj = new ResponseDto();
		
		System.out.println("Nombre: "+p.getIdAlumno());
    	System.out.println("Edad: "+p.getNombreAlumno());
    	System.out.println("Direccion: "+p.getEdad());
    	System.out.println("Nombre: "+p.getFechaInscripcion());
    	System.out.println("Edad: "+p.getCurso());
    	System.out.println("Direccion: "+p.getMaestro());
    	
		
		
		obj.setMessage(aspirantes.deleteAspirantes(p));
		obj.setCode(0);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON); //NOS PERMITE RECIBIR UNICAMENTE DATOS EN FORMATO JSON
		return new ResponseEntity <ResponseDto> (obj, httpHeaders, HttpStatus.OK);		
    }
	
	@ResponseBody // NOS PERMITE MANDAR LA RESPUESTA COMO VALORES
	@RequestMapping(value="/getAspiranteById", method = RequestMethod.POST, produces = "application/json") //= select * from Aspirantes
	ResponseEntity <Aspirantes> getAspiranteById(@RequestBody Aspirantes p){
		final HttpHeaders httpHeaders = new HttpHeaders();

		System.out.println("Nombre: "+p.getIdAlumno());
    	System.out.println("Edad: "+p.getNombreAlumno());
    	System.out.println("Direccion: "+p.getEdad());
    	System.out.println("Nombre: "+p.getFechaInscripcion());
    	System.out.println("Edad: "+p.getCurso());
    	System.out.println("Direccion: "+p.getMaestro());

		Aspirantes aspirante = aspirantes.getAspiranteById(p);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON); //NOS PERMITE RECIBIR UNICAMENTE DATOS EN FORMATO JSON
		return new ResponseEntity <Aspirantes> (aspirante, httpHeaders, HttpStatus.OK);		
    }
		


}
