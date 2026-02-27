package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramProdutos {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter the quantity of product:"); // Solicita valor de n
		int n = teclado.nextInt();

		// VETOR DE PRODUTO
		Product[] vect = new Product[n]; // tamanho de n

		// INPUT VETOR -> percorrer + dados
		for (int i = 0; i < vect.length; i++) {
			teclado.nextLine(); // quebra de linha
			System.out.print("Name product: ");
			String name = teclado.nextLine(); // name product

			System.out.print("Price product: ");
			double price = teclado.nextDouble(); // price product
			System.out.println();

			vect[i] = new Product(name, price); // INSTANCIA OBJETOS
		}
			
		//SOMA PRODUTOS -> buca get do objeto
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		//MEDIA PRECO
		double avg = soma / vect.length;
		System.out.printf("Average price: $ %.2f%n", avg);
		System.out.println("There are " + n + " product.");
		
		for(int i=0; i < vect.length; i++) {
			System.out.println("Product name: "+vect[i].getName()+" - Price: $ "+ vect[i].getPrice() );
		}
		
		
		teclado.close();
	}
}
