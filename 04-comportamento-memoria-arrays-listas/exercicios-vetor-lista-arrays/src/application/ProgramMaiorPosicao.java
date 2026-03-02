package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantos números você quer digitar? ");
		int n = teclado.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			int marcador = 1 + i;
			System.out.printf("%d º número: ", marcador);
			vect[i] = teclado.nextDouble();

		}
		
		int posicaoMaior = 0;
		double maiorValor;
		maiorValor = vect[0];
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaior = i;
			}
		}
		System.out.println("MAIOR VALOR: "+ maiorValor + "\nPOSICÃO NA CASA:: "+ posicaoMaior );

		System.out.println( "Fim!");
		teclado.close();
	}

}
