package net.netasystems.granja;

public class Agricultor implements Runnable{

	public void siembraOcosecha() {
		Parcela.addMaiz(new Maiz(getCantidadRandom(), getMaizDescripcion()));
	}
	
	public int getCantidadRandom() {
		return (int) Math.random() * 100;
	}
	
	public String getMaizDescripcion() {
		String tiposMaiz[] = {"TRANSGENICO", "NORMAL", "SIN GLUTEN", "ORGANICO", "BLANCO", "NEGRO", "CON HUITLACOCHE", "PREPARADO", "EN QUESADILLA", "EN QUESADILLA CON QUESO", "MOLIDO"};
		int index = (int) Math.random() * 10;
		return tiposMaiz[index];
	
	}

	@Override
	public void run() {
		while(true) {
			siembraOcosecha();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Excepcion de intrerrupcion");
			}
		}
	}
	
}
