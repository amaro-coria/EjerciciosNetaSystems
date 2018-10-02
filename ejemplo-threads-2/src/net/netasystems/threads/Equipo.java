package net.netasystems.threads;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements Runnable {
	
	private List<Corredor> corredores;
	private String name;
	private Carrera carrera;
	private int pendientes = 10;
	
	public Equipo(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i<pendientes; i++) {
			Corredor c = new Corredor(carrera, this.name +"_Corredor:"+ i, this);
			corredores.add(c);
		}
	}
	
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			System.out.println("El equipo: "+this.name + " ha terminado!!!!");
		}
	}

	@Override
	public void run() {
		System.out.println("Equipo: "+carrera + " ha iniciado!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredor c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
		
	}

}
