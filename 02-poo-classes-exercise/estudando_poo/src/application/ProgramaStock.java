package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Produto;

public class ProgramaStock {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		/* cria variável: produto 
		 * tipo da variável é Produto (classe Produto)
		 * CRIA INSTANCIA (Objeto Produto) se comporta conforme determinado pela classe Produto 
		 */

		
		System.out.println("Dados do Produto");
		
		System.out.print("Nome do produto: ");
		String nome = teclado.nextLine();
		
		System.out.print("Informe o preço do protudo: ");
		double preco = teclado.nextDouble();
		
		Produto produto = new Produto(nome, preco); 	//COSTRUTOR recebe parâmetro antes de iniciar
		
		System.out.println();
		System.out.println("Dados do Produto: "+ produto);
		
		System.out.println();
		System.out.println("Digite o número de produtos adicionados no estoque: ");
		int quantidade = teclado.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.print("Atualização dos dados: "+ produto);
		
		System.out.println();
		System.out.print("Digite o número de produtos removidos do estoque: ");
		quantidade = teclado.nextInt();
		
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.print("Atualização dos dados: "+ produto);
		
		
		teclado.close();
	}
}
