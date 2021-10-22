package vetores;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe as palavras separadas por ';': ");
		String palavras = entrada.next();
		
		
		String vetor[] = palavras.split(";");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		entrada.close();
		
	}

}
