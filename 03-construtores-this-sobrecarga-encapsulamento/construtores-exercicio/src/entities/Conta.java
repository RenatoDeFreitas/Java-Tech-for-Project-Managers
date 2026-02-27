package entities;

public class Conta {

	// ATRIBUTOS
	private int numeroConta;
	private String nomeCliente;
	private double saldoConta;

	// CONSTRUTOR-01 ->COMPLETO --mesmo nome da classe - 3 argumento - com deposito
	// inicial
	public Conta(int numeroConta, String nomeCliente, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		depositoValor(depositoInicial);
	}

	// CONSTRUTOR-02 -> SOBRECARGA - 2 argumentos - sem deposito inicial
	public Conta(int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}

	
	// GETTERS & SETTERS
	// get - set -> numeroConta
	public int getNumeroConta() {
		return numeroConta;
	}

	// get-set -> nomeCliente
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// get -> saldoConta - apenas leitura
	public double getSaldoConta() {
		return saldoConta;
	}

	
	// METODOS

	public void depositoValor(double valorDepositado) {
		saldoConta += valorDepositado;
	}

	public void saqueValor(double valorSacado) {
		saldoConta -= valorSacado + 5.0;
	}

	// SAIDA TELA
	public String toString() {
		return "Account: " + numeroConta 
				+ ", " 
				+ "account holder:" 
				+ nomeCliente 
				+ ", " 
				+ "Balance R$ "
				+ String.format("%.2f", saldoConta);
	}

}
