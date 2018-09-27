package net.netasystems.clietems.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class ClienteDTO implements Serializable {

    private int idCliente;
    private String nombreCliente;
    private String apellidoPatCliente;
    private String apellidoMatCliente;
    private String emailCliente;
    private Date fnacCliente;
    private String celCliente;

}
