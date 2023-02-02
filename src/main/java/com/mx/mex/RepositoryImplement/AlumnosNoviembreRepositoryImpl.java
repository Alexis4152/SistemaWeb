package com.mx.mex.RepositoryImplement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.AlumnosNoviembre;
import com.mx.mex.Dto.Usuario;
import com.mx.mex.Mapper.AlumnosNoviembreMapper;
import com.mx.mex.Mapper.UsuariosListMapper;
import com.mx.mex.Repository.IAlumnosNoviembreRepository;

@Repository
public class AlumnosNoviembreRepositoryImpl implements IAlumnosNoviembreRepository{

	
	@Autowired
	private  DataSource dataSource;  //NUESTRA CONEXION A BASE DE DATOS
	
	private  JdbcTemplate jdbcTemplate = new JdbcTemplate(); //PARA EJECUTAR LAS CONSULTAS
	
	@Override
	public List<AlumnosNoviembre> alumnos() {
		jdbcTemplate.setDataSource(getDataSource()); //ASIGNAMOS LA CONEXIÓN AL OBJETO JDBCTEMPLATE
		return jdbcTemplate.query("SELECT * FROM ALUMNOS_NOVIEMBRE",
				new AlumnosNoviembreMapper<AlumnosNoviembre>());
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
}
