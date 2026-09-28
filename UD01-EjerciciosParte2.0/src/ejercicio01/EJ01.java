package ejercicio01;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		
		// Escribe un programa que solicite al usuario la 
		// base y la altura de un rectángulo (pueden 
		// contener decimales). Debe calcular y mostrar su 
		// perímetro y su área.

		// Creamos scanner
		Scanner reader = new Scanner(System.in); 
		
		// Creamos dos variables para almacenar la base y la altura de un rectángulo
		double base;
		double altura; 
		double perimetro; 
		double area; 
		
		// Pedimos al usuario la base y la altura
		System.out.println("Introduce la base: ");
		base = reader.nextDouble(); 
		
		System.out.println("Introduce la altura: ");
		altura = reader.nextDouble(); 
		
		// Calculamos el perímetro y el área del rectángulo con los datos obtenidos
		perimetro = 2 * base + 2 * altura; 
		area = base * altura; 
		
		// Mostramos por pantalla el resultado
		System.out.println("El perímetro sería: " + perimetro);
		System.out.println("El área sería: " + area);
		
		// Cerramos scanner
		reader.close();

	}

}
