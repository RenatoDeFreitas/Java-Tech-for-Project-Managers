package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		

		// INSTANCIAR - criar objeto
		Employee funcionario = new Employee();

		
		//ENTRADA USUARIO
		System.out.print("Nome funcionário: ");
		funcionario.nomeFuncionario = teclado.nextLine();
		
		System.out.print("Salário bruto: R$ ");
		funcionario.salarioBruto = teclado.nextDouble();
		
		System.out.print("Taxa: R$ ");
		funcionario.taxa = teclado.nextDouble();
		
		//SAIDA 1 -> ANTES DO INCREMENTO
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		
		System.out.print("Deseja incrementar o salário? (sim  1 / não = 0) ");
		int resposta = teclado.nextInt();
		 
		System.out.println();
		if (resposta == 1) {
			System.out.print("Qual a percentage de incremento de salário? ");
			
			double percentagem = teclado.nextDouble();
			funcionario.incrementoSalario(percentagem);
			
			//SAIDA 2 ->DEPOIS DO INCREMENTO
			System.out.println();
			System.out.println("ATUALIZAÇÃO\n" + funcionario);
			System.out.println("Fim!");
			
		}else {
			System.out.println("Os dados permanecem:\n " + funcionario);
			System.out.println("Fim!");
			
		}
		
		
		
		
		
		
		/*System.out.println(funcionario.nomeFuncionario);
		System.out.println( funcionario.salarioBruto);
		System.out.println( funcionario.taxa);
		System.out.println(resposta);
		System.out.println();
		*/
		
		
		
		
		
		
		teclado.close();

	}

}
