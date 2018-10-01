package net.netasystems.clietems.persistence.dao;

import net.netasystems.clietems.persistence.entities.CatalogoGeneral;
import net.netasystems.clietems.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteDAO extends
        JpaRepository<Cliente, Integer> {

    List<Cliente> findAllByCatalogoGeneralIdCatalogo(Integer idEstatus);

    List<Cliente> findAllByEmailCliente(String email);

    List<Cliente> findAllByCelCliente(String cel);

    Cliente findClienteByCelClienteAndEmailClienteAndCatalogoGeneralIdCatalogo(String cel,
                                                                               String email,
                                                                               Integer idEstatus);


}
