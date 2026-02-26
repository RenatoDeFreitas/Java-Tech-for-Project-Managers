package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class ProgramBanco {
	public static void main(String[] args) {

		// CONFIGURACOES
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Conta conta;
		

		// ENTRADA -> conta + nome
		System.out.print("Enter account number: ");
		int numeroConta = teclado.nextInt();

		System.out.print("Enter account holder: ");
		teclado.nextLine();			//limpeza buffer
		String nomeCliente = teclado.nextLine();

		// CONDICIONAL -> deposito inicial
		System.out.println("Is there initial deposit (y/n)?"); // if/else
		char existeDeposito = teclado.next().toLowerCase().charAt(0);

		// VALIDAR RESPOSTA -> initial deposit -- BARREIRA
		while (existeDeposito != 'y' && existeDeposito != 'n') {
			System.out.println();
			System.out.print("Invalid character!\nPlease, enter 'y' for yes or 'n' for no:");
			existeDeposito = teclado.next().toLowerCase().charAt(0);
		}

		if (existeDeposito == 'y') {
			System.out.println();
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = teclado.nextDouble();
			conta = new Conta(numeroConta, nomeCliente, depositoInicial); // CONSTRUTOR-01 (c/saldo)

		} else {
			System.out.println();
			conta = new Conta(numeroConta, nomeCliente); // CONSTRUTOR-02 (s/saldo)

		}

		System.out.println();
		System.out.println(conta);
		System.out.println();

		// DEPOSITO - TESTA VALOR -> SOMENTE POSITIVO
		System.out.print("Enter a deposit value: ");
		double deposito = teclado.nextDouble();
		while (deposito <= 0) {
			System.out.print("Invalid operation!\n Enter a value greater than zero:");
			deposito = teclado.nextDouble();
		}
		conta.depositoValor(deposito);

		System.out.println();
		System.out.println("Update data:");
		System.out.println(conta);

		//SAQUE - VALIDAR -> NEGATIVO
		System.out.println();
		System.out.println("Enter a whithdraw value:");
		double saque = teclado.nextDouble();
		conta.saqueValor(saque);
		
		
		System.out.println(conta);
		System.out.println("Fim");

		// INF.CONTA
		

		teclado.close();
	}

}
