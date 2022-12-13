package arrays;

import java.util.Scanner;

public class Ej6 {
/*Realiza un programa que pida 8 números enteros y los almacene en una tabla. 
 * A continuación, recorrerá esa tabla y mostrará esos números junto con la palabra “par” o “impar” según proceda.*/
	public static void main(String[] args) {
		
		int numUser;
		int tablaPoI[] = new int [8];
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca 8 numeros separados por enter: ");	
		

		for (int i =0; i<tablaPoI.length; i++) {
			numUser = lee.nextInt();
			tablaPoI[i] = numUser;
		}
		
		for (int i=0; i<tablaPoI.length; i++) {
			if (tablaPoI[i]%2 == 0) {
				System.out.println(tablaPoI[i] + " Par");
			}
			else {
				System.out.println(tablaPoI[i] + " Impar");
						}
			}
	//cerramos el scanner
		lee.close();
	
	}
		
	}


