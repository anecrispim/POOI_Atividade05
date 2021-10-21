package vetores;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da senha: ");
		int tamS = entrada.nextInt();
		
		final int TAM = 26;
		
		char consoantes[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'y', 'z'};
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		
		
		String senha = "";
		
		int contV = 0;
		int contC = 0;
		if (tamS <= TAM) {
			for (int i = 0; i < tamS; i++) {
				if (i % 2 == 0) {
					if (contC >= 22) {
						contC = 0;
					}
					senha = senha + consoantes[contC];
					contC++;
				} else {
					if (contV >= 5) {
						contV = 0;
					}
					senha = senha + vogais[contV];
					contV++;
				}
			}
		} else {
			System.out.println("O tamanho da senha deve ser menor ou igual a 26.");
		}
		
		System.out.println(senha);
		entrada.close();
	}

}
