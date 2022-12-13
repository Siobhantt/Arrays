package arrays;

import java.util.Scanner;

public class Ej5 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
	 * pantalla.
	 */
	public static void main(String[] args) {

		double numUser;//El numero que leeremos
		double numReales[] = new double[10];//la tabla de longitud 10
		

		Scanner lee = new Scanner(System.in);
		System.out.println("Por favor introduzca 10 numeros separados por enter.");
		
		for (int i =0; i<numReales.length; i++) {//con este for asignamos a cada posicion de la tabla el numero introducido por el user
			numUser = lee.nextDouble(); 
		numReales[i] = numUser; 
		}
		
		double min = numReales[0]; 
		double max= numReales[0];
		
		/*O
		double max = Double.MIN_VALUE
		double min = Double.MAX_VALUE
		*/
		for(double i : numReales) {//con este for extendido, recorremos la tabla y comparamos la i con el maximo que es la primera posicion
			
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		//una vez terminada de recorre la tabla imprimimos el minimo y el maximo
		System.out.println("El valor maximo de la tabla es: " + max);
		System.out.println("El valor minimo de la tabla es: " + min);
	
	//cerramos el scanner
	lee.close();
	}
}
