package arrays;

public class Ej2 {
	/*
	 * Partiendo de la tabla creada en el ejercicio 1, mostrar la suma de todos los
	 * números aleatorios que se guardan en la tabla. Copia y pega el código del
	 * ejercicio anterior.
	 */
	public static void main(String[] args) {

		int sumaTabla = 0;
		int numerosAleatorios[] = new int[10];

		for (int i = 0; i < numerosAleatorios.length; i++) {

			numerosAleatorios[i] = (int) (Math.random() * 100);
			System.out.println(numerosAleatorios[i]);

		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			sumaTabla += numerosAleatorios[i];
		}

		System.out.println(sumaTabla);
	}
}
