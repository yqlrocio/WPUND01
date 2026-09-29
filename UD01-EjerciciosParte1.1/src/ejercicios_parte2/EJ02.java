package ejercicios_parte2;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		
	//	Escribe un programa que tome como entrada 
	//	un número entero e indique qué cantidad hay 
	//	que sumarle para que sea múltiplo de 7. Por 
	//	ejemplo, a 2 hay que sumarle 5 para que sea 
	//	múltiplo de 7. En el caso de 13 habría que 
	//	sumarle 1. Usa el operador módulo (%) para 
	//	calcularlo.

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar un número
		Integer num; 
		Integer adicional;
		
		// Pedir al usuario un número 
		System.out.println("Introduce un número: ");
		num = reader.nextInt();
		
		if (num%7 == 0) {
			System.out.println("ES MÚLTIPLO DE 7");
		} else {
			// Hacemos que el numero introducido sea múltiplo de 7
			adicional = 7- num%7; 
			
			// Mostrar por pantalla la aproximación del número
			System.out.println("Para ser múltiplo de 7 hay que sumarle --> " + adicional);
			
		}
		
		// Cerramos scanner
		reader.close();
		
	}

}
