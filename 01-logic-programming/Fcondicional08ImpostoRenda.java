import java.util.Scanner;
import java.util.Locale;

public class Fcondicional08ImpostoRenda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

//entrada + variáveis

		System.out.print("Enter the salary amount: ");
		double salary = teclado.nextDouble();
		double tax = 0.0;
		double totalSalary = salary;

// LOGICA

		if (salary <= 0.0) {
			System.out.print("Don't get discouraged! Keep going!\n");
		}
		else if(salary <= 2000.00) {				//ISENTO DE IMPOSTO
			tax = 0.00;
		}
		else if(salary <= 3000.00) {				//IMPOSTO: 8% 
			tax = (salary -2000.00) * 0.08 ;
		}
		else if(salary <= 4500.00) {				//IMPOSTO: 18%
			tax = (salary -3000.00) * 0.18 + (1000 * 0.08) ;
		}
		else {										//IMPOSTO: 28% 
			tax = (salary - 4500.00) * 0.28 + (1500.00 * 0.18) + ( 1000.00 * 0.08); 
		}

		teclado.close();
		totalSalary -=  tax ;
		
//SAIDA USUÁRIO
		
		System.out.printf("For a salary: R$ %.2f you pay R$ %.2f in tax.%n "
				+ "Your total salary is R$ %.2f ", salary, tax, totalSalary);
		
	
	

	}
}
