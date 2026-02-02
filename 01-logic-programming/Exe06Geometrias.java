import java.util.Scanner;

public class Exe06Geometrias {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double triangulo, circulo, trapezio, quadrado, retangulo; 
		
		System.out.print("Valor A: ");
		Double A = teclado.nextDouble();

		System.out.print("Valor B: ");
		Double B = teclado.nextDouble();
		
		System.out.print("Valor C: ");
		Double C = teclado.nextDouble();
		
		
		triangulo = (A * C) / 2;
		circulo = Math.pow(C,2) * 3.14159;
		trapezio = ((A + B)*C)/2;
		quadrado = Math.pow(B,2);
		retangulo = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		
		teclado.close();
	}
}
