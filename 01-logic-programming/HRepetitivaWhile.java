import java.util.Scanner;

public class HRepetitivaWhile {
	public static void main(String[] args) {

//CONFIGURACAO
		Scanner teclado = new Scanner(System.in);

//ENTRADA
		System.out.print("Enter a number other than zero: ");
		int number = teclado.nextInt();
		int contador = 0;

//LOGICA
		while (contador <= 100) {
			System.out.print("Enter a number other than zero: ");
			number = teclado.nextInt();
			contador += number;
		}

		teclado.close();
		System.out.printf("End of progam. The sun value is: %d ", contador);
	}
}
