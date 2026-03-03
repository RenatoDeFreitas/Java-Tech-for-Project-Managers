package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoDaMedia {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("How many numbers will the vectors have?\n");
		int n = teclado.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Value %d: ", (i + 1));
			vect[i] = teclado.nextDouble();
		}
		double contaVetor = 0.0;		//INSTANCIA VECTOR
		double somaVect = 0.0;
		for(int i =0; i< vect.length; i++) {
			somaVect += vect[i];
			contaVetor = i+1;
		}
		System.out.println();			//SUM + avarege
		System.out.printf("Sum value: %.2f\n", somaVect);
		System.out.printf("Averege: %.3f\n", ( somaVect / contaVetor));
		
		System.out.println();
		System.out.println("Belowe average elements:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < (somaVect/contaVetor) ) {
				
				System.out.printf("Value: %.1f - Vecto: %d\n", vect[i], i);
			} 
		}

		teclado.close();
	}

}
