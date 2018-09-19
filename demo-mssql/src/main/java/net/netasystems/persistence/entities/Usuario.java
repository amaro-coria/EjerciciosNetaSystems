package net.netasystems.persistence.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuarios", schema = "neta_schema")
@Data
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	@Basic
	private Integer idUsuario;
	@Column(name = "nombre_usuario")
	@Basic
	private String nombreUsuario;
	@Column(name = "apellido_usuario")
	@Basic
	private String apellidoUsuario;
	@Column(name = "email")
	@Basic
	private String email;

}
