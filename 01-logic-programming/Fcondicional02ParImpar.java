import java.util.Scanner;

public class Fcondicional02ParImpar {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos verificar se o número é par ou ímpar. ");
		System.out.println();

		System.out.print("Digite um numero inteiro! ");
		int num = teclado.nextInt();

		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		System.out.println();
		
		if(num > 0 ) {
			System.out.printf("O valor %d é POSITIVO: (%d > 0)", num, num);
		}
		else if (num == 0 ) {
		System.out.printf("Espertão... você digitou zero! Sabia que %d é PAR?! ", num);
		}
		else {
			System.out.printf("O valor %d é NEGATIVO: (%d < 0) ",num,  num);
			
		}
		
		
		teclado.close();
	}

}
