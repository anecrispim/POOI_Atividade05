package vetores;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		final int TAM = entrada.nextInt();
		
		int vetor[] = new int[TAM];
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor do vetor: ");
			vetor[i] = entrada.nextInt();
			while (vetor[i] < 0 || vetor[i] > 20) {
				System.out.println("O vetor aceita apenas valores entre 0 e 20.");
				System.out.print("Informe novamente o " + (i + 1) + "º valor do vetor: ");
				vetor[i] = entrada.nextInt();
			}
		}
		
		for (int i = 0; i < TAM; i++) {
			System.out.print(vetor[i] + ":");
			for (int j = 0; j < vetor[i]; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}

}
