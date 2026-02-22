package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class ProgramRetangulo {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		//INSTACIAR -> variável retangulo do tipo retangulo (cria objeto) - comportamento retangulo
		Retangulo retangulo = new Retangulo();

		System.out.println("Cálculos Retangulo:");
		System.out.println();

		System.out.print("Valor altura: ");
		retangulo.height = teclado.nextDouble();

		System.out.print("Valor largura: ");
		retangulo.width = teclado.nextDouble();

		System.out.println();
		System.out.println(retangulo);

		teclado.close();
	}
}
