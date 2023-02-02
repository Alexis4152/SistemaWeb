package com.mx.mex.RepositoryImplement;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.mex.Dto.Trabajadores;
import com.mx.mex.Mapper.TrabajadoresMapper;
import com.mx.mex.Repository.ITrabajadoresRepository;


@Repository
public class TrabajadoresRepositoryImpl implements ITrabajadoresRepository {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	@Override
	public List<Trabajadores> getTrabjadores() {
		jdbcTemplate.setDataSource(getDataSource());// ASIGNAR LA CONEXIÓN AL OBJETO JDBCTEMPLATE Y NOS PERMITA HACER LA CONSULTA
		return jdbcTemplate.query("SELECT * FROM TRABAJADORES",new TrabajadoresMapper<Trabajadores>());
	}

	@Override
	public Integer insertTrabajadores(Trabajadores nuevoTrabajador) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO TRABAJADORES (ID_TRABJADOR, NOMBRE, EDAD, SALARIO, FECHA_INGRESO)"
				+ " VALUES (?,?,?,?,?)",nuevoTrabajador.getIdTrabajador(),nuevoTrabajador.getNombre(),
				nuevoTrabajador.getEdad(),
				nuevoTrabajador.getSalario(),nuevoTrabajador.getFechaIngreso());
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
