package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramInteirosPares {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantos números vai digitar? ");
		int n = teclado.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			int marcador = 1 + i;
			System.out.printf("Digite o %dº número: ", marcador);
			vect[i] = teclado.nextInt();		//instacia numero ao vetor
		}
		System.out.println("------ NÚMEROS PARES------");
		int contaNum = 0;		//conta os positivos
		for (int i = 0; i < vect.length; i++) { 		//separa positivos
			if (vect[i] % 2 == 0) {
				contaNum += 1;
				System.out.print(vect[i] + " ");
			}
		}
		System.out.print("\nQUANTIDADE DE NÚMEROS PARES = "+contaNum);
		teclado.close();
	}
}
