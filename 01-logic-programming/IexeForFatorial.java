import java.util.Scanner;

public class IexeForFatorial {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Value of N: ");
		int vN = teclado.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= vN; i++) {

			fatorial *= i;
		}
		System.out.println(fatorial);

		System.out.println("End program!");

		teclado.close();
	}
}
