package net.netasystems.dao;

import java.util.List;

import net.netasystems.persistence.entities.CatTipoFabrica;

public interface CatTipoFabricaDAO {

	//Integer count();
	List<CatTipoFabrica> findAll();
	
}
