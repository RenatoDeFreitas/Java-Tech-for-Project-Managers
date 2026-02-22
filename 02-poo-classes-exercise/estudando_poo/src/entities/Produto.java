package entities;

public class Produto {

	// ATRIBUTOS
	public String nome;
	public double preco;
	public int quantidade;

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
