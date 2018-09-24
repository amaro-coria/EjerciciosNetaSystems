package net.netasystems.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.netasystems.persistence.entities.Usuario;
import net.netasystems.persistence.repository.UserRepository;

@RestController
@RequestMapping(value = "/api/v1/usuarios")
public class UserController {

	@Autowired
	private UserRepository userDao;

	private final static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping(value = "/altaUsuario", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Usuario> addUser(@RequestBody Usuario nuevoUsuario){
		try{
			Usuario usuarioGuardado = userDao.save(nuevoUsuario);
			return new ResponseEntity<Usuario>(usuarioGuardado, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value = "/usuarioPorNombre/{nombre}")
	public ResponseEntity<List<Usuario>> findByNombre(@PathVariable String nombre){
		try {
			List<Usuario> listUsers = null;
			//TODO pedir lista al DAO
			listUsers = userDao.findAllByNombreUsuarioOrderByApellidoUsuarioAsc(nombre);
			log.info("Lista de usuarios encontrados: {}", listUsers);
			if(listUsers == null || listUsers.isEmpty()) {
				return new ResponseEntity<List<Usuario>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<List<Usuario>>(listUsers, HttpStatus.OK);
		}catch(Exception e) {
			log.error("Ocurrio un error con el mensaje: {}", e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Usuario>> findAll() {
		try {
			List<Usuario> lista = userDao.findAll();
			if (lista == null || lista.isEmpty()) {
				return new ResponseEntity<List<Usuario>>(lista, HttpStatus.NOT_FOUND);
			} else {
				lista.forEach(c -> log.info("El usuario encontrado ha sido: {}", c));
				return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Ha sucedido un error! : {}", e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
