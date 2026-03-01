package application;

import java.util.Locale;
import java.util.Scanner;
import entities.PessoasExAlturas;

public class ProgramAlturaPessoas {
	public static void main(String[] arg) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int marcador = 0;

		System.out.println("Quantidade de pesoas cadastradas: "); // INPUT USUARIO
		int n = teclado.nextInt();

		while (n <= 0) {				//validar n > 0 - pessas cadastradas deve ser maior que 0
			System.out.println("Valor inválido!\nDigite valor maior que zero: ");
			n = teclado.nextInt();
		}

		// INSTANCIAR CLASSE PESSOAS + VETOR - vetor classe com n
		PessoasExAlturas[] vect = new PessoasExAlturas[n];
		teclado.nextLine();
		for (int i = 0; i < vect.length; i++) { // INSERIR PESSOAS NO ARRAY
			marcador = i + 1;
			System.out.println("Dados da " + marcador + "ª pessoa:");
			System.out.println("Nome: ");
			String nomePessoa = teclado.nextLine();
			System.out.println("Idade: ");
			int idadePessoa = teclado.nextInt();
			System.out.println("Altura");
			double alturaPessoa = teclado.nextDouble();
			teclado.nextLine();
			
			vect [i] = new PessoasExAlturas (nomePessoa, idadePessoa, alturaPessoa);
		}
		
		//MEDIA - ALTURA PESSOAS
		double alturaTotal = 0.0;
		
		for(int i=0; i < vect.length; i++) {
			alturaTotal += vect[i].getAlturaPessoa();
		}
		double respostaMedia = alturaTotal /marcador;
		
		//VALIDAR idade< 16 + percentual participação do todo
		double porcentagemPessoas16menor = 0.0;
		
		for(int i =0; i< vect.length; i++) {
			if(vect[i].getIdadePessoa() < 16) {
				porcentagemPessoas16menor++;
			}
			
		}

		System.out.println();
		System.out.printf("Altura média: %.2f m\n", respostaMedia);
		System.out.println("Pessoas com menos de 16 anos: "+ (porcentagemPessoas16menor / marcador) * 100 +"%");
		for(int i =0; i<vect.length; i++) {
			if(vect[i].getIdadePessoa()< 16) {
				System.out.println(vect[i].getNomePessoa() + ", "+ vect[i].getIdadePessoa()+" anos.");
			}
		}
		
		
		
		teclado.close();
	}
}
