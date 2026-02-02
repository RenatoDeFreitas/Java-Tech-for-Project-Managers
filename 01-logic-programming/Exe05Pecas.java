import java.util.Locale;
import java.util.Scanner;

public class Exe05Pecas {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		double  pago1, pago2, totalPagar;
		
		System.out.print("Cód. peça 1: ");
		double cod1 = teclado.nextDouble();
		
		System.out.print("N° peças 1 vendidas: ");
		double numPeca1 = teclado.nextDouble();
		
		System.out.print("Valor peça 1 (R$): ");
		double valor1 = teclado.nextDouble();

		pago1 = numPeca1 * valor1;
		
		System.out.print("Cód. peça 2: ");
		double cod2 = teclado.nextDouble();
		
		System.out.print("N° peças 2 vendidas: ");
		double numPeca2 = teclado.nextDouble();
		
		System.out.print("Valor peça 2 (R$): ");
		double valor2 = teclado.nextDouble();

		pago2 = numPeca2 * valor2;
		
		totalPagar = pago1 + pago2;
		

		System.out.printf("Valor a pagar: R$ %.2f%n",totalPagar);
		System.out.print("código 01 "+cod1 + " Código 02 "+  cod2);
		
		
		
		teclado.close();
	}

}
