package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.Usuario;

//LA INTERFACE NOS SIRVE UNICAMENTE PARA DECLARAR METODOS SIN USO,

//PARA QUE ALGUNA OTRA CLASE PUEDA USAR ESTOS METODOS
public interface InterfaceServicePrincipal {

	/*
	 * METODO NORMAL
	 * 
	 * public String nombre(String a, int a, float c) {
		
		return "Alexis";
	}
 	
	*/
	
	
	//METODO SIN USO O CUERPO
	
	List<Usuario> obtenerUsuarios();
	
	public String nombreAlumno(String a, int b, float c);
	
     int edadAlumno(int edad,int anio);
	
	
}
