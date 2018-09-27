package net.netasystems.clietems.persistence.dao;

import net.netasystems.clietems.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends
        JpaRepository<Cliente, Integer> {
}
