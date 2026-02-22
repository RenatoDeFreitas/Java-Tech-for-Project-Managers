package entities;

public class Retangulo {

	// ATRIBUTOS
	public double height, width;

	// METODOS
	public double Area() {
		return height * width;
	}

	public double Perimeter() {
		return 2 * (height + width);
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}

	public String toString() {
		return  "AREA = "		+ String.format( "%.2f", Area() )		+ "\n" + 
				"PERIMETRO = "	+ String.format("%.2f",Perimeter()	)	+ "\n" +
				"DIAGONAL = "	+ String.format("%.2f", Diagonal() );
	}
}
