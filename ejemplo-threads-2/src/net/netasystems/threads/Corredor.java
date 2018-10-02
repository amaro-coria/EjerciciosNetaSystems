package net.netasystems.threads;

public class Corredor implements Runnable {

	private Carrera carrera;
	private boolean corre = true;
	private String name;
	private Equipo equipo;
	
	public Corredor(Carrera carrera, String name, Equipo equipo) {
		this.carrera = carrera;
		this.name = name;
		this.equipo = equipo;
	}
	
	@Override
	public void run() {
		while(corre) {
			try {
				Thread.sleep(1500);
				boolean aquired = carrera.aquireFlag(this.name);
				if(aquired) {
					Thread.sleep(2000);
					carrera.releaseFlag();
					this.corre = false;
					equipo.corredorTermina();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
