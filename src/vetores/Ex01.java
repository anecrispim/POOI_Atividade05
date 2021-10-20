package vetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int vetor[] = new int[TAM];
		
		System.out.println("Digite 5 valores para o vetor:");
		
		for (int i = 0; i < TAM; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
		
		entrada.close();
	}

}
