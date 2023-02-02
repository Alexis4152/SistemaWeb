package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.Usuario;

public interface InterfaceRepositoryPrincipal {


    List<Usuario> obtenerUsuarios();
 	
    String nombreAlumno(String a, int b, float c);
	
    int edadAlumno(int edad,int anio);
	
}
