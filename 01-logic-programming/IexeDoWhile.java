import java.util.Locale;
import java.util.Scanner;

public class IexeDoWhile {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		String resposta;
		do {
			System.out.println("Temperatura em  graus Celsius: ");
			double celsius = teclado.nextDouble();
			double fahrenheit = ((9.0 * celsius) / 5.0 + 32.0);

			System.out.printf("Equivalência em Fahrentheit: %.2f%n", fahrenheit);
			System.out.print("Deseja repetir a operação ( s/n )?");
			resposta = teclado.next();

		} while (resposta.equals("s")); 				//condição para repetir

		teclado.close();
		System.out.println("Fim do programa!");
	}

}
