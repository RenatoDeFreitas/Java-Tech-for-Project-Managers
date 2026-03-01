package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite valor para repetição (1 a 8): ");
		int n = teclado.nextInt();
		
		double soma, media;
		
		//VALIDAR INTERVALO
		while(n<1 || n >8) {
			System.out.println("Valor inválido!\nDigite novamente:");
			n = teclado.nextInt();
		}
		
		double[] vect = new double[n];		//CRIA VETOR
		
		//INPT VALORES -> captura valores
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digie um número: ");
			double numero = teclado.nextDouble();
			vect[i] = numero;
		}
		//SOMA VALORES VETOR
		soma = 0.0;
		for(int i=0; i < vect.length; i++) {
			soma += vect[i] ;
		}
		//MEDIA
		media = soma / vect.length;
		 
		
		System.out.println();
		System.out.println("-----VALORES -----");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		System.out.println("SOMA: "+String.format("%.2f",soma));
		System.out.println("MEDIA: "+ String.format("%.2f", media));
		
		
		
		
		
		teclado.close();
	}

}
