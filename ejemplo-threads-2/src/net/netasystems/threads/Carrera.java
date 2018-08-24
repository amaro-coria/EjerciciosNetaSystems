package net.netasystems.threads;

public class Carrera {

	private boolean flagTaken = false;
	
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("Flag has been aquired by: "+threadName);
		flagTaken = true;
		return true;
	}
	
	public void releaseFlag() {
		flagTaken = false;
	}
	
}
