package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.Usuario;
import com.mx.mex.Repository.InterfaceRepositoryPrincipal;
import com.mx.mex.Services.InterfaceServicePrincipal;

//ESTA ES MI CLASE (ServiceImplementPrincipal) LA CUAL IMPLEMENTA UNA INTERFACE (InterfaceServicePrincipal)
// TODOS LOS METODOS QUE TIENE LA INTERFACE (InterfaceServicePrincipal), LOS DEBO DE  AGREGAR EN MI CLASE DE IMPLEMENTACIÓN (ServiceImplementPrincipal)
// SI YO QUIERO AGREGAR O MODIFICAR UN METODO DE LOS QUE ESTOY IMPORTANDO DE LA INTERFACE 
//DEBO DE AGREGAR O MODIFICAR DICHO METODO EN LA INTERFACE (InterfaceServicePrincipal)
// YA QUE SI YO MODIFICO UN METODO DE LA INTERFACE (InterfaceServicePrincipal)
// DIRECTAMENTE EN ESTA CLASE ME VA A MARCAR ERROR

//ESTA CLASES ES PARA LA LÓGICA DEL NEGOCIO 

//SE ACOSTUMBRA USAR UN METODO POR CADA FUNCIÓN QUE VAYAS A REALIZAR:
//OBTENER LA EDAD DEL ALUMNO
//OBTENER LOS PADRES DEL ALUMNO, ETC.

@Service
public class ServiceImplementPrincipal implements InterfaceServicePrincipal {

	@Autowired
	private InterfaceRepositoryPrincipal repositorio;

	@Override
	public List<Usuario> obtenerUsuarios() {

		return repositorio.obtenerUsuarios();
	}

	public String nombreAlumno(String a, int b, float c) {
		repositorio.nombreAlumno(a, b, c);

		return null;
	}

	@Override
	public int edadAlumno(int edad, int anio) {
		// TODO Auto-generated method stub
		return 0;
	}



}
