package entities;

public class PessoaMaisVelho {

	//ATRIBUTO
	private String nome;
	private int idade;
	
	//CONSTRUTOR - mesmo nome da classe + referencia valor no atributo 
	public PessoaMaisVelho(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//GET & SET - formas de acessar
	public String getName() {
		return nome; 
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//METODO
	
}
