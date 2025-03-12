package com.estudo.JDBCTemplate.repositorio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.estudo.JDBCTemplate.modelo.Camisa;

@Repository
public class JDBCTemplateRepositorio {

	JdbcTemplate jdbcTemplate;

	public JDBCTemplateRepositorio(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}
	
	private static Camisa mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Camisa( 	
				rs.getInt("id"),
				rs.getString("modelo"),
				rs.getString("marca"),
				rs.getString("preco") );
		
	 }
	
	public List<Camisa> listaCamisas(){
		
		String sql = "Select*from Camisa";
		List<Camisa> camisas = jdbcTemplate.query(sql, JDBCTemplateRepositorio::mapRow);
		return camisas;
	}
}
