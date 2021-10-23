package matrizes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExM01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor inteiro impar entre 3 e 11: ");
		int tam = entrada.nextInt();
		
		while (tam < 3 || tam > 11 || tam % 2 == 0) {
			System.out.println("O valor informado é inválido.");
			System.out.print("Informe novamente um valor inteiro impar entre 3 e 11: ");
			tam = entrada.nextInt();
		}
		
		int matriz[][] = new int[tam][tam];
		
		int soma = 0;
		int maior = 0;
		int menor = 0;
		int contPar = 0;
		int contImpar = 0;
		int somaDP = 0;
		int somaDS = 0;
		for (int i = 0; i < tam; i++) {
			System.out.println("Informe os valores da " + (i + 1) + "º linha: ");
			for (int j = 0; j < tam; j++) {
				matriz[i][j] = entrada.nextInt();
				soma = soma + matriz[i][j];
				
				if (i == 0 && j == 0) {
					maior = matriz[i][j];
					menor = matriz[i][j];
				} else {
					if (matriz[i][j] > maior) {
						maior = matriz[i][j];
					} 
					if (matriz[i][j] < menor) {
						menor = matriz[i][j];
					}
				}
				
				if (matriz[i][j] % 2 == 0) {
					contPar++;
				} else {
					contImpar++;
				}
				
				if (i == j) {
					somaDP = somaDP + matriz[i][j];
				}
			}
		}
		
		double media = soma / (tam * 2);

		try {
			String arqNome = System.getProperty("user.dir") + "\\arq01.txt";
			FileWriter arq = new FileWriter(arqNome);
			
			PrintWriter gravarArq = new PrintWriter(arq);
	
		    gravarArq.printf("Soma elementos: %d \n", soma);
		    gravarArq.printf("Media elementos: %f \n", media);
		    gravarArq.printf("Maior elementos: %d \n", maior);
		    gravarArq.printf("Menor elementos: %d \n", menor);
		    gravarArq.printf("Qtd pares: %d \n", contPar);
		    gravarArq.printf("Qtd impares: %d \n", contImpar);
		    gravarArq.printf("Soma DP: %d \n", somaDP);
		    gravarArq.printf("Soma DS: %d \n\n", somaDS);
			
		    gravarArq.print("Matriz: \n\n");
		    for (int i = 0; i < tam; i++) {
				for (int j = 0; j < tam; j++) {
					gravarArq.printf(" | %d | ", matriz[j][i]);
				}
				gravarArq.print("\n");
			}
			
		    arq.close();
		    
		    FileReader arqLer = new FileReader(arqNome);
		    BufferedReader lerArq = new BufferedReader(arqLer);

		    String linha = lerArq.readLine(); // lê a primeira linha
		    
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
		    while (linha != null) {
		    	System.out.printf("%s\n", linha);

		        linha = lerArq.readLine(); // lê da segunda até a última linha
		    }
		    
		    lerArq.close();
		    
		} catch (Exception ex) {
			System.out.println(ex);
		}
		entrada.close();
	}

}
