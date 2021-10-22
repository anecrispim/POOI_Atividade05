package vetores;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 1;
		
		String nome[] = new String[TAM];
		int telefone[] = new int[TAM];
		int celular[] = new int[TAM];
		String email[] = new String[TAM];
		String dataN[] = new String[TAM];
		
		try {
			FileWriter arq = new FileWriter(System.getProperty("user.dir") + "\\arq.txt");
			
			PrintWriter gravarArq = new PrintWriter(arq);
	
		    gravarArq.printf("+--Contatos--+%n");
		    
			for (int i = 0; i < TAM; i++) {
				System.out.print("Digite o nome do " + (i + 1) + "º contato: ");
				nome[i] = entrada.next();
				
				System.out.print("Digite o telefone do " + (i + 1) + "º contato: ");
				telefone[i] = entrada.nextInt();
				
				System.out.print("Digite o celular do " + (i + 1) + "º contato: ");
				celular[i] = entrada.nextInt();
				
				System.out.print("Digite o e-mail do " + (i + 1) + "º contato: ");
				email[i] = entrada.next();
				
				System.out.print("Digite a Data de Nascimento do " + (i + 1) + "º contato: ");
				dataN[i] = entrada.next();
				
				gravarArq.printf("| Nome: %s |\n", nome[i]);
				gravarArq.printf("| Telefone: %d |\n", telefone[i]);
				gravarArq.printf("| Celular: %d |\n", celular[i]);
				gravarArq.printf("| email: %s |\n", email[i]);
				gravarArq.printf("| Data Nascimento: %s |\n", dataN[i]);
			}
			
			gravarArq.printf("+-------------+%n");
			
			arq.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		entrada.close();
	}

}
