
public class Main {

	public static void main(String[] args) {
		BurbujaOrden b = new BurbujaOrden(true, 10);
		for(int i = 0; i<10; i++) {
			int valor = (int) Math.random();
			b.setValor(valor, i);
		}
		int[] numerosOrdenados = b.obtenElementosOrdenados();
		for(Integer i : numerosOrdenados) {
			System.out.println(i);
		}
	}
	
}
