import java.util.Locale;
import java.util.Scanner;

public class Fcondicional05Cardapio {
	public static void main(String[] args) {

		System.out.println("CODE		PRODUCT			PRICE");
		System.out.println("1		Cachorro Quente		R$ 4.00 ");
		System.out.println("2		X-Salada        	R$ 4.50 ");
		System.out.println("3		X-Bacon         	R$ 5.00 ");
		System.out.println("4		Torrada simples 	R$ 2.00 ");
		System.out.println("5		Refrigerante    	R$ 1.50 ");
//recursos
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
//captura + declaração
		System.out.print("Enter the code value: ");
		int code = keyboard.nextInt();

		System.out.print("Enter quantity: ");
		int quantity = keyboard.nextInt();

		double total = 0.0;
// regra

		if (code == 1) {
			total = quantity * 4.0;
		} 
		else if (code == 2) {
			total = quantity * 4.5;
		}
		else if (code == 3) {
			total = quantity * 5.0;
		}
		else if (code == 4) {
			total = quantity * 2.0;
		}
		else if (code == 5) {
			total = quantity * 1.5;
		}
		else {
			System.out.print("This code does not exist!");
		}
		
		
		System.out.printf("Resume: Qunatity: %d Code:%d", quantity,code);
		System.out.printf("Total: R$ %.2f", total);
		
			
			
			
		keyboard.close();
	}

}
