package net.netasystems.threads;

public class CreadorDeNombres {

	private String[] nombres = {"foo", "bar", "baz"};
	
	public String obtenNombre() {
		long milis = System.currentTimeMillis();
		String sMilis = String.valueOf(milis);
		if(sMilis.endsWith("1")) {
			return nombres[0];
		}else if(sMilis.endsWith("2")) {
			return nombres[1];
		}else {
			return nombres[2];
		}
	}
	
}
