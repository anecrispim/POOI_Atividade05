package matrizes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExM04 {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			
			final int TAMC = 6;
			
			System.out.print("Informe a quantidade de atletas: ");
			int tamL = entrada.nextInt();
			
			float saltosA[][] = new float[tamL][TAMC];
			
			float soma[] = new float[tamL];
			float media[] = new float[tamL];
			
			String arqNome = System.getProperty("user.dir") + "\\arq04.txt";
			FileWriter arq = new FileWriter(arqNome);
			
			PrintWriter gravarArq = new PrintWriter(arq);
			
			for (int i = 0; i < tamL; i++) {
				System.out.print("\nInforme o n�mero do " + (i + 1) + "� atleta: ");
				for (int j = 0; j < TAMC; j++) {
					if (j == 0) {
						saltosA[i][j] = entrada.nextFloat();
					} else {
						System.out.print("Informe o " + j + "� salto do atleta: ");
						saltosA[i][j] = entrada.nextFloat();
						soma[i] = soma[i] + saltosA[i][j];
					}
				}
				
				media[i] = soma[i] / (TAMC - 1);
			}
			
			gravarArq.println("\n******* Rela��o de saltos dos atletas *******\n");
			for (int i = 0; i < TAMC; i++) {
				for (int j = 0; j < tamL; j++) {
					gravarArq.printf(" | %s | ", saltosA[j][i]);
				}
				gravarArq.print("\n");
			}
			
			gravarArq.print("\n");
			
			for (int i = 0; i < tamL; i++) {
				gravarArq.println("M�dia do atleta " + saltosA[i][0] + ": " + media[i]);
				
			}
			
			float mediaCampeao = 0;
			float mediaUltimo = 0;
			for (int i = 0; i < tamL; i++) {
				if (i == 0) {
					mediaCampeao = media[i];
					mediaUltimo = media[i];
				} else {
					if (media[i] > mediaCampeao) {
						mediaCampeao = media[i];
					}
					if (media[i] < mediaUltimo) {
						mediaUltimo = media[i];
					}
				}
			}
			
			gravarArq.println("\nM�dia do campe�o: " + mediaCampeao);
			gravarArq.println("M�dia do �ltimo lugar: " + mediaUltimo);
			
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
