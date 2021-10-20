package vetores;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tam = entrada.nextInt();
		
		final int VETOR[] = new int[tam];
		
		int soma = 0;
		
		System.out.println("Informe os valores do vetor: ");
		for (int i = 0; i < tam; i++) {
			VETOR[i] = entrada.nextInt();
			soma = soma + VETOR[i];
		}
		
		float media = soma / tam;
		
		int maior = VETOR[0];
		int menor = VETOR[0];
		for (int i = 0; i < tam; i++) {
			if (i != 0) {
				if (VETOR[i] > VETOR[i - 1]) {
					maior = VETOR[i];
				}
				
				if (VETOR[i] < VETOR[i - 1]) {
					menor = VETOR[i];
				}
			}
			
			if (VETOR[i] % 2 == 0) {
				System.out.println("Pares do vetor: " + VETOR[i]);
			} else {
				System.out.println("Impares do vetor: " + VETOR[i]);
			}
			
			if (VETOR[i] >= media) {
				System.out.println("N�mero do vetor acima da m�dia: " + VETOR[i]);
			} else {
				System.out.println("N�mero do vetor abaixo da m�dia: " + VETOR[i]);
			}
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: " + media);
		System.out.println("Maior n�mero: " + maior);
		System.out.println("Menor n�mero: " + menor);
		
		entrada.close();
	}

}
