
public class Main {

	public static void main(String[] args) {
		System.out.println("Inicio de programa");
		System.out.println("##########################");
		Usuario u01 = new Usuario();
		System.out.println("##########################");
		Usuario u02 = new Usuario(2, "mail@me.com");
		System.out.println("##########################");
		Usuario u03 = new Usuario("Jorge", 3, 29, 'm', 3, "amaro.coria@gmail.com", "5540812022");
		u03.setNombre("");
		String nombreRecuperado = u03.getNombre();
		System.out.println("##########################");
		System.out.println("Prueba finalizada");
	}
	
}
