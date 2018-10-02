package net.netasystems.granja;

import java.io.Serializable;

public class Cochinito implements Runnable {

	public void consumeMaiz() {
		Maiz maizParaConsumir = Parcela.getMaiz();
		if(maizParaConsumir == null) {
			System.out.println("No hay maiz, esperare...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Volvere a revisar si ya hay!");
			maizParaConsumir = Parcela.getMaiz();
			System.out.println(maizParaConsumir == null ? "Aun no hay" : "Ya encontre!!!");
		}else {
			System.out.println("Estoy consumiendo : "+maizParaConsumir.toString());	
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true) {
			consumeMaiz();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Exception de interrupcion");
			}
		}
	}
	
}
