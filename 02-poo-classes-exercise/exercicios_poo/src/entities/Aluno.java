package entities;

public class Aluno {
	
	//ATRIBUTOS
	public String nome;
	public double nota1, nota2, nota3;
	
	//METODOS
	public double NotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if (NotaFinal() < 60) {
			return 60 - NotaFinal();
			
		}
		else {
			return 0.0;
			
		}
	}
	
	public String toString() {
		return "Name: " + nome + "\n"
				+ "Final grade: " 
				+ String.format("%.2f", NotaFinal());
		}
}
