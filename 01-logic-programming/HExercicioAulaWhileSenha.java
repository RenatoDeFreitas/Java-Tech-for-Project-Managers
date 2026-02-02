import java.util.Scanner;

public class HExercicioAulaWhileSenha {
	public static void main(String[] args) {

//SET
		Scanner teclado = new Scanner(System.in);

//INPUT
		System.out.println("Enter password: ");
		int password = teclado.nextInt();
		
//LOGIC
		while( password != 2002) {
			System.out.println("Invalid Access!");
			
			System.out.println();
			System.out.println("Enter password: ");
			password = teclado.nextInt();
			
		}
		System.out.println();
		System.out.println("Access allowed!");
		
		
		teclado.close();
	}

}
