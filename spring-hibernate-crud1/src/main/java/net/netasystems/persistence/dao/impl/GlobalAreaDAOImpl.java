package net.netasystems.persistence.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.netasystems.persistence.dao.GlobalAreaDAO;
import net.netasystems.persistence.entities.GlobalArea;

//@Component
//@Service
@Repository
@Transactional
public class GlobalAreaDAOImpl implements GlobalAreaDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<GlobalArea> findAll() {
		System.out.println("Llamando metodo desde la clase concreta");
		String hql = "FROM GlobalArea";
		// String hql = "SELECT ga FROM GlobalArea ga";
		// String hql = "SELECT idArea, nombre, estatus, fechaModificacion, idUsuario
		// FROM GlobalArea";
		Query<GlobalArea> query = sessionFactory
				.getCurrentSession()
				.createQuery(hql, GlobalArea.class);
		List<GlobalArea> listAreas = query.list();
		return listAreas;
	}

	@Override
	public void insert(GlobalArea entidadAGuardar) {
		sessionFactory.getCurrentSession().save(entidadAGuardar);
	}

	@Override
	public GlobalArea findById(BigDecimal id) {
		return sessionFactory.getCurrentSession().find(GlobalArea.class, id);
	}

}
