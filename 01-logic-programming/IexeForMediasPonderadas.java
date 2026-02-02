import java.util.Locale;
import java.util.Scanner;

public class IexeForMediasPonderadas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter interge value: "); // instrução
		int N = teclado.nextInt(); // valor inteiro = N casos de teste - atribuição de i

		for (int i = 0; i < N; i++) { // rodar N vezes + capturar valores Reais

			System.out.println("Value A: ");
			double valA = teclado.nextDouble();

			System.out.println("Value B: ");
			double valB = teclado.nextDouble();

			System.out.println("Value C: ");
			double valC = teclado.nextDouble();

			double media = (valA * 2.0 + valB * 3.0 + valC * 5.0) / 10.0;

			System.out.println();
			System.out.printf("A: %.2f - B: %.2f - C: %.2f ---- MEDIA: %.2f%n", valA, valB, valC, media);
			System.out.println();
		}

		System.out.println("End of program!");

		teclado.close();

	}
}
