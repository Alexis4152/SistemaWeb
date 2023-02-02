package com.mx.mex.Repository;

import java.util.List;

import com.mx.mex.Dto.Aspirantes;

public interface IAspirantesRepository {
	List<Aspirantes> getAspirantes();
	Integer insertAspirantes(Aspirantes nuevoAspirante);
	Integer updateAspirantes(Aspirantes aspirante);
	Integer deleteAspirantes(Aspirantes aspirante);
	Aspirantes getAspiranteById(Aspirantes aspirante);
}
