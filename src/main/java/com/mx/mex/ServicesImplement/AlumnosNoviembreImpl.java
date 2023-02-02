package com.mx.mex.ServicesImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.mex.Dto.AlumnosNoviembre;
import com.mx.mex.Repository.IAlumnosNoviembreRepository;
import com.mx.mex.Services.IAlumnosNoviembre;

@Service
public class AlumnosNoviembreImpl implements IAlumnosNoviembre{
	

@Autowired
private IAlumnosNoviembreRepository alumnosNoviembre;

	@Override
	public List<AlumnosNoviembre> alumnos() {
		// TODO Auto-generated method stub
		return alumnosNoviembre.alumnos();
	}

}
