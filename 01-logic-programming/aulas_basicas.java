import java.util.Locale;

public class aulas_basicas {
	public static void main(String[] args) {

		
		int y = 32;
		double decimal = 10.35784;
		String nome = "Cláudia";
		int idade = 31; 
		double renda = 4500.35;
		
		System.out.print("Para imprimir qtd casas use 'printf' isso é '%.2f'= 2 "
				+ "casas e f de formatado e '%n' quebra de linha ");
		System.out.printf("%.3f%n", decimal);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", decimal);
		System.out.println("Resultado de y = "+ y + " e o decimal dele é " + decimal
				+ "metros");
		System.out.printf("Agora usando printf y %d -  interio e %.2f decimal%n",y, decimal);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade,renda);
	}
}
