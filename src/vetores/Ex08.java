package vetores;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int vetor[] = new int[TAM];
		
		int soma = 0;
		int multiplicacao = 1;
		
		System.out.println("Digite 5 valores para o vetor:");
		for (int i = 0; i < TAM; i++) {
			vetor[i] = entrada.nextInt();
			
			soma = soma + vetor[i];
			multiplicacao = multiplicacao * vetor[i];
		}
		
		System.out.print("\nNúmeros: ");
		for (int i = 0; i < TAM; i++) {
			System.out.print(" | " + vetor[i] + " | ");
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Multiplicação: " + multiplicacao);
		
		entrada.close();
	}

}
