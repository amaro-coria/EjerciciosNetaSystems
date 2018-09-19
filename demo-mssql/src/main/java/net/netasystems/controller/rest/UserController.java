package net.netasystems.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping(value = "/usuario", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> lista = userDao.findAll();
		return new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);
	}

}
