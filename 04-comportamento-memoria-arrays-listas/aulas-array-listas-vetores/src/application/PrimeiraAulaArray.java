package application;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraAulaArray {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter the size array:");
		int n = teclado.nextInt();				//INPUT TAMANHO VETOR
			
		double[] altura = new double[n]; //INSTANCIA VETOR -> altura = vect
		
		
		//INPUT DO VETOR - PERCORRE + DADOS
		for(int i=0; i < n ; i++) {						//condição do for - para menor que n faça
			System.out.print("Enter the height: ");
			altura[i] = teclado.nextDouble();
		}
		
		//SOMA VALORES VETOR
		double somaAlturas = 0.0;
		for(int i=0; i < n ; i++) {				//percorre somando total + valor de cada posição do vetor			somaAlturas += altura[i];
		}
		
		//MEDIA
		double avg = somaAlturas / n;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		
		teclado.close();
	}
}
