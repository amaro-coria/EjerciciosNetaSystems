package net.netasystems.threads;

public class HolaMundoThread 

	//extends Thread
	implements Runnable



{

	private String nombre;
	
	public HolaMundoThread(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Hola, soy el thread: "+nombre);
		}
		
	}

}
