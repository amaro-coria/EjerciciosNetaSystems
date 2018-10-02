package net.netasystems.dao.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.persistence.entities.CatTipoFabrica;

@Repository
@Transactional
public class CatTipoFabricaDAOImpl implements CatTipoFabricaDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<CatTipoFabrica> findAll() {
		CatTipoFabrica nuevoElemento =new CatTipoFabrica();
		nuevoElemento.setIdCatTipoFabrica(new BigDecimal(100));
		nuevoElemento.setIdUsuario(new BigDecimal(1));
		nuevoElemento.setNombre("PRUEBA HIBERNATE");
		nuevoElemento.setStatus(new Character('A'));
		nuevoElemento.setFechaModificacion(new Date());
		
		
		List<CatTipoFabrica> listaDesdeBd = 
				sessionFactory
				.getCurrentSession()
				.createQuery("FROM CatTipoFabrica", CatTipoFabrica.class)
				.getResultList();
		
		
		
		
		sessionFactory.getCurrentSession().save(nuevoElemento);
		
		return listaDesdeBd;
	}
	
	//private JdbcTemplate jdbcTemplate;
/*
	@Autowired
	public CatTipoFabricaDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
*/
	/*
	public Integer count() {
		Integer counter = jdbcTemplate.
		queryForObject("SELECT COUNT(*) FROM CAT_TIPO_FABRICA", Integer.class);
		return counter;
	}
	*/
	
	
}
