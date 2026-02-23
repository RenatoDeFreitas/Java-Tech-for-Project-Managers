package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class ProgramCotacaoDolar {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.printf("What is thedollar price? \n");
		double priceDollar = teclado.nextDouble();
		
		
		System.out.println("How many dollars will be bouht? \n");
		double amount = teclado.nextDouble();
		
		
		System.out.printf("Amount to be paid in reais: R$ %.2f",  CurrencyConverter.calculoConversao(priceDollar, amount) );
		
				
		teclado.close();

	}
}
