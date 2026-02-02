import java.util.Scanner;
import java.util.Locale;

public class GaulaCondicionalTernaria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);
// USUARIO
		System.out.print("Inform the price: U$ ");
		double price = entrada.nextDouble();

		entrada.close();

//NEGOCIO
		double discount = (price < 20.00) ? price * 0.1 : price * 0.05;

//SAIDA
		System.out.printf("The value of your purchase is: U$ %.3f", discount);
	}
}
