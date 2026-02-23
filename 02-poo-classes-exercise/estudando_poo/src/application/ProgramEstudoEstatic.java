package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class ProgramEstudoEstatic {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter radiuis: ");
		double radius = teclado.nextDouble();
		
		double c = Calculator.circunference(radius);
		double v = Calculator.circunference(radius);
		
		
		System.out.printf("Circunference%.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);
		
		
		
		
		
		teclado.close();

	}
}
