import java.util.List;
import java.util.Map;
import java.util.Set;

public class EnvioCorreos {

	public void enviar(List<Persona> listaDePersonas) {
		for (Persona p : listaDePersonas) {
			System.out.println("Se ha enviado el correo a la direccin:" + p.getEmail());
		}
	}
	
	public void enviarConId(Map<Integer, Persona> mapa) {
		Set<Integer> llaves =mapa.keySet();
		for(Integer i : llaves) {
			Persona p = mapa.get(i);
			System.out.println("Persona: "+p+
					" id: "+i);
		}
	}

}
