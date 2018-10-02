import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Persona u1 = new Usuario("Jorge", "mail@mail.com");
		Persona a1 = new Administrador("Homero", "homero@simpson.com");
		OrdenCompra o1 = new OrdenCompra();
		List<Persona> listaDePersonas = new ArrayList<>();
		listaDePersonas.add(a1);
		listaDePersonas.add(u1);
		EnvioCorreos ec = new EnvioCorreos();
		ec.enviar(listaDePersonas);
		
		List<Integer> listI = new ArrayList<>();
		listI.add(1);
		
		//ec.enviar(listI);
		Map<Integer, Persona> mapa = new HashMap<>();
		mapa.put(1, u1);
		mapa.put(2, a1);
		ec.enviarConId(mapa);
		
		
	}
	
}
