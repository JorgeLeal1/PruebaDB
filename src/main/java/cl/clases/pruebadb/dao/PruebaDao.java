package cl.clases.pruebadb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PruebaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertar(String nombre) {
		
		String sql = "INSERT INTO prueba (nombre) VALUES (?)";
		jdbcTemplate.update(sql, nombre);
	}
	
}
