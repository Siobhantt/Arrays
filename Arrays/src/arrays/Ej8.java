package arrays;

public class Ej8 {
/*Define tres arrays de 20 números enteros cada uno
 * , con nombres numeros
 * , cuadrados
 *  y cubos.
 *   
 *  Carga el array numeros con valores aleatorios entre 0 y 100(ya)
 *  
 *  . En el array cuadrados se deben almacenar los cuadrados de los valores que hay en el array numeros
 *  
 *  . En el array cubos se deben almacenar los cubos de los valores que hay en numeros.
 *   A continuación, muestra el contenido de los tres arrays dispuestos en tres columnas.
*/
	public static void main(String[] args) {
		
		int numeros[] = new int [20];
		int cuadrados[] = new int [20];
		int cubos[] = new int [20];
	
	for (int i=0; i< numeros.length; i++) {
		numeros[i] = (int) (Math.random()*100);
	}
	
	for (int i=0; i<cuadrados.length;i++) {
		cuadrados[i] = (int) Math.pow(numeros[i], 2);
	}
	
	for (int i=0; i<cubos.length; i++) {
		cubos[i] = (int) Math.pow(numeros[i], 3);
	}
	
	for(int i=0; i<numeros.length;i++) {
		System.out.println(numeros[i] + "\t" + cuadrados[i] + "\t" + cubos[i]);
	}

	}
}