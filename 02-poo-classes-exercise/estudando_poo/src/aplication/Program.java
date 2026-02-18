package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Aula_01Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		//VARIAVEIS DA CLASSE TRIANGULO
		Aula_01Triangulo x, y; 				// VARIAVEL TRIANGULO X E VARIAVEL TRINAGULO Y
		x = new Aula_01Triangulo();			//INSTANCIAR P/DAR "VIDA" 
		y = new Aula_01Triangulo();
		
		System.out.println("Entre com as medidas dos Triângulos X e Y.");
		
		//ESCOLHA DE QUAL ATRIBUTO ACESSAR
		System.out.print("Valor xA: ");
		x.a = teclado.nextDouble();				
		
		System.out.print("Valor xB: ");
		x.b = teclado.nextDouble();
		
		System.out.print("Valor xC: ");
		x.c = teclado.nextDouble();
		
		System.out.print("Valor yA: ");
		y.a = teclado.nextDouble();
		
		System.out.print("Valor yB: ");
		y.b = teclado.nextDouble();
		
		System.out.print("Valor yC: ");
		y.c = teclado.nextDouble();

		
		/*CALCULO DA AREA USANDO O METODO DA CLASSE 
		 * 		COMPORTAMENTO DO OBJETO TRIANGULO 
		 * 				CHAMA A "FUNCAO" - [ METODO ] PARA SER FEITO O CALCULO
		*/
		double areaX = x.area();
		double areaY = y.area();
		
		//MOSTRA VALOR
		System.out.printf("AREA X: %.2f%n ", areaX );
		System.out.printf("AREA Y: %.2f%n ", areaY );
		
		//REGRA RESULTADO FINAL
		if (areaX > areaY) {
			System.out.println("X é maior.");
		}else { 
			System.out.println("Y é maior.");
		}
		
		teclado.close();
	}

}
