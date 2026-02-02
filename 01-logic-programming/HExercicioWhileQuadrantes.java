import java.util.Scanner;

public class HExercicioWhileQuadrantes {
	public static void main(String[] args) {

//SET
		Scanner teclado = new Scanner(System.in);

//ENTRADAS
		System.out.print("Value X: ");
		int X = teclado.nextInt();

		System.out.print("Value Y: ");
		int Y = teclado.nextInt();

		System.out.println();
		while (X != 0 && Y != 0) {
			
			if (X > 0 && Y > 0) {
				System.out.println("frist quadrant");
				System.out.printf("X = %d end Y = %d ", X, Y);
			} 
			else if (X < 0 && Y > 0) {
				System.out.println("second quadrant");
				System.out.printf("X = %d end Y = %d ", X, Y);
			}
			else if(X < 0 && Y < 0) {
				System.out.println("third quadrant");
				System.out.printf("X = %d end Y = %d ", X, Y);
			}
			else {
				System.out.println("Fourth quadrant");
				System.out.printf("X = %d end Y = %d ", X, Y);
			}
			
			System.out.println();
			System.out.print("Value X: ");
			X = teclado.nextInt();
			
			System.out.print("Value Y: ");
			Y = teclado.nextInt();
		}

		teclado.close();

//SAIDA

		System.out.println("End");
		System.out.printf("Value X: %d  e Value Y: %d ",X, Y);
	}

}
