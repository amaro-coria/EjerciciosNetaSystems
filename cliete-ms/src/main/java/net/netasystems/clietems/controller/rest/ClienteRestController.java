package net.netasystems.clietems.controller.rest;


import net.netasystems.clietems.dto.ClienteDTO;
import net.netasystems.clietems.persistence.dao.ClienteDAO;
import net.netasystems.clietems.persistence.entities.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteDAO clienteDAO;
    private static final Logger log = LoggerFactory.getLogger(ClienteRestController.class);

    @RequestMapping(value = "/fetch",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            method = RequestMethod.GET)
    public ResponseEntity<List<ClienteDTO>> fetchActiveCustomers(){
        try{
            List<Cliente> listaClientes = clienteDAO.findAll();
            if(listaClientes == null || listaClientes.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            List<ClienteDTO> clienteDTOList = new ArrayList<>();
            for(Cliente c : listaClientes){
                ClienteDTO dto = new ClienteDTO();
                dto.setIdCliente(c.getIdCliente());
                dto.setApellidoMatCliente(c.getApellidoMatCliente());
                dto.setApellidoPatCliente(c.getApellidoPatCliente());
                dto.setCelCliente(c.getCelCliente());
                dto.setEmailCliente(c.getEmailCliente());
                dto.setNombreCliente(c.getNombreCliente());
                clienteDTOList.add(dto);
            }
            return new ResponseEntity<>(clienteDTOList, HttpStatus.OK);
        }catch (Exception e){
            log.error("Ocurrio un error con el mensaje: {}", e.getMessage());
            log.error("Trace: ", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/findAllByEmail/{email}", method = RequestMethod.GET
                    , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Cliente>> findAllByEmail(@PathVariable String email){
        try{
            List<Cliente> list = clienteDAO.findAllByEmailCliente(email);
            if(list == null || list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(list, HttpStatus.OK);
        }catch (Exception e){
            log.error("Error en findAllByEmail con mensaje: {}", e.getMessage());
            log.error("Traza: {}" , e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/findById/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Integer id){
        try{
            Optional<Cliente> found = clienteDAO.findById(id);
            if(found.isPresent()){
                return new ResponseEntity<>(found.get(), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch(Exception e){
            log.error("Error en findById con mensaje: {}", e.getMessage());
            log.error("Traza del error: {}", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/fetchActive", method = RequestMethod.GET
                    , produces = MediaType.APPLICATION_JSON_UTF8_VALUE   )
    public ResponseEntity<List<Cliente>> findActivos(){
        //TODO mejorar el definir cuales son activos
        final int idActivo = 1;
        try{
            List<Cliente> listaActivos = clienteDAO
                    .findAllByCatalogoGeneralIdCatalogo(idActivo);
            for (Cliente c :
                    listaActivos) {
                log.info("Cliente: {}", c);
            }
            if(listaActivos == null || listaActivos.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(listaActivos, HttpStatus.OK);
        }catch(Exception e){
            log.error("Error en findActivos con mensaje: {}", e.getMessage());
            log.error("Traza: {}", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO clienteDTO){

    }


}
