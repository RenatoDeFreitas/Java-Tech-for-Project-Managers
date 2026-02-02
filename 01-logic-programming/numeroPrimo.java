import java.util.Scanner;

public class numeroPrimo {
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: "); //busca primo
		int numero = teclado.nextInt();
		int cont = 0;
		
		for (int i = 1; i <= numero ; i++) {
			if (numero %i == 0 ) {
				cont++;
				System.out.println(cont);
			}
			
		}
		
		
		
		
		teclado.close();
	}
}
