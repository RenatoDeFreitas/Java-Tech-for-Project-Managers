package entities;			//PACOTE DA CLASSE

public class Aula_01Triangulo {			//NOME DA CLASSE

	//ATRIBUTOS DA CLASSE
	public double a;
	public double b;
	public double c;

	
	//METODOS - DEFINE O COMPORTAMENTO
	
	public double area() {			//TIPO DE DADO QUE O METODO RETORNA - "double"
		double p = (a + b + c) / 2.0;
		/*double resoult = Math.sqrt(p *(p - a) * (p - b) * (p - c));
		 "PODE RETORNAR DIRETO JÁ TRASENDO O CÁLCULO
		*/
		return Math.sqrt(p *(p - a) * (p - b) * (p - c));
		
	

	}

}
