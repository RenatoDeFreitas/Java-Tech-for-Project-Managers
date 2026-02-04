package entities;

public class Aula_01Triangulo {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.0;
		/*double resoult = Math.sqrt(p *(p - a) * (p - b) * (p - c));
		 "PODE RETORNAR DIRETO JÁ TRASENDO O CÁLCULO
		*/
		return Math.sqrt(p *(p - a) * (p - b) * (p - c));
		
	

	}

}
