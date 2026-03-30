package entities;

public class PessoasDados {

	// ATRIBUTOS
	private String nome;
	private double altura;
	private char genero;

	// CONSTRUTOR

	public PessoasDados(String nome, double altura, char genero) {
		this.nome = nome;
		this.altura = altura;
		this.genero = genero;
	}

	// GET & SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setChar(char genero) {
		this.genero = genero;
	}

	// METODOS

	
}
