import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Mascota> miListaDeSupuestosEnteros = new ArrayList<>();
		Set<Integer> setDeMascotas =new HashSet<Integer>();
		Map<Integer, Mascota> mapaDeIdsDeMascotasYMascotas =new HashMap<Integer, Mascota>();
		
		
		miListaDeSupuestosEnteros.add(new Mascota());
		for (int i = 0; i < 10; i++) {
			miListaDeSupuestosEnteros.add(i);
		}

		miListaDeSupuestosEnteros.add(true);
		miListaDeSupuestosEnteros.add("Valor string");
		for (Object o : miListaDeSupuestosEnteros) {
			System.out.println(o);
		}
		int acumulador = 0;
		for(Object o : miListaDeSupuestosEnteros) {
			Integer i = (Integer) o;
			acumulador = acumulador + i;
		}
		System.out.println(acumulador);

	}

}
