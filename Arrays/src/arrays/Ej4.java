package arrays;

public class Ej4 {
	/*
	 * Define un array de 12 números enteros con nombre num y asigna los valores
	 * según la tabla que se muestra a continuación. Muestra el contenido de todos
	 * los elementos del array por consola. ¿Qué sucede con los valores de los
	 * elementos que no han sido inicializados?
	 */
	public static void main(String[] args) {

		int num[] = new int[12];
		// aqui estoy asignando a cada posicion de la tabla un valor
		num[0] = 39;
		num[1] = -2;
		num[4] = 4;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		// aqui uso el for each para imprimir cada valor de la tabla
		for (int numTabla : num) {
			System.out.println(numTabla);
		}

	}

}
