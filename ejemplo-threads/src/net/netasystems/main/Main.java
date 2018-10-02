package net.netasystems.main;

import net.netasystems.threads.CreadorDeNombres;
import net.netasystems.threads.HolaMundoThread;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Programa para el hola mundo de los threads");
		CreadorDeNombres cn = new CreadorDeNombres();
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(new HolaMundoThread(cn.obtenNombre()));
			t.run();
		}
	}
	
}
