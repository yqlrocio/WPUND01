package excercisesPart1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
	
		//	Create a new Project named “Unit1Project1”. Create a package named “exercise1” and a Class named “Exercise1”. Modify the code inside the main block:
		//	public class Exercise1 {
		//	public static void main(String[] args) {
		//	System.out.print("Hello, how are you? ");
		//	System.out.println("Fine thanks.");
		//	}
		//	}
		//	What is the output after executing this code?
		//  Fine thanks.

		
		// Create variable
		Integer age;
		
		// Create Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Ask to the user about him/her age
		System.out.print("Hello,  how are you? ");
		age = reader.nextInt();
		
		System.out.println("Fine thanks.");
		
		// Close Scanner
		reader.close();


	}

}
