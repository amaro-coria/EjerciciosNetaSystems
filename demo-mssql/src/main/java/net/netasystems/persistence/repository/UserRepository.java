package net.netasystems.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.netasystems.persistence.entities.Usuario;

//@RepositoryRestResource(collectionResourceRel="usuarios2", path="usuarios2")
public interface UserRepository extends JpaRepository<Usuario, Integer>{

	
	List<Usuario> findAllByNombreUsuarioOrderByApellidoUsuarioAsc(String nombreUsuario);
	
}
