
public class Main {

	public static void main(String[] args) {
		System.out.println("Pruebas con objetos tipo profesor");
		Profesor ap = new ArtesPlasticas();
		Profesor ed = new EducacionFisica();
		Profesor mat = new Matematicas();
		pruebaProfesor(ap);
		pruebaProfesor(ed);
		pruebaProfesor(mat);
		
		ArtesPlasticas ap01 = new ArtesPlasticas();
		pruebaProfesor(ap01);
		
	}
	
	
	public static void pruebaProfesor(Profesor p) {
		String exposicion = p.exponer();
		Double calificacion = p.evaluar();
		System.out.println("Exposicon: "+exposicion);
		System.out.println("Calificacion: "+calificacion);
	}
	
	
	
}
