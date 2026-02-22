package entities;

public class Employee {

	// ATRIBUTOS
	public String nomeFuncionario;
	public double salarioBruto;
	public double taxa;

	// METODOS
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}

	public void incrementoSalario(double percentagem) {
		salarioBruto += salarioBruto * (percentagem /100);
	}
	
	public String toString(){
		return "Funcionário: "+ nomeFuncionario + "\n" + "Salário é R$: " + String.format("%.2f", salarioLiquido());
		
	}
}
