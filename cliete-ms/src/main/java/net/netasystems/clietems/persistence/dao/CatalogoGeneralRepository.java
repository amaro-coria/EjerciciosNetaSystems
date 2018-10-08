package net.netasystems.clietems.persistence.dao;

import net.netasystems.clietems.persistence.entities.CatalogoGeneral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoGeneralRepository
        extends JpaRepository<CatalogoGeneral, Integer> {
}