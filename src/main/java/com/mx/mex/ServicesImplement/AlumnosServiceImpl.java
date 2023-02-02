package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.Alumnos;
import com.mx.mex.Repository.IAlumnosRepository;
import com.mx.mex.Services.IAlumnos;


// SE MANEJA LA LOGICA DEL NEGOCIO
@Service
public class AlumnosServiceImpl implements IAlumnos{

	@Autowired
	private IAlumnosRepository iAlumnosRepository;
	
	@Override
	public List<Alumnos> getAlumno() {
		// TODO Auto-generated method stub
		return iAlumnosRepository.getAlumno();
	}

	@Override
	public String insertAlumno(Alumnos nuevoAlumno) {
		Integer respuesta =iAlumnosRepository.insertAlumno(nuevoAlumno);
		String respuestaFinal="";
	
		if(respuesta==0) {
			respuestaFinal="No se insertó";
		}
		else {
			respuestaFinal="Se insertó";
		}
		
		return respuestaFinal;
	}

	@Override
	public String deleteAlumno(Alumnos nuevoAlumno) {
		Integer respuesta = iAlumnosRepository.deleteAlumno(nuevoAlumno);
		
		if (respuesta==0)
		return "No se eliminó"; // SI SE EJECUTA ESTE RETORNO, SE TERMINA
			
			
		return "Se eliminó";// SI NO SE EJECUTA LA CONDICIÓN IF, TOMA ESTE RETORNO
	}

}
