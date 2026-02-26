package entities;

public class Produto {

	// ATRIBUTOS
	public String nome;
	public double preco;
	public int quantidade;

	/* CONTRUTOR fica depois dos atributos 
	 * antes dos métodos
	 *  
	 */
	
	//CONSTRUTOR 01  (public + nome da classe <> não tem o tipo <> dita as regras para instânciar)
	public Produto(String nome,double preco, int quantidade) {
		 this.nome = nome;
		 this.preco = preco;
		 this.quantidade = quantidade;
	}
	//CONSTRUTOR 02  (iniciar quantidade com zero)
	public Produto(String nome,double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	// APÓS construtors ENTRA -> gettes e setters  
	
	
	// METODOS
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade){
		this.quantidade += quantidade;
	}
	
	public void removeProdutos (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString(){
		return nome +", R$ "
					+ String.format("%.2f",preco) 
					+ ", "+ quantidade 
					+ " unidade, Valor total: R$ "
					+ String.format("%.2f",valorTotalEstoque()); 
		
	}
	
}
