package ejercicios_parte1;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		
	//	Escribe un programa en el que declares una 
	//	constante IVA de valor igual a 21. A continuación, 
	//	pídele un precio al usuario (recuerda que los precios 
	//	contienen decimales) y calcula cuál será el precio 
	//	final con el IVA aplicado.

		// Crear Scammer
		Scanner reader = new Scanner(System.in);
		
		// Constante para almacenar el valor del IVA
		final int IVA = 21;
		
		// Precio a leer de consola
		double precio;
		
		// Variable donde almacenar el precio total con el IVA incluido
		double precioConIVA;
		
		// Le pedimos al usuario el precio
		System.out.println("Introduce el precio:");
		precio = reader.nextDouble();
		
		// Calculamos el precio con IVA
		precioConIVA = precio + precio*IVA/100;
		System.out.println("El precio con IVA es:" + precioConIVA);
	
		reader.close();
	}

}