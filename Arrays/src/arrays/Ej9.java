package arrays;

import java.util.Scanner;

public class Ej9 {
	/*
	 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
	 * un determinado año y que muestre a continuación un diagrama de barras
	 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
	 * de asteriscos o cualquier otro carácter.
	 */
	public static void main(String[] args) {
		
		int temperaturaMedia = 0;
		int año[] = new int[12];

		Scanner lee = new Scanner(System.in);
//aqui lo que hice fue recorrer una tabla
		for (int i = 0; i < año.length; i++) {
			/*Aqui imprimi la solicitud por cada vuelta del bucle*/
			System.out.println("Por favor introduzca la temperatura del mes " + (i+1));
			temperaturaMedia = lee.nextInt(); //aqui estoy leyendo lo que me introduce el usuario en cada vuelta
			año[i] = temperaturaMedia;	//y aqui le estoy asignando el valor de la temperatura media al valor de la posicion de la tabla
		}
		/*TO DO, ESTA VAINA NO LA ENTIENDO POR FAVOR ALGUIEN QUE ME AYUDE*/
		
		/*Recorriendo la tabla de nuevo, este for solo lee la tabla*/
		for (int i = 0; i < año.length; i++) {
			//este for de dentro imprime un numero de asteriscos segun el valor de la posicion
			for (int j = 1; j<= año[i]; j++) {
				System.out.print("*");

		}
						System.out.println("\n");
		}
		//cerramos el scanner
		lee.close();
	}

}
