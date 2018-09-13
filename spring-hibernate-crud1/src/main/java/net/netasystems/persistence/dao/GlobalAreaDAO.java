package net.netasystems.persistence.dao;

import java.math.BigDecimal;
import java.util.List;

import net.netasystems.persistence.entities.GlobalArea;

public interface GlobalAreaDAO {

	List<GlobalArea> findAll();

	void insert(GlobalArea entidadAGuardar);

	GlobalArea findById(BigDecimal id);
	
	
	
}
