package vetores;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 30;
		
		int idade[] = new int[TAM];
		float altura[] = new float[TAM];
		
		float soma = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite a idade da " + (i + 1) + "º pessoa: ");
			idade[i] = entrada.nextInt();
			
			System.out.print("Digite a altura da " + (i + 1) + "º pessoa: ");
			altura[i] = entrada.nextFloat();
			
			soma = soma + altura[i];
		}
		
		float media = soma / TAM;
		
		int cont = 0;
		for (int i = 0; i < TAM; i++) {
			if (idade[i] > 13 && altura[i] > media) {
				cont++;
			}
		}
		
		System.out.println("Média de altura dos alunos: " + media);
		System.out.println("Quantidade de alunos com altura superior a média: " + cont);
		
		entrada.close();
		
	}

}
