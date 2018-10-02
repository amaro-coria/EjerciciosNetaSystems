
public class Main {

	public static void main(String[] args) {
		B objetoB = new B();
		A a = prueba(objetoB);
		B b = prueba(objetoB);
		C c = prueba(objetoB);
		
		prueba(new A());
		prueba(new B());
		prueba(new C());
		
	}
	
	public static B prueba(B parametro) {
		return new B();
	}
	
}
