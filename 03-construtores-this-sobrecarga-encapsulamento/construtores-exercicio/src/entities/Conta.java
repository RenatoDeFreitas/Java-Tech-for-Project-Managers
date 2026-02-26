package entities;

public class Conta {
	
	//ATRIBUTOS
	private int numeroConta;
	private String nomeCliente;
	private double saldoConta;
	
	
	//CONSTRUTOR-01 ->COMPLETO  --mesmo nome da classe - 3 argumento - com deposito inicial
	public Conta(int numeroConta, String nomeCliente, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		depositoValor (depositoInicial);
	}
	//CONSTRUTOR-02 -> SOBRECARGA - 2 argumentos - sem deposito inicial
	public Conta (int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}
	
	//GETTERS & SETTERS
	//get - set -> numeroConta
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta ) {
		this.numeroConta = numeroConta;
	}
	
	//get-set -> nomeCliente
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	

	
	//METODOS
	
	
	
	public double depositoValor(double valorDepositado ){		
		return saldoConta += valorDepositado;
	}
	
	public double saqueValor(double valorSacado) {
		return  saldoConta -= valorSacado + 5;
	} 
	
		
	//SAIDA TELA
	public String toString() {
		return "Account: "
				+ numeroConta +", "
				+"account holder:"
				+ nomeCliente +", "	
				+ "Balance R$ " + String.format ("%.2f", saldoConta);
	}

}
