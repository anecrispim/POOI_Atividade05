package vetores;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		int vetor01[] = new int[TAM];
		int vetor02[] = new int[TAM];
		int vetor03[] = new int[TAM*2];
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor do vetor 01: ");
			vetor01[i] = entrada.nextInt();
			
			System.out.print("Informe o " + (i + 1) + "º valor do vetor 02: ");
			vetor02[i] = entrada.nextInt();
		}
		
		int cont01 = 0;
		int cont02 = 0;
		for (int i = 0; i < vetor03.length; i++) {
			if (i % 2 == 0) {
				vetor03[i] = vetor01[cont01];
				cont01++;
			} else {
				vetor03[i] = vetor02[cont02];
				cont02++;
			}
		}
		
		System.out.println("Vetor 03: ");
		for (int i = 0; i < vetor03.length; i++) {
			System.out.print(" | " + vetor03[i] + " | ");
		}
		
		entrada.close();
	}

}
