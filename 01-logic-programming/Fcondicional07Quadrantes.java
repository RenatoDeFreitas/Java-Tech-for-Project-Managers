import java.util.Locale;
import java.util.Scanner;

public class Fcondicional07Quadrantes {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

//entada + variável
		System.out.println("Identinfying Cartesian Points!");
		System.out.print("Enter value X: ");
		double valueX = teclado.nextDouble();
		
		System.out.print("Enter value Y: ");
		double valueY = teclado.nextDouble();

//negócio
		
		if(valueX == 0 && valueY == 0) {
			System.out.print("Origin Point!");
		}
		else if(valueX == 0) {
			System.out.print("Y axis");
		}
		else if(valueY == 0) {
			System.out.print("X axis");
		}
		else if(valueX > 0 && valueY > 0) {
			System.out.print("Q1");
		}
		else if(valueX < 0 && valueY > 0) {
			System.out.print("Q2");
		}
		else if(valueX < 0 && valueY < 0) {
			System.out.print("Q3");
		}
		else if(valueX > 0 && valueY < 0) {
			System.out.print("Q4");
		}
		
		
		
		
		
	teclado.close();

	}
}
