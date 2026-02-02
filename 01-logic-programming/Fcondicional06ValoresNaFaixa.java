import java.util.Scanner;

public class Fcondicional06ValoresNaFaixa {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Enter any value: ");
		double value = teclado.nextDouble();

		// Rg_negócio
		if (0.00 > value || value > 100.00) {
			System.out.println("This value is not valid.");
		} 
		else if (value <=25.0){
			System.out.println("Interval (0 - 25)");
		}
		else if (value <= 50.0) {
			System.out.println("Interval (25 - 50)");
		}
		else if (value <= 75) {
			System.out.println("Interval (50 - 75)");
		}
		else {
			System.out.println("Interval (75 - 100)");
		}
		
		teclado.close();
	}
	}
