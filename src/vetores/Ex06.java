package vetores;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 20;
		
		int vetor[] = new int[TAM];
		int par[] = new int[TAM];
		int impar[] = new int[TAM];
		
		int contPar = 0;
		int contImpar = 0;
		
		System.out.println("Digite 20 números inteiros: ");
		for (int i = 0; i < TAM; i++) {
			vetor[i] = entrada.nextInt();
			
			if (vetor[i] % 2 == 0) {
				contPar++;
				par[i] = vetor[i];
			} else {
				contImpar++;
				impar[i] = vetor[i];
			}
		}
		
		int newPar[] = new int[contPar];
		int newImpar[] = new int[contImpar];
		
		int contPar2 = 0;
		int contImpar2 = 0;
		
		System.out.println("Vetor: ");
		for (int i = 0; i < TAM; i++) {
			System.out.print("| " + vetor[i] + " | ");
			
			if (par[i] != 0) {
				newPar[contPar2] = par[i];
				contPar2++;
			}
			
			if (impar[i] != 0) {
				newImpar[contImpar2] = impar[i];
				contImpar2++;
			}
		}
		
		System.out.println("\nVetor Pares: ");
		for (int i = 0; i < newPar.length; i++) {
			System.out.print(" | " + newPar[i] + " | ");
		}
		
		
		System.out.println("\nVetor Impares: ");
		for (int i = 0; i < newImpar.length; i++) {
			System.out.print(" | " + newImpar[i] + " | ");
		}
		
		entrada.close();
	}

}
