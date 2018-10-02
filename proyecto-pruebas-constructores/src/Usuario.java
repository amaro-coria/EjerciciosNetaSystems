import java.io.Serializable;

public class Usuario implements Serializable{

	private String nombre;
	private int userId;
	private int edad;
	private char sexo;
	private int tipo;
	private String email;
	private String tel;
	private transient String password;
	
	public Usuario() {
		//Definiendo defaults
		this(1, "mail@me.com");
		System.out.println("Llamando a constructor en blanco");
	}
	
	public Usuario(int userId, String email) {
		this("Francisco", userId, 21, 'h', 1, email, null);
		System.out.println("Llamando a constructor semi lleno");
		this.userId = userId;
		this.email = email;
		
	}
	
	public Usuario(String nombre, int userId, int edad, char sexo, int tipo, String email, String tel) {
		super();//Object
		System.out.println("Llamando a constructor full");
		this.nombre = nombre;
		this.userId = userId;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.email = email;
		this.tel = tel;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if(nombre.isEmpty()) {
			return;
		}else {
			this.nombre =nombre;	
		}
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
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
		Usuario other = (Usuario) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", userId=" + userId + ", edad=" + edad + ", sexo=" + sexo + ", tipo="
				+ tipo + ", email=" + email + ", tel=" + tel + "]";
	}
	
	
	
	
}
