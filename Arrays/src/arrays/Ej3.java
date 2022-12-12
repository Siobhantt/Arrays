package arrays;

import java.util.Scanner;

public class Ej3 {
	/*
	 * Diseñar un programa que solicite al usuario 5 números decimales y los
	 * almacene en una tabla. Utiliza el mismo bucle para solicitar los 5 números
	 * así como para almacenarlos en la tabla. A continuación, mostrar por consola
	 * los números en el mismo orden en el que se han introducido.
	 */
	public static void main(String[] args) {

		double numDecimales[] = new double[5];

		Scanner lee = new Scanner(System.in);

		for (int i = 0; i < numDecimales.length; i++) {
			System.out.println("Por favor introduzca un numero :");
			numDecimales[i] = lee.nextDouble();

		}
		// el for echa va agarrando el contenido de la tabla
		// por eso al crear el double numero, e imprimirlo va recorriendo la tabla
		// (:numDecimales)
		for (double numero : numDecimales) {
			System.out.println(numero);
		}

		lee.close();
	}

}
