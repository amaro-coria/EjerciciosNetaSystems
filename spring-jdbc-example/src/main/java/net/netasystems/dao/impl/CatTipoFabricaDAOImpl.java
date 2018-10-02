package net.netasystems.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import net.netasystems.dao.CatTipoFabricaDAO;

@Repository
public class CatTipoFabricaDAOImpl implements CatTipoFabricaDAO{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public CatTipoFabricaDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Integer count() {
		Integer counter = jdbcTemplate.
		queryForObject("SELECT COUNT(*) FROM CAT_TIPO_FABRICA", Integer.class);
		return counter;
	}
	
	
	
}
