import java.util.Scanner;

public class IexeForIntervalos {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter value of N: "); // instruction usuário
		int N = teclado.nextInt(); // N captura valor de i 

		
		int in = 0;
		int out = 0;

		System.out.printf("Let's type %d time an interge.%n", N); // instrucao
		for (int i = 0; i < N; i++) {

			System.out.print("Enter value: "); // retirar
			int valueX = teclado.nextInt();

			if (valueX >= 10 && valueX <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.printf("%d in.%n", in);
		System.out.printf("%d out.%n", out);
		System.out.println("End of program! ");

		teclado.close();

	}

}
