package com.mx.mex.RepositoryImplement;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.Usuario;
import com.mx.mex.Mapper.UsuariosListMapper;
import com.mx.mex.Repository.InterfaceRepositoryPrincipal;



// ESTA CLASE ES PARA LA EJECUCIÓN DE CONSULTAS HACIA LA BASE DE DATOS

@Repository
public class RepositoryImplementPrincipal implements InterfaceRepositoryPrincipal{

	
	@Autowired
	private  DataSource dataSource;  //NUESTRA CONEXION A BASE DE DATOS
	
	private  JdbcTemplate jdbcTemplate = new JdbcTemplate(); //PARA EJECUTAR LAS CONSULTAS
	
	
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		jdbcTemplate.setDataSource(getDataSource()); //ASIGNAMOS LA CONEXIÓN AL OBJETO JDBCTEMPLATE
		return null;
	}
	
	public String nombreAlumno(String a, int b, float c) {
		// TODO Auto-generated method stub
		return null;
	}

	public int edadAlumno(int edad, int anio) {
		// TODO Auto-generated method stub
		return 0;
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

