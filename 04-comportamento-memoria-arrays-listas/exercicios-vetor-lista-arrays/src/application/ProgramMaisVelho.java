package application;

import java.util.Scanner;
import entities.PessoaMaisVelho;

public class ProgramMaisVelho {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("How many people will be registered? ");
		int n = teclado.nextInt();
		teclado.nextLine(); // quebra de linha

		// criado vetores
		PessoaMaisVelho[] vect = new PessoaMaisVelho[n];

		System.out.println();
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%dª person:\n", i + 1);
			System.out.print("Name: ");
			String nome = teclado.nextLine();
			
			System.out.print("Idade: ");
			int idade = teclado.nextInt();
			teclado.nextLine();
			System.out.println();

			vect [i] = new PessoaMaisVelho(nome, idade);
		}
		int maiorValor = vect[0].getIdade();
		int posicao = 0;
		
		for(int i = 1; i < vect.length; i++) {
			if(vect[i].getIdade() > maiorValor) {
				maiorValor = vect[i].getIdade();
				posicao = i;
				
			} 
		}
		
		System.out.println("Older percon: " + vect[posicao].getName());
		System.out.println("Age:" + maiorValor);
		teclado.close();
	}
}
