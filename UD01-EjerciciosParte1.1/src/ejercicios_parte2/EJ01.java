package ejercicios_parte2;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		
	//	Realizar un programa que pida como entrada 
	//	un número con decimales y lo muestre 
	//	redondeado al entero más próximo. (SIN 
	//	UTILIZAR Math.round())
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar número decimal
		double num; 
		Integer resultado; 
		
		// Pedir al usuario un número decimal
		System.out.println("Introduce un número decimal: ");
		num = reader.nextDouble();
		
		// Hacemos cast para obtener la aproximación
		resultado = (int) (num + 0.5); 
		
		// Mostrar por pantalla la aproximación del número
		System.out.println("La aproximación sería --> " + resultado);
		
		// Cerramos scanner
		reader.close();

	}

}
