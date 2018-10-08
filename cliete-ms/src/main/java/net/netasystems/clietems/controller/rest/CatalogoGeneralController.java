package net.netasystems.clietems.controller.rest;

import net.netasystems.clietems.dto.CatalogoDTO;
import net.netasystems.clietems.persistence.dao.CatalogoGeneralRepository;
import net.netasystems.clietems.persistence.entities.CatalogoGeneral;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/catalogo")
public class CatalogoGeneralController {

    private static final Logger log = LoggerFactory
            .getLogger(CatalogoGeneralController.class);
    @Autowired
    private CatalogoGeneralRepository dao;

    public ResponseEntity<List<CatalogoDTO>> findAll(){
        List<CatalogoGeneral> list = null;
        try{
            list = dao.findAll();
            if(list == null || list.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            //Transformar las entidades a DTO
            List<CatalogoDTO> listDTO = new ArrayList<>();
            list.forEach(c -> listDTO.add(
                                            new CatalogoDTO(c.getIdCatalogo(),
                                                    c.getIdTipoCatalogo(),
                                                    c.getValCatalogo(),
                                                    c.getDescCatalogo(),
                                                    c.getIdEstatus(),
                                                    c.getUsrCrea(),
                                                    c.getFchCrea(),
                                                    c.getUsrModi(),
                                                    c.getFchModi()
                                            )
                                        )
                        );
            //Comunicarnos con el REST de clientes
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getForObject("http://.......", String.class);
            return new ResponseEntity<>(listDTO, HttpStatus.OK);
        }catch(Exception e){
            log.error("Error en findAll con mensaje: {}", e.getMessage());
            log.error("Traza: {}", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //1.- GET para obtener todos los elementos de la tabla de catalogos
    //2.- GET para obtener por id
    //3.- POST para crear nuevo
    //4.- PUT para actualizar elmento
    //5.- DELETE para borrar elemento

}