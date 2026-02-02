import java.util.Scanner;

public class Fcondicional03Multiplos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Você deverá digitar somente valor inteiros:");
		System.out.print("Valor A: ");
		int A = teclado.nextInt();

		System.out.print("Valor B: ");
		int B = teclado.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.printf("Os números %d e %d : MULTIPLOS!", A, B);
		} else {
			System.out.printf("Os números %d e %d : NÃO SÃO MULTIPLOS!", A, B);
		}

		teclado.close();

	}

}
