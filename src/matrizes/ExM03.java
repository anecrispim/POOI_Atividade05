package matrizes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExM03 {

	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			
			final int TAMC = 3;
			
			System.out.print("Informe a quantidade de alunos: ");
			int tamL = entrada.nextInt();
			
			String alunoNota[][] = new String[tamL][TAMC];
			
			int soma[] = new int[tamL];
			float media[] = new float[tamL];
			
			int menorNota = 0;
			int maiorNota = 0;
			
			String nomeMenorN = "";
			String nomeMaiorN = "";
			
			float maiorMedia = 0;
			float menorMedia = 0;
			
			String nomeMenorM = "";
			String nomeMaiorM = "";
			
			String arqNome = System.getProperty("user.dir") + "\\arq03.txt";
			FileWriter arq = new FileWriter(arqNome);
			
			PrintWriter gravarArq = new PrintWriter(arq);
			
			for (int i = 0; i < tamL; i++) {
				System.out.print("\nInforme o nome do " + (i + 1) + "º aluno: ");
				for (int j = 0; j < TAMC; j++) {
					if (j == 0) {
						alunoNota[i][j] = entrada.next();
					} else {
						System.out.print("Informe a " + j + "º nota do aluno: ");
						alunoNota[i][j] = entrada.next();
						soma[i] = soma[i] + Integer.parseInt(alunoNota[i][j]);
						
						if (j == 1 && i == 0) {
							maiorNota = Integer.parseInt(alunoNota[i][j]);
							nomeMaiorN = alunoNota[i][0];
							menorNota = Integer.parseInt(alunoNota[i][j]);
							nomeMenorN = alunoNota[i][0];
						} else {
							if (Integer.parseInt(alunoNota[i][j]) > maiorNota) {
								maiorNota = Integer.parseInt(alunoNota[i][j]);
								nomeMaiorN = alunoNota[i][0];
							}
							
							if (Integer.parseInt(alunoNota[i][j]) < menorNota) {
								menorNota = Integer.parseInt(alunoNota[i][j]);
								nomeMenorN = alunoNota[i][0];
							}
						}
					}
				}
				
				media[i] = soma[i] / (TAMC - 1);
			}
			
			gravarArq.println("******* Relação de notas dos alunos *******\n");
			for (int i = 0; i < TAMC; i++) {
				for (int j = 0; j < tamL; j++) {
					gravarArq.printf(" | %s | ", alunoNota[j][i]);
				}
				gravarArq.print("\n");
			}
			
			gravarArq.print("\n");
			
			float somaG = 0;
			float mediaG = 0;
			
			for (int i = 0; i < tamL; i++) {
				gravarArq.println("Média do(a) " + alunoNota[i][0] + ": " + media[i]);
				
				if (i == 0) {
					maiorMedia = media[i];
					menorMedia = media[i];
					nomeMenorM = alunoNota[i][0];
					nomeMaiorM = alunoNota[i][0];
				} else {
					if (media[i] > maiorMedia) {
						maiorMedia = media[i];
						nomeMaiorM = alunoNota[i][0];
					}
					if (media[i] < menorMedia) {
						menorMedia = media[i];
						nomeMenorM = alunoNota[i][0];
					}
				}
				somaG = somaG + media[i];
			}
			
			mediaG = somaG / tamL;
			
			gravarArq.println("\nA maior nota é do(a) " + nomeMaiorN + " com: " + maiorNota);
			gravarArq.println("A menor nota é do(a) " + nomeMenorN + " com: " + menorNota);
			
			gravarArq.println("\nA maior média é do(a) " + nomeMaiorM + " com: " + maiorMedia);
			gravarArq.println("A menor média é do(a) " + nomeMenorM + " com: " + menorMedia);
			
			gravarArq.println("\nA média geral da turma é igual a: " + mediaG);
			
			gravarArq.println("\nAlunos acima da média geral: ");
			for (int i = 0; i < tamL; i++) {
				if (media[i] > mediaG) {
					
					gravarArq.print(" | " + alunoNota[i][0] + " | ");
				}
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
