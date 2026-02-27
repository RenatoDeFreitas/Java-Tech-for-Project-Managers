package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegativeNumber {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int somaNegativos = 0;
		int somaPositivos = 0;

		System.out.println("Digite o número de repetições entre 2 a 10");
		int n = teclado.nextInt();
		
		while (n < 1 || n > 10) {
			System.out.println("Número inválido! Digite novamente:");
			n = teclado.nextInt();
		}

		int[] vect = new int[n];
		// INPUT VETOR
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número inteiro qualquer: ");
			int numero = teclado.nextInt();
			vect[i] = numero;
		}
		System.out.println();
		System.out.println("------ NEGATIVOS ------");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		System.out.println();
		System.out.println("------ POSITIVOS ------");
		for (int i=0; i < vect.length; i++) {
			if(vect[i] > 0) {
				System.out.println(vect[i]);
			} 
		}
		
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					somaNegativos += vect[i];
				} 
				else {
					somaPositivos += vect[i];
				}
			}

		System.out.println("------ SOMA ------");
		System.out.printf("Soma negativos: "+somaNegativos + "\n");
		System.out.printf("Soma positivos: "+somaPositivos);

		teclado.close();
	}

}
