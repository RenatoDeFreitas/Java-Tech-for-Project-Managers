package entities;

public class Estudantes {

	//ATRIBUTOS
	private String nome;
	private double semestre1;
	private double semestre2;
	
	//CONSTRUTOR
	public Estudantes(String nome, double semestre1, double semestre2 ) {
		this.nome = nome;
		this.semestre1 = semestre1;
		this.semestre2 = semestre2;
	}
	
	//GET & SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSemestre1() {
		return semestre1;
	}
	public void setSemestre1 (double semestre1) {
		this.semestre1 = semestre1;
	}
	
	public double getSemestre2 () {
		return semestre2;
	} 
	public void setSemestre2 (double semestre2) {
		this.semestre2 = semestre2;
	}
	//METODOS
	public double calculoMedia() {
		return (semestre1 + semestre2) /2;
	}
	
	public boolean estaAprovado() {
		return calculoMedia() >= 6.0;
				
	}
	
}
