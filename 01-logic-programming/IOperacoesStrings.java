
public class IOperacoesStrings {
	public static void main(String[] args) {
		
		String original = "abcde FGHI ABCD abc DEFG    ";
		String  s01 = original.toLowerCase();			//MINUSCULA
		String  s02 = original.toUpperCase();			//MAIUSCULA
		String  s03 = original.trim();			//RETIRA ESPACO 
		String  s04 = original.substring(2);			//RETIRA ESPACO 
		String  s05 = original.substring(2, 9);			//RETIRA ESPACO 
		String  s06 = original.replace('a', 'x');			//RETIRA ESPACO 
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "Renato Freitas Gualberto";
		
		String [] vect = s.split(" ");
		/* Comentário de bloco: abaixo o 
		 * uso do split que é feito para 
		 * "fatiar" sua String.
		 */
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		System.out.println("Original: "+ s01 + "-");
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
	}
}
