package com.mx.mex.Services;

import java.util.List;

import com.mx.mex.Dto.Aspirantes;

public interface IAspirantes {
	
	List<Aspirantes> getAspirantes();// ESTE METODO OBTIENE ASPIRANTES
	String insertAspirantes(Aspirantes nuevoAspirante);
	String updateAspirantes(Aspirantes aspirante);
	String deleteAspirantes(Aspirantes aspirante);
	Aspirantes getAspiranteById(Aspirantes aspirante);


}
