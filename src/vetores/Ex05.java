package vetores;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		char vetor[] = new char[TAM];
		List<Character> consoantes = new ArrayList<Character>();
		int cont = 0;
		
		System.out.println("Digite 10 letras: ");
		for (int i = 0; i < TAM; i++) {
			vetor[i] = entrada.next().charAt(0);
			if (vetor[i] != 'a' && vetor[i] != 'A' &&
				vetor[i] != 'e' && vetor[i] != 'E' &&
				vetor[i] != 'i' && vetor[i] != 'I' &&
				vetor[i] != 'o' && vetor[i] != 'O' &&
				vetor[i] != 'u' && vetor[i] != 'U'
			   ) 
			{
				consoantes.add(vetor[i]);
				cont++;
			}
		}
		
		System.out.println("Quantidade de consoantes: " + cont);
		System.out.println("Consoantes: ");
		consoantes.forEach(System.out::println);
		
		entrada.close();
	}

}
