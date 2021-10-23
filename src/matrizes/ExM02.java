package matrizes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExM02 {

	public static void main(String[] args) {
		
		try {
			Scanner entrada = new Scanner(System.in);
			
			final int TAM = 3;
			
			String supermercado[] = new String[TAM];
			float preco[] = new float[TAM];
			
			float somaM[] = new float[TAM];
			float maisCaro = 0;
			float maisBarato = 0;
			String nomeMaisCaro = "";
			String nomeMaisBarato = "";
			String texto = "";
			float mediaP[] = new float[TAM];
			
			String arqNome = System.getProperty("user.dir") + "\\arq02.txt";
			FileWriter arq = new FileWriter(arqNome);
			
			PrintWriter gravarArq = new PrintWriter(arq);
			
			for (int i = 0; i < TAM; i++) {
				System.out.print("Informe o nome do " + (i + 1) + "º supermercado: ");
				supermercado[i] = entrada.next();
				System.out.println("Informe os preços de 5 produtos do " + (i + 1) + "º supermercado: ");
				texto = texto + " | " + supermercado[i] + " | ";
				for (int j = 0; j < TAM; j++) {
					preco[j] = entrada.nextFloat();
					somaM[i] = somaM[i]  + preco[j];
					texto = texto + " | " + preco[j] + " | ";
				}
				texto = texto + "\n";
				mediaP[i] = somaM[i] / TAM;
				
				if (i == 0) {
					maisCaro = somaM[i];
					nomeMaisCaro = supermercado[i];
					maisBarato = somaM[i];
					nomeMaisBarato = supermercado[i];
				} else {
					if (somaM[i] > maisCaro) {
						maisCaro = somaM[i];
						nomeMaisCaro = supermercado[i];
					}
					if (somaM[i] < maisBarato) {
						maisBarato = somaM[i];
						nomeMaisBarato = supermercado[i];
					}
				}
				
			}
			
			gravarArq.println("****** Relaçao de Supermercados e Preços: ******\n");
			gravarArq.println(texto);
			
			for (int i = 0; i < TAM; i++) {
				gravarArq.println("\nSoma de preços do supermercado " + supermercado[i] + ": " + somaM[i]);
				gravarArq.println("Média de preços do supermercado " + supermercado[i] + ": " + mediaP[i]);
			}
			gravarArq.println("\nO supermercado " + nomeMaisCaro + " é o mais caro, com total de preços de: " + maisCaro);
			gravarArq.println("O supermercado " + nomeMaisBarato + " é o mais barato, com total de preços de: " + maisBarato);
			
			arq.close();
			
			FileReader arqLer = new FileReader(arqNome);
		    BufferedReader lerArq = new BufferedReader(arqLer);

		    String linha = lerArq.readLine();
		    
		    while (linha != null) {
		    	System.out.printf("%s\n", linha);

		        linha = lerArq.readLine();
		    }
		    
		    lerArq.close();
		    
			entrada.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
