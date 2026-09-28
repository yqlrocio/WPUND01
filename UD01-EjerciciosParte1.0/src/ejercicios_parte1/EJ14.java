package ejercicios_parte1;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		
	//	Escribir un programa que solicite las notas del 
	//	primer, segundo y tercer trimestre (notas enteras 
	//	que se solicitarán al usuario). El programa debe 
	//	mostrar la nota media del curso como se utiliza 
	//	en el boletín de calificaciones (solo la parte 
	//	entera) y como se usa en el expediente académico 
	//	(con decimales).
		
		//Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		//Crear variables
		double nota1;
		double nota2;
		double nota3;
		
		
		//Pedir al usuario las notas del primer, segundo y tercer trimestre: mostra al usuario sus notas
		System.out.println("¿Cúanto has sacado en el primer trimestre?");
		nota1 = reader.nextDouble();
		
		System.out.println("¿Cúanto has sacado en el segundo trimestre?");
		nota2 = reader.nextDouble();
		
		System.out.println("¿Cúanto has sacado en el tercer trimestre?");
		nota3 = reader.nextDouble();

		//Calcular la media: nota que sale en el expediente académico (con decimales)
		System.out.println("Tu nota en el boletín es de:" +  (nota1 + nota2 + nota3)/3);
		
		//Calcular la media: nota que sale en el boletín (solo la parte entera)
		System.out.println("Tu nota en el boletín es de:" + (nota1 + nota2 + nota3)/3.0); 
		
		reader.close();
	}

}