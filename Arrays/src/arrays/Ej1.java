package arrays;

public class Ej1 {
	/*
	 * Crea una tabla de enteros de longitud 10 que se inicializará con números
	 * aleatorios comprendidos entre 1 y 100.
	 */
	public static void main(String[] args) {

		int numerosAleatorios[] = new int[10];

		for (int i = 0; i < numerosAleatorios.length; i++) {

			numerosAleatorios[i] = (int) (Math.random() * 100);
			System.out.println(numerosAleatorios[i]);
		}

	}

}
