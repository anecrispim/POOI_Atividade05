package matrizes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExM05 {
	
	static Scanner entrada = new Scanner(System.in);
	static Random aleatorio = new Random();
	
	public static void main(String[] args) {
		
		try {
			final int TAM = 6;
			
			int loteria[] = new int[TAM];
			
			for (int i = 0; i < TAM; i++) {
				loteria[i] = aleatorio.nextInt(60);
			}
			
			System.out.print("Informe a quantidade de cartelas: ");
			int cart = Integer.parseInt(entrada.nextLine());
			
			int cartela[][] = new int[cart][TAM];
			
			String arqNome = System.getProperty("user.dir") + "\\arq05.txt";
			FileWriter arq = new FileWriter(arqNome);
			
			PrintWriter gravarArq = new PrintWriter(arq);
			
			for (int i = 0; i < cart; i++) {
				for(int j = 0; j < TAM; j++) {
					cartela[i][j] = aleatorio.nextInt(60);
					int aux = 0;
					for(int x = 1; x < j; x++) {
						if(cartela[i][j]==cartela[i][x]) {
							aux = 1;
						}
					}
					j -= aux;
				}
				gravarArq.println();
			}
			
			for (int i = 0; i < cart; i++) {
				Arrays.sort(cartela[i]);
			}
			
			Arrays.sort(loteria);
			
			for (int i = 0; i < cart; i++) {
				gravarArq.println("Cartela " + (i + 1));
				
				gravarArq.print(" | ");
				
				int acertou = 0;
				
				for (int j = 0; j < TAM; j++) {
					gravarArq.print(cartela[i][j]);
					
					acertou = 0;
					
					if(loteria[j] == cartela[i][j]) {
						gravarArq.print(" Acertou!");
						acertou++;
					}
					gravarArq.print(" | ");
				}
				
				gravarArq.print(acertou + " acertos.\n");
			}
			
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