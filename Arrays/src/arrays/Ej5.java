package arrays;

import java.util.Scanner;

public class Ej5 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
	 * pantalla.
	 */
	public static void main(String[] args) {

		int numUser = 0;
		int tabla[] = new int[10];
		int max = 0;
		int min = 0;

		Scanner lee = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();

		for (int valor : tabla) {
			if (valor > max) {
				max = valor;
			}
			if (valor < min) {
				min = valor;
			}
		}
	
	}
		System.out.println("El valor maximo de los valores introducidos es : " + max);
		System.out.println("El valor minimo de los valores introducidos es : " + min);
}
}
