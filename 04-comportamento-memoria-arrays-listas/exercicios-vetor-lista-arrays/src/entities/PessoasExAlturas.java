package entities;

public class PessoasExAlturas {

	// ATRIBUTO
	private String nomePessoa;
	private int idadePessoa;
	private double alturaPessoa;

	// CONTRUTORES
	public PessoasExAlturas(String nomePessoa, int idadePessoa, double alturaPessoa) {
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
		this.alturaPessoa = alturaPessoa;
	}

	// GET & SET
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void SetNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public int getIdadePessoa() {
		return idadePessoa;
	}
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
	public double getAlturaPessoa() {
		return alturaPessoa;
	}
	public void setAlturaPessoa(double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}

	// METODOS
	
	
}
