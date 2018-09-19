package net.netasystems.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.netasystems.persistence.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Integer>{

}
