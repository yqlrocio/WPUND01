package ejercicios_parte2;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
	//	Modifica el ejercicio anterior para que, 
	//	indicando dos números, por ejemplo, num1 
	//	y num2, diga qué cantidad hay que sumarle 
	//	a num1 para que sea múltiplo de num2.
		
		// Creamos scanner
		Scanner reader = new Scanner(System.in); 
		
		// Creamos variable para almacenar un número
		Integer num1; 
		Integer num2; 
		Integer adicional;
		
		// Pedir al usuario dos número 
		System.out.println("Introduce un número: ");
		num1 = reader.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = reader.nextInt();
		
		if (num1%num2 == 0) {
			System.out.println(num1 + " ES MÚLTIPLO DE " + num2);
		} else {
			// Hacemos que el num1 sea múltiplo de num2
			adicional = num2- num1%num2; 
			
			// Mostrar por pantalla la aproximación del número
			System.out.println("Para que " + num1 + " sea múltiplo de " + num2 + " hay que sumarle --> " + adicional);
			
		}
		
		// Cerramos scanner 
		reader.close();
	}

}
