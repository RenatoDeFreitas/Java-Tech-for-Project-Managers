import java.util.Scanner;

public class GaulaSwitchDiaSemana {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//INPUT
		System.out.print("Enter the day of the week number: ");
		int number = sc.nextInt();
		String day; 
		
//NEGOCIO
		switch (number) {
		case 1: 
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Value does not exist!";
		}
		System.out.printf("Number %d is: %s ",number, day);
		
		
		
		sc.close();

	}
}
