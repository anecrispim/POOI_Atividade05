package vetores;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAMA = 10;
		final int TAMN = 4;
		
		String alunos[] = new String[TAMA];
		float notas[] = new float[TAMN];
		float medias[] = new float[TAMA];
		
		float soma = 0;
		int contAcimaMedia = 0;
		for (int i = 0; i < TAMA; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "º Aluno: ");
			alunos[i] = entrada.next();
			
			for (int j = 0; j < TAMN; j++) {
				System.out.print("Digite a " + (j + 1) + "º Nota do aluno: ");
				notas[j] = entrada.nextFloat();
				soma = soma + notas[j];
			}
			
			medias[i] = soma / TAMN;
			
			soma = 0;
			
			if (medias[i] >= 7) {
				contAcimaMedia++;
			}
		}
		
		System.out.println("\nQuantidade de alunos com média maior ou igual a 7.0: " + contAcimaMedia);
		
		System.out.print("\nMédias: ");
		
		for (int i = 0; i < TAMA; i++) {
			System.out.print(" | " + medias[i] + " | ");
		}
		
		entrada.close();
	}

}
