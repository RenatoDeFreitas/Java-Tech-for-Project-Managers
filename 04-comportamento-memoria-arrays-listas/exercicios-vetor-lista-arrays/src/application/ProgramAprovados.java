package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudantes;

public class ProgramAprovados {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("How many students will type? ");
		int n = teclado.nextInt();
		teclado.nextLine();
		System.out.println();

		Estudantes[] vect = new Estudantes[n]; // Cria vetor

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("STUDENT %d\n", (i + 1));
			System.out.print("Name: ");
			String nome = teclado.nextLine();

			System.out.print("Semester 1 grade: ");
			double semestre1 = teclado.nextDouble();
			System.out.print("Semester 2 grade: ");
			double semestre2 = teclado.nextDouble();
			teclado.nextLine();
			System.out.println();

			vect[i] = new Estudantes(nome, semestre1, semestre2);
		}

		System.out.println("---- ANSWERS ----");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].estaAprovado()) {
				System.out.print("Name: " + vect[i].getNome()+ " ");
				System.out.print("Average: " + vect[i].calculoMedia());
				System.out.println();
			}

		}

		teclado.close();

	}
}
