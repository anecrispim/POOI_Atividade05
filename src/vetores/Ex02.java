package vetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		float vetor[] = new float[TAM];
		
		System.out.println("Digite 10 valores para o vetor:");
		
		for (int i = 0; i < TAM; i++) {
			vetor[i] = entrada.nextFloat();
		}
		
		for ( int i =  vetor.length - 1 ; i >= 0 ; i-- ) {
			System.out.println(vetor[i]);
		}
		
		entrada.close();
	}

}
