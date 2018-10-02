package net.netasystems.controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/demo")
public class DemoController {

	@Value("${neta.application.name}")
	private String propiedadDesdeGithub;
	@Value("${neta.application.version}")
	private Double versionDesdeGithub;
	
	@RequestMapping(value = "/mensaje")
	public ResponseEntity<String> obtenMensajeDesdeNube(){
		return new ResponseEntity<String>(propiedadDesdeGithub, HttpStatus.OK);
	}
	
	@GetMapping(value = "/version")
	public ResponseEntity<Double> obtenVersionDesdeNube(){
		return new ResponseEntity<Double>(versionDesdeGithub, HttpStatus.OK);
	}
	
}
