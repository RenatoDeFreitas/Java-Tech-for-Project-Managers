package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaParesImpares {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter the number of digits in the vector:"); // entrada usuário
		int n = teclado.nextInt();
		System.out.println();

		double[] vect = new double[n]; // criar vector

		// INSTANCIAR VETOR
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Position %d: ", i);
			vect[i] = teclado.nextDouble();
		}
		double somaPar = 0.0;
		double contaI = 0.0;
		double mediaPar = 0.0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPar += vect[i];
				contaI++;
			}

		}
		System.out.println();
		if (somaPar == 0) {
			System.out.print("There are not even number!");
		} else {
			System.out.println("Even numbers, average: " + (somaPar / contaI) );
		}

		teclado.close();
	}
}
