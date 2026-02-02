import java.util.Scanner;

public class Exe03DiferencaProdutos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B , C, D, resposta;

		System.out.println("Digite somente valores inteiros.🔢: ");
		System.out.println();

		System.out.println("Valor A: ");
		A = sc.nextInt();
		System.out.println("Valor B: ");
		B = sc.nextInt();
		System.out.println("Valor C: ");
		C = sc.nextInt();
		System.out.println("Valor D: ");
		D = sc.nextInt();
		
		resposta = (A * B - C * D);
		
		
		System.out.printf("DIFERENÇA: (%d * %d) - (%d * %d) = %d", A, B,C,D,resposta);
		
	
		
		sc.close();

	}

}
