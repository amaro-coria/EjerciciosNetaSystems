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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


}
