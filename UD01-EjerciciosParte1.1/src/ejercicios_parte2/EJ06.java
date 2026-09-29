package ejercicios_parte2;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		
	//	Solicita al usuario tres distancias:
	//	La primera, medida en milímetros.
	//	La segunda, medida en centímetros.
	//	La última, medida en metros.
	//	Diseña un programa que muestre la suma de las 
	//	tres longitudes introducidas (medida en centímetros).

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variables
		double milimetro;
		double centimetro;
		double metro;
		double suma;

		// Pedir al usuario las medidas
		System.out.println("Introduce los milímetros: ");
		milimetro = reader.nextDouble();

		System.out.println("Introduce los centímetros: ");
		centimetro = reader.nextDouble();

		System.out.println("Introduce los metros: ");
		metro = reader.nextDouble();

		// Convertimos todo a centímetros
		milimetro = milimetro / 10;
		metro = metro * 100;

		// Sumamos las medidas
		suma = metro + centimetro + milimetro;

		// Mostrar por pantalla
		System.out.println("La suma de las medidas sería --> " + suma + " cm");

		// Cerramos scanner
		reader.close();
	}
}