package vetores;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o texto: ");
		String texto = entrada.nextLine();
		
		System.out.println(texto);
		System.out.println("Vetor caracteres do texto: ");
		for (int i = 0; i < texto.length(); i++) {
			System.out.print(" | " + texto.charAt(i) + " | ");
		}
		
		entrada.close();
	}

}
