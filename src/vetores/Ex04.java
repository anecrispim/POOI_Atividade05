package vetores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 4;
		
		float notas[] = new float[TAM];
		
		float soma = 0;
		
		System.out.println("Digite 4 notas:");
		for (int i = 0; i < TAM; i++) {
			notas[i] = entrada.nextFloat();
			soma = soma + notas[i];
		}
		
		System.out.println("Notas: ");
		for(int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
		
		System.out.println("Média: " + soma / 4);
		
		entrada.close();
	}

}
