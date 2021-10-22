package vetores;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		
		int idade[] = new int[TAM];
		float altura[] = new float[TAM];
		
		int maisVelho = 0;
		int maisNovo = 0;
		
		float maisAlto = 0;
		float maisBaixo = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite a idade da " + (i + 1) + "º pessoa: ");
			idade[i] = entrada.nextInt();
			
			System.out.print("Digite a altura da " + (i + 1) + "º pessoa: ");
			altura[i] = entrada.nextFloat();
			
			if (i == 0) {
				maisVelho = idade[i];
				maisNovo = idade[i];
				maisAlto = altura[i];
				maisBaixo = altura[i];
			} else {
				if (idade[i] > idade[i-1]) {
					maisVelho = idade[i];
				} 
				if (idade[i] < idade[i-1]) {
					maisNovo = idade[i];
				}
				
				if (altura[i] > altura[i-1]) {
					maisAlto = altura[i];
				} 
				if (altura[i] < altura[i-1]) {
					maisBaixo = altura[i];
				}
			}
		}
		
		
		
		System.out.println("\nIdade em ordem contrária: ");
		for (int i = (TAM - 1); i >= 0; i--) {
			System.out.print(" | " + idade[i] + " | ");
		}
		
		System.out.println("\nAltura em ordem contrária: ");
		for (int i = (TAM - 1); i >= 0; i--) {
			System.out.print(" | " + altura[i] + " | ");
		}
		
		
		System.out.println("\nMais Velho: " + maisVelho);
		System.out.println("Mais Novo: " + maisNovo);
		System.out.println("Mais Alto: " + maisAlto);
		System.out.println("Mais Baixo: " + maisBaixo);
		
		entrada.close();
	}

}
