import java.io.Serializable;
import java.util.Date;

public class OrdenCompra implements Serializable{

	private String nombreProveedor;
	private String nombreAcreedor;
	private Double cantidad;
	private Date fechaCompra;
	
	
	
	public OrdenCompra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrdenCompra(String nombreProveedor, String nombreAcreedor, Double cantidad, Date fechaCompra) {
		super();
		this.nombreProveedor = nombreProveedor;
		this.nombreAcreedor = nombreAcreedor;
		this.cantidad = cantidad;
		this.fechaCompra = fechaCompra;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public String getNombreAcreedor() {
		return nombreAcreedor;
	}
	public void setNombreAcreedor(String nombreAcreedor) {
		this.nombreAcreedor = nombreAcreedor;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((fechaCompra == null) ? 0 : fechaCompra.hashCode());
		result = prime * result + ((nombreAcreedor == null) ? 0 : nombreAcreedor.hashCode());
		result = prime * result + ((nombreProveedor == null) ? 0 : nombreProveedor.hashCode());
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
		OrdenCompra other = (OrdenCompra) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (fechaCompra == null) {
			if (other.fechaCompra != null)
				return false;
		} else if (!fechaCompra.equals(other.fechaCompra))
			return false;
		if (nombreAcreedor == null) {
			if (other.nombreAcreedor != null)
				return false;
		} else if (!nombreAcreedor.equals(other.nombreAcreedor))
			return false;
		if (nombreProveedor == null) {
			if (other.nombreProveedor != null)
				return false;
		} else if (!nombreProveedor.equals(other.nombreProveedor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrdenCompra [nombreProveedor=" + nombreProveedor + ", nombreAcreedor=" + nombreAcreedor + ", cantidad="
				+ cantidad + ", fechaCompra=" + fechaCompra + "]";
	}
	
	
	
}
