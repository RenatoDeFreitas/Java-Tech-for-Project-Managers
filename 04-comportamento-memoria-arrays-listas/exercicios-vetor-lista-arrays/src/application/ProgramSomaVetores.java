package application;

import java.util.Scanner;

public class ProgramSomaVetores {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("How many numbers will the vectors have? ");
		int n = teclado.nextInt();

		System.out.println();
		System.out.println("---- Enter the values ​​for vector A. ----");
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		// VECTO A
		System.out.println();
		for (int i = 0; i < vectA.length; i++) {

			System.out.printf("%dº value: ", (i + 1));
			vectA[i] = teclado.nextInt();
		}

		// VECTOR B
		System.out.println();
		System.out.println("---- Enter the values ​​for vector B. ----");
		for (int i = 0; i < vectB.length; i++) {
			System.out.printf("%dº value: ", (i + 1));
			vectB[i] = teclado.nextInt();
		}

		// VETOR C
		System.out.println();
		System.out.println("---- Sum of vectors. ----");
		for (int i = 0; i < vectB.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);

		}

		System.out.println();
		System.out.println("End");
		teclado.close();
	}
}
