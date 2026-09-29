package ejercicios_parte2;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		
	//	Dado el siguiente polinomio de segundo grado:
	//	y=ax^2+bx+c
	//	Crea un programa que pida los coeficientes a, b y c,
	//  así como el valor de x, y calcula el valor 
	//  correspondiente de y.
	//	NO HAY QUE RESOLVER LA ECUACIÓN, SÓLO SUSTITUIR LOS 
	//	VALORES
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar a, b, c, x e y
		double a; 
		double b; 
		double c; 
		double x; 
		double y; 
		
		
		// Pedir al usuario los valores de a, b, c, x e y
		System.out.println("Introduce un valor para a: ");
		a = reader.nextDouble();
		
		System.out.println("Introduce un valor para b: ");
		b = reader.nextDouble();
		
		System.out.println("Introduce un valor para c: ");
		c = reader.nextDouble();
		
		System.out.println("Introduce un valor para x: ");
		x = reader.nextDouble();
		
		// Calculamos el valor de y 
		y = a*x*x + b*x + c; 
		
		// Mostrar por pantalla la aproximación del número
		System.out.println("El valor de y en y=ax^2+bx+c es --> " + y);
		
		// Cerramos scanner
		reader.close();

	}

}
