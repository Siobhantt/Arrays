package arrays;

import java.util.Scanner;

public class Ej7 {
/*Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso,
 *  es decir, el primero que se introduce es el último en mostrarse.
*/
	public static void main(String[] args) {
		
		int numUser;
		int inverso[] = new int [5];
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 5 numeros separados por enter: ");
		
		
		for(int i=0; i< inverso.length; i++) {
			numUser = lee.nextInt();
			inverso[i] = numUser;
		}
		for (int i=inverso.length-1; i>=0; i--) {
			System.out.println(inverso[i]);
		}
	//cerramos el scanner
		lee.close();
	}

}
