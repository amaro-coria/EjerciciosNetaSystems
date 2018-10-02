package net.netasystems.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CAT_TIPO_FABRICA", schema = "EGLOBAL")
public class CatTipoFabrica implements Serializable {

	private BigDecimal idCatTipoFabrica;
	private String nombre;
	private Character status;
	private Date fechaModificacion;
	private BigDecimal idUsuario;

	@Id
	@Basic
	//@SequenceGenerator(name = "SECUENCIA_DE_NETASYSTEMS1", 
	//	allocationSize = 1, sequenceName = "")
	//@GeneratedValue(generator = "SECUENCIA_DE_NETASYSTEMS1", 
	//	strategy = GenerationType.SEQUENCE)
	@Column(name = "IDCATTIPOFABRICA")
	public BigDecimal getIdCatTipoFabrica() {
		return idCatTipoFabrica;
	}

	public void setIdCatTipoFabrica(BigDecimal idCatTipoFabrica) {
		this.idCatTipoFabrica = idCatTipoFabrica;
	}

	@Basic
	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Basic
	@Column(name = "ESTATUS")
	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHAMODIFICACION")
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	@Basic
	@Column(name = "IDUSUARIO")
	public BigDecimal getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(BigDecimal idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + ((idCatTipoFabrica == null) ? 0 : idCatTipoFabrica.hashCode());
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatTipoFabrica other = (CatTipoFabrica) obj;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (idCatTipoFabrica == null) {
			if (other.idCatTipoFabrica != null)
				return false;
		} else if (!idCatTipoFabrica.equals(other.idCatTipoFabrica))
			return false;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatTipoFabrica [idCatTipoFabrica=" + idCatTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaModificacion=" + fechaModificacion + ", idUsuario=" + idUsuario + "]";
	}

}
