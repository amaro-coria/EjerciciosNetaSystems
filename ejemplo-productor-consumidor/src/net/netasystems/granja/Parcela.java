package net.netasystems.granja;

import java.util.ArrayDeque;
import java.util.Queue;

public class Parcela {

	private static Queue<Maiz> parcela = new ArrayDeque<>(); //inicializacion de singletons
	
	public synchronized static void addMaiz(Maiz maiz) {
		parcela.add(maiz);
	}
	
	public synchronized static Maiz getMaiz() {
		if(parcela.isEmpty()) {
			return null;
		}
		return parcela.poll();
	}
	
	
}
