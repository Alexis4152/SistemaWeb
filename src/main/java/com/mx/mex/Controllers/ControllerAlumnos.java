package com.mx.mex.Controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.mex.Dto.Alumnos;
import com.mx.mex.Services.IAlumnos;


// SPRINGFRAMEWORK - 4.0
@Controller // HACE NUESTRA CLASE EN CONTROLADOR
@RequestMapping("Alumnos")
public class ControllerAlumnos {

	@Autowired //INYECCIÓN DE DEPENDENCIAS - CONECTAR CON SERVICIO O REPOSITORIO O ALGUNA OTRA CLASE DE SPRING
	private IAlumnos iAlumnos;
	
	//SERVICIO
	@RequestMapping("/getAlumno")
	public String getAlumno() {
		List<Alumnos> lista = new ArrayList<Alumnos>();
		lista = iAlumnos.getAlumno();
		
		for(Alumnos run : lista) {
			System.out.println("ID ALUMNO: "+run.getIdAlumno());
			System.out.println("SALON: "+run.getSalon());
			System.out.println("NOMBRE: "+run.getNombre());
		}
		
		return "Inicio";
	}
	
	@RequestMapping("/insertAlumno")
	public String insertAlumno() {
		Alumnos nuevo = new Alumnos();
		
		nuevo.setNombre("Pedro");
		nuevo.setSalon(new BigDecimal(1));
		String respuesta= iAlumnos.insertAlumno(nuevo);
		
		System.out.println("La respuesta es: "+respuesta);
		
		
		return "Alumnos/Inicio";
	}
	
	@RequestMapping("/deleteAlumno")
	public String deleteAlumno() {
		Alumnos nuevo = new Alumnos();
		
		nuevo.setIdAlumno(new BigDecimal(1));
		
		String respuesta= iAlumnos.deleteAlumno(nuevo);
		
		System.out.println("La respuesta es: "+respuesta);
		
		
		return "Alumnos/Inicio";
	}
	
}
