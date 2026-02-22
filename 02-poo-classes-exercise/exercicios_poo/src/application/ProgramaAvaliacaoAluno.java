package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramaAvaliacaoAluno {

	public static void main(String[] args) {

		// CONFIGURACOES
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		Aluno aluno = new Aluno();

		// ENTRADAS
		System.out.print("Enter the student name: ");
		aluno.nome = teclado.nextLine();

		System.out.print("Frist semestrer grade: ");
		aluno.nota1 = teclado.nextDouble();

		System.out.print("Second semestrer grade: ");
		aluno.nota2 = teclado.nextDouble();

		System.out.print("Thrid semester grade: ");
		aluno.nota3 = teclado.nextDouble();


		// SAIDAS

		System.out.println();
		System.out.print(aluno);

		System.out.println();
		if (aluno.NotaFinal() < 60) {
			System.out.print("FAILED" + "\n" + "MISSING " + aluno.missingPoints() + " POINTS");

		} else {
			System.out.print("PASS");
		}

		teclado.close();
	}

}
