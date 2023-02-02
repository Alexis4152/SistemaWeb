package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.Trabajadores;
import com.mx.mex.Repository.ITrabajadoresRepository;
import com.mx.mex.Services.ITrabajadores;

@Service
public class TrabajadoresImpl implements ITrabajadores{

    @Autowired
    private ITrabajadoresRepository iTrabajadoresRepository;
	
	
	@Override
	public List<Trabajadores> getTrabjadores() {

		return iTrabajadoresRepository.getTrabjadores();
	}


	@Override
	public String insertTrabajadores(Trabajadores nuevoTrabajador) {
		// TODO Auto-generated method stub
		Integer respuesta = iTrabajadoresRepository.insertTrabajadores(nuevoTrabajador);
		String respuestaFinal="";
		
		if(respuesta==0) {
			respuestaFinal="NO SE INSERTÓ";
		}
		else{
			respuestaFinal="SI SE INSERTÓ";
		}
		
		
		return respuestaFinal;
	}

}
