package arrays;

import java.util.Scanner;

public class Ej10 {
/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá
un valor N y mostrará en qué posiciones del array aparece N.*/
	public static void main(String[] args) {
		
		int valorUser;
		int enteros[] = new int [100];
		
		Scanner lee = new Scanner(System.in);
		
		for (int i =0; i<enteros.length;i++) {// en este for recorremos la tabla y al valor que este en el indice se le asigna un valor random
			enteros[i] =(int) (1+Math.random()*10);
		}
		System.out.println("Por favor introduzca un valor entre 0 y 100: ");
	valorUser = lee.nextInt();
	
	for(int i=0; i<enteros.length;i++) {//recorremos de nuevo la tabla
		if (valorUser == enteros[i]) {//iniciamos un if donde se el valor del usuario es igual al valor guardado en el indice y de la tabla
			System.out.println("El numero introducido se encuentra en la posicion " + i);//imprima la posicion que en este caso es i
		/*Importante tener en cuenta que i es la posicion y tabla[i] es el valor guardado en la posicion*/
		}
	}
	//cerramos el scanner
	lee.close();
	}

}
