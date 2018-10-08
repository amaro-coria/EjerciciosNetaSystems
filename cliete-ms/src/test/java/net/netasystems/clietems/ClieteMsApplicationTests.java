package net.netasystems.clietems;

import net.netasystems.clietems.controller.rest.ClienteRestController;
import net.netasystems.clietems.dto.ClienteDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClieteMsApplicationTests {

    @Autowired
    private ClienteRestController controller;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testObtenerTodos() {
        ResponseEntity<List<ClienteDTO>> responseEntity = controller.fetchAll();
        int statusCode = responseEntity.getStatusCodeValue();
        assertEquals(200, statusCode);
        List<ClienteDTO> listClientes = responseEntity.getBody();
        assertNotNull(listClientes);
        int size = listClientes.size();
        assertNotEquals(0, size);
    }

    @Test
    public void testAdd() {

        /*Inicio de prueba de obtener todos*/
        ResponseEntity<List<ClienteDTO>> responseEntityObtenTodos = controller.fetchAll();
        int statusCodeObtenTodos = responseEntityObtenTodos.getStatusCodeValue();
        assertEquals(200, statusCodeObtenTodos);
        List<ClienteDTO> listClientes = responseEntityObtenTodos.getBody();
        assertNotNull(listClientes);
        int size = listClientes.size();
        assertNotEquals(0, size);
        /*Fin de prueba de obtener todos*/
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setNombreCliente("Spike");
        clienteDTO.setEmailCliente("spike@bubbles.com");
        clienteDTO.setCelCliente("55887744");
        clienteDTO.setApellidoPatCliente("Amaro");
        clienteDTO.setApellidoMatCliente("Ayala");
        ResponseEntity<ClienteDTO> responseEntity = controller.addCliente(clienteDTO);
        int statusCode = responseEntity.getStatusCodeValue();
        assertEquals(201, statusCode);
        assertNotNull(responseEntity.getBody());
        assertNotEquals(0, responseEntity.getBody().getIdCliente());
        /*Inicio segunda prueba obtener todos*/
        ResponseEntity<List<ClienteDTO>> responseEntitySegundaPrueba = controller.fetchAll();
        int statusCodeSegundaPrueba = responseEntity.getStatusCodeValue();
        assertEquals(200, statusCodeSegundaPrueba);
        List<ClienteDTO> listClientesSegundaPrueba = responseEntitySegundaPrueba.getBody();
        assertNotNull(listClientesSegundaPrueba);
        int sizeSegundaPrueba = listClientesSegundaPrueba.size();
        assertNotEquals(0, sizeSegundaPrueba);
        /*Fin segunda prueba obtener todos*/
        assertNotEquals(listClientes, listClientesSegundaPrueba);
        assertNotEquals(size, sizeSegundaPrueba);

    }

}
